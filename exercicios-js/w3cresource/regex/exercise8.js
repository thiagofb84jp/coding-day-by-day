/**
 * JavaScript function to check whether a given value is alpha numeric or not.
 */

isAlphaNumber = (str) => {
    regexExp = /^[A-Za-z0-9]+$/;

    let isValidRegexExp;

    (regexExp.test(str)) ? isValidRegexExp = true : isValidRegexExp = false;

    return isValidRegexExp;
}

console.log(isAlphaNumber("37828sad"));
console.log(isAlphaNumber("3243#$sew"));