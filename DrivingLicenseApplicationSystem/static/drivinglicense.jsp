<!DOCTYPE html>
<html>
<head>
    <title>Driving License Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .form-container {
            background-color: white;
            padding: 2rem;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .form-header {
            border-bottom: 1px solid #dee2e6;
            padding-bottom: 1rem;
            margin-bottom: 2rem;
        }
    </style>
</head>
<body class="container mt-5">
<div class="form-container">
    <div class="form-header">
        <h2 class="text-center">Driving License Application Form</h2>
        <p class="text-center text-muted">Fill all details carefully</p>
    </div>

    <form action="drivinglicense" method="post">
        <div class="row mb-3">
            <div class="col-md-6">
                <label class="form-label">Full Name:</label>
                <input type="text" name="name" class="form-control" required
                       pattern="[A-Za-z ]+" title="Only alphabets and spaces allowed" />
            </div>
            <div class="col-md-6">
                <label class="form-label">Mobile Number:</label>
                <input type="tel" name="mobile" class="form-control" required
                       pattern="[0-9]{10}" title="10 digit mobile number" />
            </div>
        </div>

        <div class="mb-3">
            <label class="form-label">Address:</label>
            <textarea name="address" class="form-control" rows="3" required></textarea>
        </div>

        <div class="row mb-3">
            <div class="col-md-6">
                <label class="form-label">Applied Date:</label>
                <input type="date" name="appliedDate" class="form-control" required />
            </div>
            <div class="col-md-6">
                <label class="form-label">Vehicle Type:</label>
                <select name="vehicleType" class="form-select" required>
                    <option value="">Select Vehicle Type</option>
                    <option>Motorcycle (MCWG)</option>
                    <option>Light Motor Vehicle (LMV)</option>
                    <option>Heavy Motor Vehicle (HMV)</option>
                    <option>Transport Vehicle (TR)</option>
                    <option>International Driving Permit (IDP)</option>
                </select>
            </div>
        </div>

        <div class="mb-3 form-check">
            <input type="checkbox" class="form-check-input" id="declaration" required />
            <label class="form-check-label" for="declaration">
                I declare that all the information provided is correct to the best of my knowledge.
            </label>
        </div>

        <div class="d-grid gap-2">
            <button type="submit" class="btn btn-primary">Submit Application</button>
            <button type="reset" class="btn btn-outline-secondary">Reset Form</button>
        </div>
    </form>
</div>
</body>
</html>