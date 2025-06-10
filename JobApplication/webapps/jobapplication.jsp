<!DOCTYPE html>
<html>
<head>
    <title>Job Application Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">
<h2 class="text-center text-info">Job Application Form</h2>

<form action="job" method="post" class="mt-4">
    <div class="mb-3">
        <label class="form-label">Name:</label>
        <input type="text" name="name" class="form-control" required />
    </div>

    <div class="mb-3">
        <label class="form-label">Email:</label>
        <input type="email" name="email" class="form-control" required />
    </div>

    <div class="mb-3">
        <label class="form-label">Education:</label>
        <select name="education" class="form-select">
            <option>Select</option>
            <option>B.E</option>
            <option>B.Tech</option>
            <option>MCA</option>
        </select>
    </div>

    <div class="mb-3">
        <label class="form-label">Skills:</label>
        <input type="text" name="skills" class="form-control" required />
    </div>

    <div class="mb-3">
        <label class="form-label">Expected Salary:</label>
        <input type="text" name="expectedSalary" class="form-control" required />
    </div>

    <div class="mb-3">
        <label class="form-label">Experience:</label>
        <select name="experience" class="form-select">
            <option>Select</option>
            <option>Fresher</option>
            <option>1-2 Years</option>
            <option>2+ Years</option>
        </select>
    </div>

    <button type="submit" class="btn btn-primary">Submit Application</button>
</form>
</body>
</html>
