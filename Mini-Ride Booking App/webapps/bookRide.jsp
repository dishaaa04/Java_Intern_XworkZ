<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book a Ride - RideShare</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #667eea, #764ba2);
            color: #333;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-container {
            background: #fff;
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
            max-width: 500px;
            width: 100%;
        }

        h2 {
            text-align: center;
            color: #4f46e5;
            margin-bottom: 30px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: 600;
            color: #444;
        }

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 12px;
            margin-bottom: 20px;
            border: 2px solid #e0e0e0;
            border-radius: 8px;
            font-size: 14px;
        }

        input[type="submit"] {
            width: 100%;
            background: #4f46e5;
            color: white;
            padding: 14px;
            border: none;
            border-radius: 8px;
            font-size: 16px;
            font-weight: 600;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        input[type="submit"]:hover {
            background: #4338ca;
        }

        .note {
            font-size: 13px;
            color: #777;
            text-align: center;
        }
    </style>
</head>
<body>

<div class="form-container">
    <h2>Book Your Ride</h2>
    <form action="success.jsp" method="post">
        <label for="customerName">Your Name</label>
        <input type="text" id="customerName" name="customerName" required>

        <label for="pickupLocation">Pickup Location</label>
        <input type="text" id="pickupLocation" name="pickupLocation" required>

        <label for="dropoffLocation">Drop-off Location</label>
        <input type="text" id="dropoffLocation" name="dropoffLocation" required>

        <label for="bookingId">Booking ID (4-digit)</label>
        <input type="number" id="bookingId" name="bookingId" min="1000" max="9999" required>

        <label for="fare">Estimated Fare (₹)</label>
        <input type="number" id="fare" name="fare" step="1" required>

        <input type="submit" value="Confirm Booking">
    </form>
    <p class="note">You'll be redirected to confirmation page after booking.</p>
</div>

</body>
</html>
