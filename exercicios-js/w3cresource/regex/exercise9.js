/**
 * JavaScript Regular expression to valid an email address.
 */

validEmail = (str) => {
    let mailFormat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

    (mailFormat.test(str)) ? console.log("Valid email address!") : console.log("You have entered an invalid email address!");
}

validEmail("me-info@example.com"); //true
validEmail("me-info@example"); //false
validEmail("*09@example.com"); //false
validEmail("bloodymary@example.com.br"); //true