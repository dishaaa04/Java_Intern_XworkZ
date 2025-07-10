<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Random" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>

<%-- Fetch form values from request and set attributes for EL --%>
<%
String customerName = request.getParameter("customerName");
String pickupLocation = request.getParameter("pickupLocation");
String dropoffLocation = request.getParameter("dropoffLocation");
String bookingId = request.getParameter("bookingId");
String fare = request.getParameter("fare");

pageContext.setAttribute("customerName", customerName);
pageContext.setAttribute("pickupLocation", pickupLocation);
pageContext.setAttribute("dropoffLocation", dropoffLocation);
pageContext.setAttribute("bookingId", bookingId);
pageContext.setAttribute("fare", fare);
%>

<%-- Generate driver and trip data dynamically --%>
<%
String[] drivers = {"Rajesh Kumar", "Priya Sharma", "Amit Singh", "Kavya Reddy", "Suresh Patel"};
String[] vehicles = {"Maruti Swift", "Hyundai i20", "Honda City", "Toyota Etios", "Maruti Dzire"};
String[] ratings = {"4.8", "4.9", "4.7", "4.6", "4.9"};
String[] plateNumbers = {"KA-01-AB-1234", "KA-02-CD-5678", "KA-03-EF-9012", "KA-04-GH-3456", "KA-05-IJ-7890"};

Random random = new Random();
int driverIndex = random.nextInt(drivers.length);

String selectedDriver = drivers[driverIndex];
String selectedVehicle = vehicles[driverIndex];
String selectedRating = ratings[driverIndex];
String selectedPlate = plateNumbers[driverIndex];
String driverInitial = selectedDriver.substring(0, 1);

// ETA
SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
Calendar cal = Calendar.getInstance();
cal.add(Calendar.MINUTE, 3 + random.nextInt(5)); // 3–7 mins ETA
String estimatedArrival = timeFormat.format(cal.getTime());

// Trip duration
int tripDuration = 12 + random.nextInt(18); // 12–30 mins

