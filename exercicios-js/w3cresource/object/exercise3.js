/**
 * Exercise 3:
 * Write a JavaScript program to get the length of a JavaScript object. 
 */

Object.objsize = function (myObject) {
    let objectSize = 0, key;

    for (key in myObject) {
        if (myObject.hasOwnProperty(key)) {
            objectSize++;
        }
    }

    return objectSize;
}

let student = {
    name: "David Rayy",
    sclass: "VI",
    rollno: 12,
    age: 18
}

let objsize = Object.objsize(student);

console.log('Size of the current object : ' + objsize);