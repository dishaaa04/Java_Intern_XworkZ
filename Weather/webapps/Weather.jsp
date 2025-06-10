<!DOCTYPE html>
<html>
<head>
    <title>Enter Weather Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container py-5">
    <h2 class="text-center mb-4">Enter Weather Data</h2>
    <form action="weather" method="post" class="mx-auto" style="max-width: 500px;">
        <div class="mb-3">
            <label class="form-label">Location:</label>
            <input type="text" class="form-control" name="location" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Captured By:</label>
            <input type="text" class="form-control" name="capturedBy" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Temperature:</label>
            <input type="text" class="form-control" name="temperature" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Recorded Date:</label>
            <input type="text" class="form-control" name="recordedDate" placeholder="YYYY-MM-DD" required>
        </div>
        <div class="text-center">
            <input type="submit" class="btn btn-success" value="Record">
        </div>
    </form>
</div>
</body>
</html>
