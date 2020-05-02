/**
 * Exercise 11:
 * Write a JavaScript function to print all the methods in an JavaScript object.
 */

function findAllMethods(object) {
    return Object.getOwnPropertyNames(object).filter(function(property) {
        return typeof object[property] == "function";
    });
}

console.log(findAllMethods(Math));
console.log(findAllMethods(Array));

function allProperties(object){
    return Object.getOwnPropertyNames(object);
}

console.log(allProperties(Math));
console.log(allProperties(Array));