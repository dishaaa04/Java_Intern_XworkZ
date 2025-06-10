<!DOCTYPE html>
<html>
<head>
    <title>Death Certificate Registration</title>
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
        <h2 class="text-center">Death Certificate Registration Form</h2>
        <p class="text-center text-muted">Please fill all details accurately</p>
    </div>

    <form action="deathcertificate" method="post">
        <div class="row mb-3">
            <div class="col-md-6">
                <label class="form-label">Deceased Person's Full Name:</label>
                <input type="text" name="name" class="form-control" required />
            </div>
            <div class="col-md-6">
                <label class="form-label">Gender:</label>
                <select name="gender" class="form-select" required>
                    <option value="">Select</option>
                    <option>Male</option>
                    <option>Female</option>
                    <option>Other</option>
                </select>
            </div>
        </div>

        <div class="row mb-3">
            <div class="col-md-4">
                <label class="form-label">Date of Death:</label>
                <input type="date" name="date" class="form-control" required />
            </div>
            <div class="col-md-4">
                <label class="form-label">Time of Death:</label>
                <input type="time" name="time" class="form-control" required />
            </div>
            <div class="col-md-4">
                <label class="form-label">Age at Death:</label>
                <input type="number" name="ageAtDeath" class="form-control" min="0" max="120" required />
            </div>
        </div>

        <div class="mb-3">
            <label class="form-label">Cause of Death:</label>
            <textarea name="cause" class="form-control" rows="2" required></textarea>
        </div>

        <div class="row mb-3">
            <div class="col-md-6">
                <label class="form-label">Manner of Death:</label>
                <select name="mannerOfDeath" class="form-select" required>
                    <option value="">Select</option>
                    <option>Natural</option>
                    <option>Accident</option>
                    <option>Suicide</option>
                    <option>Homicide</option>
                    <option>Pending Investigation</option>
                </select>
            </div>
            <div class="col-md-6">
                <label class="form-label">Identifying Marks:</label>
                <input type="text" name="marks" class="form-control" placeholder="Scars, tattoos, etc." />
            </div>
        </div>

        <div class="row mb-3">
            <div class="col-md-6">
                <label class="form-label">Hospital/Institution Name (if applicable):</label>
                <input type="text" name="hospitalName" class="form-control" />
            </div>
            <div class="col-md-6">
                <label class="form-label">Certified By (Medical Practitioner):</label>
                <input type="text" name="certifiedBy" class="form-control" required />
            </div>
        </div>

        <div class="d-grid gap-2 mt-4">
            <button type="submit" class="btn btn-primary">Register Death Certificate</button>
            <button type="reset" class="btn btn-outline-secondary">Clear Form</button>
        </div>
    </form>
</div>
</body>
</html>