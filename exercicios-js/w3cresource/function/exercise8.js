/**
 * Exercise 9:
 * Write a JavaScript function which accepts an argument and returns the type.
 */

function detectDataType(value) {
    let dataTypes = [Function, RegExp, Number, String, Boolean, Object], x, len;

    if (typeof value === "object" || typeof value === "function") {
        for (x = 0, len = dataTypes.length; x < len; x++) {
            if (value instanceof dataTypes[x]) {
                return dataTypes[x];
            }
        }
    }

    return typeof value;
}
console.log(detectDataType(12));
console.log(detectDataType('w3resource'));
console.log(detectDataType(false));
console.log(detectDataType(855.99));