function validate() {
    let val = true;

    let names = document.formName.nameName.value;
    let age = parseInt(document.formName.ageAge.value);
    let email = document.formName.emailName.value;
    let password = document.formName.passwordName.value;
    let gender = document.formName.gender.value;
    let confirmPassword = document.formName.confirmPasswordName.value;

if (names.length > 20) {
    alert("Name should not be more than 20 characters.");
    val = false;
}

if (age < 18) {
    alert("You must be at least 18 years old.");
    val = false;
}

if (!email) {
    alert("Email is required.");
    val = false;
}

if (password.length < 6) {
    alert("Password should be at least 6 characters long.");
    val = false;
}

if (!gender) {
    alert("Please select your gender.");
    val = false;
}

if (password !== confirmPassword) {
    alert("Passwords do not match.");
    val = false;
}

if (val) {
    alert("Form Submitted");
}

    return val;
}