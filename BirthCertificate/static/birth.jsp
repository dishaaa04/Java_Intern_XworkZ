<!DOCTYPE html>
<html>
<head>
    <title>Birth Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">
<h2 class="text-center text-info">Birth Certificate Registration</h2>

<form action="birth" method="post" class="mt-4">
    <div class="mb-3">
        <label class="form-label">Birth ID:</label>
        <input type="text" name="birthId" class="form-control" required />
    </div>

    <div class="mb-3">
        <label class="form-label">Hospital Name:</label>
        <select name="hospitalName" class="form-select" required>
            <option disabled selected>Select Hospital</option>
            <option>City Hospital</option>
            <option>Govt. General</option>
            <option>Private Clinic</option>
        </select>
    </div>

    <div class="mb-3">
        <label class="form-label">Father Name:</label>
        <input type="text" name="fatherName" class="form-control" required />
    </div>

    <div class="mb-3">
        <label class="form-label">Mother Name:</label>
        <input type="text" name="motherName" class="form-control" required />
    </div>

    <div class="mb-3">
        <label class="form-label">Date & Time of Birth:</label>
        <input type="datetime-local" name="birthDateTime" class="form-control" required />
    </div>

    <div class="mb-3">
        <label class="form-label">Doctor Name:</label>
        <input type="text" name="doctorName" class="form-control" required />
    </div>

    <div class="mb-3">
        <label class="form-label">Nurse Name:</label>
        <input type="text" name="nurseName" class="form-control" required />
    </div>

    <div class="mb-3">
        <label class="form-label">Hospital Type:</label>
        <select name="hospitalType" class="form-select" required>
            <option disabled selected>Select Type</option>
            <option>Government</option>
            <option>Private</option>
            <option>Charitable</option>
        </select>
    </div>

    <button type="submit" class="btn btn-primary">Register Birth</button>
</form>
</body>
</html>
