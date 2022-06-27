function validateForm() {
    let x = document.forms["myForm"]["name"].value.length;
    if (x < 2) {
      alert("Valid name must be provided");
      return false;
    }

    let y = document.forms["myForm"]["pwd"].value.length;
    if (y < 8) {
        alert("Valid password must be provided");
        return false;
      }

    // let z = documents.forms["myForm"]["marks"].value;
    let z = document.getElementById("marks").value;
    if (z < 0 || z > 100) {
        alert("Invalid Marks");
        return false;
    }

    let a = document.forms["myForm"]["coding"].value.length;
    if (a < 1) {
        alert("Please select an option");
        return false;
      }

  }