// Set attributes for use in EL
pageContext.setAttribute("selectedDriver", selectedDriver);
pageContext.setAttribute("selectedVehicle", selectedVehicle);
pageContext.setAttribute("selectedRating", selectedRating);
pageContext.setAttribute("selectedPlate", selectedPlate);
pageContext.setAttribute("driverInitial", driverInitial);
pageContext.setAttribute("estimatedArrival", estimatedArrival);
pageContext.setAttribute("tripDuration", tripDuration);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>RideShare - Booking Confirmed</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 20px;
            animation: fadeIn 0.8s ease-out;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(20px); }
            to { opacity: 1; transform: translateY(0); }
        }

        .confirmation-container {
            background: white;
            border-radius: 20px;
            box-shadow: 0 25px 50px rgba(0, 0, 0, 0.15);
            padding: 40px;
            max-width: 550px;
            width: 100%;
            text-align: center;
            position: relative;
            overflow: hidden;
        }

        .confirmation-container::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            height: 4px;
            background: linear-gradient(90deg, #10b981, #059669);
        }

        .success-icon {
            width: 80px;
            height: 80px;
            background: linear-gradient(135deg, #10b981, #059669);
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            margin: 0 auto 20px;
            animation: bounceIn 0.6s ease-out 0.3s both;
            position: relative;
        }

        .success-icon::after {
            content: '✓';
            color: white;
            font-size: 32px;
            font-weight: bold;
        }

        .success-icon::before {
            content: '';
            position: absolute;
            width: 100px;
            height: 100px;
            border: 3px solid #10b981;
            border-radius: 50%;
            opacity: 0.3;
            animation: pulse 2s infinite;
        }

        @keyframes bounceIn {
            0% { transform: scale(0.3); opacity: 0; }
            50% { transform: scale(1.05); }
            70% { transform: scale(0.9); }
            100% { transform: scale(1); opacity: 1; }
        }

        @keyframes pulse {
            0% { transform: scale(1); opacity: 0.3; }
            50% { transform: scale(1.1); opacity: 0.1; }
            100% { transform: scale(1.2); opacity: 0; }
        }

        .confirmation-title {
            color: #333;
            font-size: 32px;
            font-weight: 700;
            margin-bottom: 10px;
            animation: slideUp 0.6s ease-out 0.5s both;
        }

        .confirmation-subtitle {
            color: #059669;
            font-size: 18px;
            font-weight: 600;
            margin-bottom: 30px;
            animation: slideUp 0.6s ease-out 0.7s both;
        }

        @keyframes slideUp {
            from { opacity: 0; transform: translateY(20px); }
            to { opacity: 1; transform: translateY(0); }
        }

        .status-badge {
            display: inline-flex;
            align-items: center;
            gap: 8px;
            background: #dcfce7;
            color: #059669;
            padding: 12px 20px;
            border-radius: 25px;
            font-weight: 600;
            margin-bottom: 20px;
            animation: slideUp 0.6s ease-out 1.3s both;
            position: relative;
            overflow: hidden;
        }

        .status-badge::before {
            content: '';
            position: absolute;
            top: 0;
            left: -100%;
            width: 100%;
            height: 100%;
            background: linear-gradient(90deg, transparent, rgba(255,255,255,0.3), transparent);
            transition: left 0.6s;
        }

        .status-badge:hover::before {
            left: 100%;
        }

        .success-message {
            color: #666;
            font-size: 16px;
            margin-bottom: 30px;
            animation: slideUp 0.6s ease-out 0.9s both;
        }

        .driver-info {
            background: linear-gradient(135deg, #f8f9ff, #fff);
            border: 2px solid #e6e8ff;
            border-radius: 16px;
            padding: 20px;
            margin-bottom: 20px;
            animation: slideUp 0.6s ease-out 1.7s both;
            position: relative;
            overflow: hidden;
        }

        .driver-info::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            height: 2px;
            background: linear-gradient(90deg, #667eea, #764ba2);
        }

        .driver-card {
            display: flex;
            align-items: center;
            gap: 15px;
        }

        .driver-avatar {
            width: 55px;
            height: 55px;
            background: linear-gradient(135deg, #667eea, #764ba2);
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            color: white;
            font-weight: bold;
            font-size: 20px;
            position: relative;
            box-shadow: 0 4px 12px rgba(102, 126, 234, 0.3);
        }

        .driver-avatar::after {
            content: '';
            position: absolute;
            bottom: 2px;
            right: 2px;
            width: 12px;
            height: 12px;
            background: #10b981;
            border-radius: 50%;
            border: 2px solid white;
        }

        .driver-details {
            flex: 1;
        }

        .driver-details h4 {
            color: #333;
            margin-bottom: 5px;
            font-size: 18px;
        }

        .driver-details p {
            color: #666;
            font-size: 14px;
            display: flex;
            align-items: center;
            gap: 8px;
        }

        .vehicle-info {
            text-align: right;
        }

        .vehicle-info .vehicle-number {
            color: #333;
            font-weight: 600;
            font-size: 16px;
        }

        .vehicle-info .vehicle-model {
            color: #666;
            font-size: 14px;
        }

        .booking-details {
            background: #f8fffe;
            border: 2px solid #e6fffa;
            border-radius: 16px;
            padding: 30px;
            margin-bottom: 30px;
            text-align: left;
            animation: slideUp 0.6s ease-out 1.1s both;
        }

        .detail-row {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 15px 0;
            border-bottom: 1px solid #e6fffa;
            transition: background-color 0.3s ease;
        }

        .detail-row:hover {
            background-color: #f0fdf4;
            margin: 0 -15px;
            padding: 15px 15px;
            border-radius: 8px;
        }

        .detail-row:last-child {
            border-bottom: none;
        }

        .detail-label {
            color: #666;
            font-weight: 500;
            display: flex;
            align-items: center;
            gap: 8px;
            font-size: 15px;
        }

        .detail-value {
            color: #333;
            font-weight: 600;
            font-size: 16px;
        }

        .booking-id {
            background: linear-gradient(135deg, #667eea, #764ba2);
            color: white;
            padding: 6px 14px;
            border-radius: 20px;
            font-size: 14px;
            font-weight: 600;
        }

        .fare-amount {
            color: #059669;
            font-size: 20px;
            font-weight: 700;
        }

        .action-buttons {
            display: flex;
            gap: 15px;
            animation: slideUp 0.6s ease-out 1.5s both;
        }

        .btn {
            flex: 1;
            padding: 16px 24px;
            border: none;
            border-radius: 12px;
            font-size: 16px;
            font-weight: 600;
            cursor: pointer;
            transition: all 0.3s ease;
            text-decoration: none;
            display: inline-block;
            text-align: center;
            position: relative;
            overflow: hidden;
        }

        .btn::before {
            content: '';
            position: absolute;
            top: 0;
            left: -100%;
            width: 100%;
            height: 100%;
            background: linear-gradient(90deg, transparent, rgba(255,255,255,0.2), transparent);
            transition: left 0.5s;
        }

        .btn:hover::before {
            left: 100%;
        }

        .btn-primary {
            background: linear-gradient(135deg, #667eea, #764ba2);
            color: white;
        }

        .btn-primary:hover {
            transform: translateY(-2px);
            box-shadow: 0 10px 20px rgba(102, 126, 234, 0.3);
        }

        .btn-secondary {
            background: #f8f9fa;
            color: #666;
            border: 2px solid #e9ecef;
        }

        .btn-secondary:hover {
            background: #e9ecef;
            transform: translateY(-1px);
        }

        .trip-timeline {
            background: #f8f9ff;
            border: 2px solid #e6e8ff;
            border-radius: 16px;
            padding: 20px;
            margin-bottom: 20px;
            animation: slideUp 0.6s ease-out 1.9s both;
        }

        .timeline-item {
            display: flex;
            align-items: center;
            gap: 15px;
            margin-bottom: 15px;
        }

        .timeline-item:last-child {
            margin-bottom: 0;
        }

        .timeline-dot {
            width: 12px;
            height: 12px;
            border-radius: 50%;
            background: #10b981;
            position: relative;
        }

        .timeline-dot.pending {
            background: #e5e7eb;
        }

        .timeline-dot::after {
            content: '';
            position: absolute;
            top: 12px;
            left: 50%;
            width: 2px;
            height: 30px;
            background: #e5e7eb;
            transform: translateX(-50%);
        }

        .timeline-item:last-child .timeline-dot::after {
            display: none;
        }

        .timeline-content {
            flex: 1;
        }

        .timeline-title {
            color: #333;
            font-weight: 600;
            font-size: 14px;
        }

        .timeline-time {
            color: #666;
            font-size: 12px;
        }

        .rating-section {
            background: #fff7ed;
            border: 2px solid #fed7aa;
            border-radius: 16px;
            padding: 20px;
            margin-bottom: 20px;
            animation: slideUp 0.6s ease-out 2.1s both;
        }

        .rating-section h3 {
            color: #333;
            margin-bottom: 15px;
            font-size: 18px;
        }

        .stars {
            display: flex;
            gap: 5px;
            justify-content: center;
            margin-bottom: 15px;
        }

        .star {
            font-size: 24px;
            color: #d1d5db;
            cursor: pointer;
            transition: color 0.2s ease;
        }

        .star:hover,
        .star.active {
            color: #f59e0b;
        }

        .feedback-text {
            width: 100%;
            padding: 12px;
            border: 2px solid #e5e7eb;
            border-radius: 8px;
            font-size: 14px;
            resize: vertical;
            min-height: 60px;
        }

        .feedback-text:focus {
            outline: none;
            border-color: #667eea;
        }

        @media (max-width: 480px) {
            .confirmation-container {
                padding: 30px 20px;
            }

            .action-buttons {
                flex-direction: column;
            }

            .driver-card {
                flex-direction: column;
                text-align: center;
            }

            .vehicle-info {
                margin-left: 0;
                text-align: center;
            }
        }
    </style>
</head>
<body>
<div class="confirmation-container">
    <div class="success-icon"></div>

    <h1 class="confirmation-title">Booking Confirmed!</h1>
    <p class="confirmation-subtitle">Thank you, ${customerName}!</p>

    <div class="status-badge">
        🚗 Driver is on the way
    </div>

    <p class="success-message">
        Your ride has been booked successfully. Your driver will arrive shortly.
    </p>

    <div class="driver-info">
        <div class="driver-card">
            <div class="driver-avatar">${driverInitial}</div>
            <div class="driver-details">
                <h4>${selectedDriver}</h4>
                <p>⭐ ${selectedRating} rating • <span id="arrival-time">3 min away</span></p>
            </div>
            <div class="vehicle-info">
                <div class="vehicle-number">${selectedPlate}</div>
                <div class="vehicle-model">${selectedVehicle}</div>
            </div>
        </div>
    </div>

    <div class="trip-timeline">
        <h3 style="margin-bottom: 15px; color: #333;">Trip Timeline</h3>
        <div class="timeline-item">
            <div class="timeline-dot"></div>
            <div class="timeline-content">
                <div class="timeline-title">Ride Booked</div>
                <div class="timeline-time">Just now</div>
            </div>
        </div>
        <div class="timeline-item">
            <div class="timeline-dot pending"></div>
            <div class="timeline-content">
                <div class="timeline-title">Driver Arriving</div>
                <div class="timeline-time">ETA: ${estimatedArrival}</div>
            </div>
        </div>
        <div class="timeline-item">
            <div class="timeline-dot pending"></div>
            <div class="timeline-content">
                <div class="timeline-title">Trip Complete</div>
                <div class="timeline-time">Est. ${tripDuration} minutes</div>
            </div>
        </div>
    </div>

    <div class="booking-details">
        <div class="detail-row">
            <span class="detail-label">
                📍 Pickup Location
            </span>
            <span class="detail-value">${pickupLocation}</span>
        </div>
        <div class="detail-row">
            <span class="detail-label">
                🏁 Drop-off Location
            </span>
            <span class="detail-value">${dropoffLocation}</span>
        </div>
        <div class="detail-row">
            <span class="detail-label">
                🆔 Booking ID
            </span>
            <span class="booking-id">#RS${bookingId}</span>
        </div>
        <div class="detail-row">
            <span class="detail-label">
                💰 Estimated Fare
            </span>
            <span class="detail-value fare-amount">₹${fare}</span>
        </div>
        <div class="detail-row">
            <span class="detail-label">
                🕒 Pickup Time
            </span>
            <span class="detail-value">${estimatedArrival}</span>
        </div>
        <div class="detail-row">
            <span class="detail-label">
                ⏱️ Trip Duration
            </span>
            <span class="detail-value">${tripDuration} minutes</span>
        </div>
    </div>

    <div class="action-buttons">
        <a href="#" class="btn btn-secondary" id="track-btn">Track Driver</a>
        <a href="bookRide.jsp" class="btn btn-primary">Book Another Ride</a>
    </div>
</div>

<script>
    document.addEventListener('DOMContentLoaded', function() {
        let arrivalMinutes = 3;

        // Update arrival time countdown
        const arrivalTimeElement = document.getElementById('arrival-time');
        const updateArrivalTime = () => {
            if (arrivalMinutes > 0) {
                arrivalTimeElement.textContent = arrivalMinutes + ' min away';
                arrivalMinutes--;
            } else {
                arrivalTimeElement.textContent = 'Driver has arrived!';
                arrivalTimeElement.style.color = '#10b981';
                arrivalTimeElement.style.fontWeight = 'bold';

                // Update status badge
                const statusBadge = document.querySelector('.status-badge');
                statusBadge.innerHTML = '🎉 Driver has arrived!';
                statusBadge.style.background = '#dcfce7';
                statusBadge.style.color = '#059669';

                // Update timeline
                const pendingDots = document.querySelectorAll('.timeline-dot.pending');
                if (pendingDots.length > 0) {
                    pendingDots[0].classList.remove('pending');
                }
            }
        };

        // Update every 60 seconds
        setInterval(updateArrivalTime, 60000);

        // Status badge updates
        setTimeout(function() {
            const statusBadge = document.querySelector('.status-badge');
            statusBadge.innerHTML = '🚗 Driver arriving in 2 minutes';
            statusBadge.style.background = '#fef3c7';
            statusBadge.style.color = '#d97706';
        }, 5000);

        // Track driver button
        document.getElementById('track-btn').addEventListener('click', function(e) {
            e.preventDefault();

            // Show tracking simulation
            const trackingInfo = document.createElement('div');
            trackingInfo.style.cssText = `
                position: fixed;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                background: white;
                padding: 30px;
                border-radius: 15px;
                box-shadow: 0 20px 40px rgba(0,0,0,0.3);
                z-index: 1000;
                text-align: center;
                max-width: 300px;
            `;

            trackingInfo.innerHTML = `
                <h3 style="margin-bottom: 15px; color: #333;">Driver Location</h3>
                <div style="width: 200px; height: 150px; background: #f3f4f6; border-radius: 10px; margin: 0 auto 15px; display: flex; align-items: center; justify-content: center; color: #666;">
                    🗺️ Map View<br>
                    <small>Driver is 2.3 km away</small>
                </div>
                <button onclick="this.parentElement.remove()" style="background: #667eea; color: white; border: none; padding: 10px 20px; border-radius: 8px; cursor: pointer;">Close</button>
            `;

            document.body.appendChild(trackingInfo);
        });

        // Add subtle animations on hover
        document.querySelectorAll('.detail-row').forEach(row => {
            row.addEventListener('mouseenter', function() {
                this.style.transform = 'translateX(5px)';
            });

            row.addEventListener('mouseleave', function() {
                this.style.transform = 'translateX(0)';
            });
        });
    });
</script>
</body>
</html>