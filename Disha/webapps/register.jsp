<html>
<head>
    <title>Login Form</title>
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
<body>
<form action="register" method="post">
    <div class="row mb-3">
        <div class="col-md-6">
            <label class="form-label">Full Name:</label>
            <input type="text" name="name" class="form-control" required
                   pattern="[A-Za-z ]+" title="Only alphabets and spaces allowed" />
        </div>
        <div class="col-md-6">
            <label class="form-label">Mobile Number:</label>
            <input type="number" name="mobile" class="form-control" required
                   pattern="[0-9]{10}" title="10 digit mobile number" />
        </div>
        <div class="row mb-3">
            <div class="col-md-6">
                <label class="form-label">Email: </label>
                <input type="email" name="email" class="form-control" required/>
            </div>
        </div>
        <div class="row mb-3">
            <div class="col-md-6">
                <label class="form-label">BookID </label>
                <input type="text" name="bookid" class="form-control" required/>
            </div>
        </div>
        <button type="submit">Submit</button>
    </div>
</form>
</body>
</html>