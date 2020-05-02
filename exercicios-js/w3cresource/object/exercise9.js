/**
 * Exercise 9:
 * Write a JavaScript function to check whether an object contains given property.
 */

function hasKey(object, key) {
    return object != null && hasOwnProperty.call(object, key);
}

console.log(hasKey({ red: "#FF0000", green: "#00FF00", white: "#FFFFFF" }, "yellow"));