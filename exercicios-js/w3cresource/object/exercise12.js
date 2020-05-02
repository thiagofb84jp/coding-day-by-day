/**
 * Exercise 12:
 * Write a JavaScript function to retrieve all the names of object's own and inherited properties.
 */

function allKeys(object) {
    if (!isObject(object)) {
        return [];
    }

    let keys = [];

    for (let key in object) {
        keys.push(key);
    }

    return keys;
}

function isObject(object) {
    let type = typeof object;
    
    return type === 'function' || type === 'object' && !!object;
}

function student(name){
    this.name = name;
}

student.prototype.rollno = true;
console.log(allKeys(new student("Sara")));