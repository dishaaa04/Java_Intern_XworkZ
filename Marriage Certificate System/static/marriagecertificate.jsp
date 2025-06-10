<!DOCTYPE html>
<html>
<head>
    <title>Marriage Certificate Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .form-container {
            background-color: white;
            padding: 2rem;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .couple-section {
            background-color: #f8f9fa;
            padding: 1rem;
            border-radius: 5px;
            margin-bottom: 1rem;
        }
    </style>
</head>
<body class="container mt-5">
<div class="form-container">
    <h2 class="text-center text-info">Marriage Certificate Registration Form</h2>
    <p class="text-center text-muted mb-4">Please fill all details accurately</p>

    <form action="marriagecertificate" method="post">
        <div class="couple-section">
            <h5 class="text-primary">Couple Information</h5>
            <div class="row mb-3">
                <div class="col-md-6">
                    <label class="form-label">Groom's Full Name:</label>
                    <input type="text" name="groomName" class="form-control" required
                           pattern="[A-Za-z ]+" title="Only alphabets and spaces allowed" />
                </div>
                <div class="col-md-6">
                    <label class="form-label">Bride's Full Name:</label>
                    <input type="text" name="brideName" class="form-control" required
                           pattern="[A-Za-z ]+" title="Only alphabets and spaces allowed" />
                </div>
            </div>
        </div>

        <div class="row mb-3">
            <div class="col-md-6">
                <label class="form-label">Marriage Location:</label>
                <input type="text" name="location" class="form-control" required />
            </div>
            <div class="col-md-6">
                <label class="form-label">Marriage Date:</label>
                <input type="date" name="date" class="form-control" required />
            </div>
        </div>

        <div class="mb-3">
            <label class="form-label">Address:</label>
            <textarea name="address" class="form-control" rows="3" required></textarea>
        </div>

        <div class="row mb-3">
            <div class="col-md-6">
                <label class="form-label">Religion:</label>
                <select name="religion" class="form-select" required>
                    <option value="">Select Religion</option>
                    <option>Hindu</option>
                    <option>Muslim</option>
                    <option>Christian</option>
                    <option>Sikh</option>
                    <option>Jain</option>
                    <option>Buddhist</option>
                    <option>Other</option>
                </select>
            </div>
        </div>

        <div class="couple-section">
            <h5 class="text-primary">Witness Information</h5>
            <div class="row mb-3">
                <div class="col-md-6">
                    <label class="form-label">Witness 1 Name:</label>
                    <input type="text" name="witness1" class="form-control" required />
                </div>
                <div class="col-md-6">
                    <label class="form-label">Witness 2 Name:</label>
                    <input type="text" name="witness2" class="form-control" required />
                </div>
            </div>
        </div>

        <div class="mb-3">
            <label class="form-label">Officer Present:</label>
            <input type="text" name="officerPresent" class="form-control" required />
        </div>

        <div class="d-grid gap-2 mt-4">
            <button type="submit" class="btn btn-primary">Register Marriage</button>
            <button type="reset" class="btn btn-outline-secondary">Reset Form</button>
        </div>
    </form>
</div>
</body>
</html>