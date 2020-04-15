/**
 * Exercise 23:
 * Write a JavaScript program to create a new string adding "Py" in front of a given string. 
 *      If the given string begins with "Py" then return the original string.
 */

function stringCheck(stringOne){
    if (stringOne === null || stringOne === undefined || stringOne.substring(0, 2) === 'Py') {
        return stringOne;
    }

    return "Py" + stringOne;
}

console.log(stringCheck("Python"));
console.log(stringCheck("thon"));
console.log(stringCheck(" Mary"));