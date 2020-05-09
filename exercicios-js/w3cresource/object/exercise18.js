/**
 * Exercise 18:
 * Write a JavaScript function to get a copy of the object where the keys have become the values and 
 *      the values the keys.
 */

function invertKeyValue(object) {
    let result = {};
    let keys = _keys(object);

    for (let i = 0, length = keys.length; i < length; i++) {
        result[object[keys[i]]] = keys[i];
    }

    return result;
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

console.log(invertKeyValue({red: "#FF0000", green: "#00FF00", white: "#FFFFFF"}));