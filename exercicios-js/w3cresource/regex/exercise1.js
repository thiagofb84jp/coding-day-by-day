uppercase = (str) => {
    regexExp = /^[A-Z]/;
    
    regexExp.test(str) ? console.log("String's first character is uppercase") : console.log("String's first character is not uppercase");
}

uppercase('Abcd');
uppercase('abcd');
uppercase('Camila');
uppercase('banana');