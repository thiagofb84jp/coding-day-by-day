/**
 * Exercise 17:
 * Write a JavaScript function to retrieve all the values of an object's properties.
 */

function allValues(object) {
    let keys = _keys(object);
    let length = keys.length;
    let values = Array(length);

    for (let i = 0; i < length; i++) {
        values[i] = object[keys[i]];
    }

    return values;
}

function _keys(object) {
    if (!isObject(object)) {
        return [];
    }

    if (Object.keys) {
        return Object.keys(object);
    }

    let keys = [];

    for (let key in object) {
        if (_.has(object, key)) {
            keys.push(key);
        }
    }

    return keys;
}

function isObject(object){
    let type = typeof object;

    return type === 'function' || type === 'object' && !!object;
}

console.log(allValues({red: "#FF0000", green: "#00FF00", white: "#FFFFFF"}));