<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>RideShare - Book Your Ride</title>
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
        }

        .app-container {
            background: white;
            border-radius: 20px;
            box-shadow: 0 20px 40px rgba(0, 0, 0, 0.1);
            padding: 40px;
            max-width: 450px;
            width: 100%;
            position: relative;
            overflow: hidden;
        }

        .app-container::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            height: 4px;
            background: linear-gradient(90deg, #667eea, #764ba2);
        }

        .header {
            text-align: center;
            margin-bottom: 30px;
        }

        .logo {
            width: 60px;
            height: 60px;
            background: linear-gradient(135deg, #667eea, #764ba2);
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            margin: 0 auto 15px;
            color: white;
            font-size: 24px;
            font-weight: bold;
        }

        h1 {
            color: #333;
            font-size: 28px;
            margin-bottom: 5px;
        }

        .subtitle {
            color: #666;
            font-size: 16px;
        }

        .form-group {
            margin-bottom: 25px;
            position: relative;
        }

        .form-group label {
            display: block;
            color: #555;
            font-weight: 600;
            margin-bottom: 8px;
            font-size: 14px;
        }

        .input-wrapper {
            position: relative;
        }

        .input-icon {
            position: absolute;
            left: 15px;
            top: 50%;
            transform: translateY(-50%);
            color: #999;
            font-size: 18px;
        }

        input[type="text"] {
            width: 100%;
            padding: 15px 15px 15px 45px;
            border: 2px solid #e1e5e9;
            border-radius: 12px;
            font-size: 16px;
            transition: all 0.3s ease;
            background: #fafbfc;
        }

        input[type="text"]:focus {
            outline: none;
            border-color: #667eea;
            background: white;
            box-shadow: 0 0 0 3px rgba(102, 126, 234, 0.1);
        }

        .ride-options {
            display: grid;
            grid-template-columns: 1fr 1fr;
            gap: 15px;
            margin-bottom: 25px;
        }

        .ride-option {
            padding: 15px;
            border: 2px solid #e1e5e9;
            border-radius: 12px;
            text-align: center;
            cursor: pointer;
            transition: all 0.3s ease;
            background: #fafbfc;
        }

        .ride-option:hover {
            border-color: #667eea;
            background: white;
        }

        .ride-option.selected {
            border-color: #667eea;
            background: linear-gradient(135deg, #667eea, #764ba2);
            color: white;
        }

        .ride-option .option-title {
            font-weight: 600;
            margin-bottom: 5px;
        }

        .ride-option .option-price {
            font-size: 14px;
            opacity: 0.8;
        }

        .book-btn {
            width: 100%;
            padding: 16px;
            background: linear-gradient(135deg, #667eea, #764ba2);
            color: white;
            border: none;
            border-radius: 12px;
            font-size: 18px;
            font-weight: 600;
            cursor: pointer;
            transition: all 0.3s ease;
            position: relative;
            overflow: hidden;
        }

        .book-btn:hover {
            transform: translateY(-2px);
            box-shadow: 0 10px 20px rgba(102, 126, 234, 0.3);
        }

        .book-btn:active {
            transform: translateY(0);
        }

        .eta-info {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background: #f8f9fa;
            padding: 15px;
            border-radius: 12px;
            margin-bottom: 25px;
        }

        .eta-info .info-item {
            text-align: center;
        }

        .eta-info .info-value {
            font-weight: 600;
            color: #333;
            font-size: 16px;
        }

        .eta-info .info-label {
            color: #666;
            font-size: 12px;
            text-transform: uppercase;
            letter-spacing: 0.5px;
        }

        @media (max-width: 480px) {
            .app-container {
                padding: 30px 20px;
            }

            .ride-options {
                grid-template-columns: 1fr;
            }
        }
    </style>
</head>
<body>
<div class="app-container">
    <div class="header">
        <div class="logo">🚗</div>
        <h1>RideShare</h1>
        <p class="subtitle">Your ride, your way</p>
    </div>

    <form action="bookRide" method="post">
        <div class="form-group">
            <label for="customerName">Your Name</label>
            <div class="input-wrapper">
                <span class="input-icon">👤</span>
                <input type="text" id="customerName" name="customerName" placeholder="Enter your full name" required>
            </div>
        </div>

        <div class="form-group">
            <label for="pickupLocation">Pickup Location</label>
            <div class="input-wrapper">
                <span class="input-icon">📍</span>
                <input type="text" id="pickupLocation" name="pickupLocation" placeholder="Where are you?" required>
            </div>
        </div>

        <div class="form-group">
            <label for="dropoffLocation">Drop-off Location</label>
            <div class="input-wrapper">
                <span class="input-icon">🏁</span>
                <input type="text" id="dropoffLocation" name="dropoffLocation" placeholder="Where to?" required>
            </div>
        </div>

        <div class="eta-info">
            <div class="info-item">
                <div class="info-value">3-5 min</div>
                <div class="info-label">Pickup ETA</div>
            </div>
            <div class="info-item">
                <div class="info-value">$12-15</div>
                <div class="info-label">Estimated Fare</div>
            </div>
            <div class="info-item">
                <div class="info-value">15 min</div>
                <div class="info-label">Trip Duration</div>
            </div>
        </div>

        <div class="ride-options">
            <div class="ride-option selected" onclick="selectRideOption(this)">
                <div class="option-title">🚗 Standard</div>
                <div class="option-price">$12</div>
            </div>
            <div class="ride-option" onclick="selectRideOption(this)">
                <div class="option-title">⭐ Premium</div>
                <div class="option-price">$18</div>
            </div>
        </div>

        <button type="submit" class="book-btn">
            Book Your Ride
        </button>
    </form>
</div>

<script>
    function selectRideOption(option) {
        // Remove selected class from all options
        document.querySelectorAll('.ride-option').forEach(opt => {
            opt.classList.remove('selected');
        });

        // Add selected class to clicked option
        option.classList.add('selected');
    }

    // Add some interactivity
    document.addEventListener('DOMContentLoaded', function() {
        const inputs = document.querySelectorAll('input[type="text"]');

        inputs.forEach(input => {
            input.addEventListener('focus', function() {
                this.parentElement.parentElement.style.transform = 'translateY(-2px)';
            });

            input.addEventListener('blur', function() {
                this.parentElement.parentElement.style.transform = 'translateY(0)';
            });
        });
    });
</script>
</body>
</html>