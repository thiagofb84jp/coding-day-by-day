/**
 * Exercise 14:
 * Write a JavaScript function to convert an object into a list of '[key, value]' pairs.
 */


/*function keysValuePairs(object) {
    let keys = _keys(object);
    let lenght = keys.lenght;
    let pairs = Array(lenght);

    for (let i = 0; i < lenght; i++) {
        pairs[i] = [keys[i], object[keys[i]]];
    }

    return pairs;
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

function isObject(object) {
    let type = typeof object;

    return type === 'function' || type === 'object' && !!object;
}

console.log(keysValuePairs({ red: "#FF0000", green: "#00FF00", white: "#FFFFFF" }));*/

function key_value_pairs(obj) {
    let keys = _keys(obj);

    let length = keys.length;

    let pairs = Array(length);

    for (var i = 0; i < length; i++) {
        pairs[i] = [keys[i], obj[keys[i]]];
    }

    return pairs;
}

function _keys(obj) {
    if (!isObject(obj)) {
        return [];
    } 

    if (Object.keys) {
        return Object.keys(obj);
    }

    var keys = [];

    for (var key in obj) {
        if (_.has(obj, key)) {
            keys.push(key);
        }
    }
    return keys;
}
function isObject(obj) {
    var type = typeof obj;
    
    return type === 'function' || type === 'object' && !!obj;
}
console.log(key_value_pairs({ red: "#FF0000", green: "#00FF00", white: "#FFFFFF" }));
