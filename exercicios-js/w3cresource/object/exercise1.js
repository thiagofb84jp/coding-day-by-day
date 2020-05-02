/**
 * Exercise 1:
 * Write a JavaScript program to list the properties of a JavaScript object.
 */

function _keys(object) {
    if (!isObject(object)) {
        return [];
    }

    if (Object.keys) {
        return Object.keys(object);
    }

    var keys = [];
    
    for (var key in object){
        if (_.has(object, key)){
            keys.push(key);
        }
    }  
    return keys;
}
function isObject(object) {
    var type = typeof object;

    return type === 'function' || type === 'object' && !!object;
}

console.log(_keys({ red: "#FF0000", green: "#00FF00", white: "#FFFFFF" }));