<!DOCTYPE html>
<html>
<head>
    <title>Passport Application Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">
<h2 class="text-center text-info">Passport Application Form</h2>

<form action="passport" method="post" class="mt-4">
    <div class="mb-3">
        <label class="form-label">Applicant Name:</label>
        <input type="text" name="applicantName" class="form-control" required />
    </div>

    <div class="mb-3">
        <label class="form-label">Aadhar Number:</label>
        <input type="text" name="aadharNo" class="form-control" required pattern="[0-9]{12}"
               title="12 digit Aadhar number" />
    </div>

    <div class="mb-3">
        <label class="form-label">Address:</label>
        <textarea name="address" class="form-control" rows="3" required></textarea>
    </div>

    <div class="mb-3">
        <label class="form-label">PAN Number:</label>
        <input type="text" name="panNo" class="form-control" required pattern="[A-Z]{5}[0-9]{4}[A-Z]{1}"
               title="PAN number in format: ABCDE1234F" />
    </div>

    <div class="row mb-3">
        <div class="col-md-4">
            <label class="form-label">Country:</label>
            <select name="country" class="form-select" required>
                <option value="">Select</option>
                <option>India</option>
                <option>Other</option>
            </select>
        </div>
        <div class="col-md-4">
            <label class="form-label">State:</label>
            <input type="text" name="state" class="form-control" required />
        </div>
        <div class="col-md-4">
            <label class="form-label">City:</label>
            <input type="text" name="city" class="form-control" required />
        </div>
    </div>

    <div class="mb-3">
        <label class="form-label">Pin Code:</label>
        <input type="text" name="pinCode" class="form-control" required pattern="[0-9]{6}"
               title="6 digit pin code" />
    </div>

    <div class="mb-3">
        <label class="form-label">Passport Type:</label>
        <select name="passportType" class="form-select" required>
            <option value="">Select</option>
            <option>Regular (36 pages)</option>
            <option>Jumbo (60 pages)</option>
            <option>Tatkal</option>
        </select>
    </div>

    <div class="mb-3">
        <label class="form-label">Payment Reference Number:</label>
        <input type="text" name="paymentReferenceNo" class="form-control" required />
        <div class="form-text">Reference number from your payment receipt</div>
    </div>

    <div class="d-grid gap-2">
        <button type="submit" class="btn btn-primary">Submit Application</button>
    </div>
</form>
</body>
</html>