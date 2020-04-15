/**
 * Exercise 29:
 * Write a JavaScript program to check whether a string starts with 'Java' and false otherwise.
 */

function startSpecStr(str){
    if (str.length < 4) {
        return false;
    }
    front = str.substring(0, 4);
    if (front == 'Java') {
        return true;
    } else {
        return false;
    }
}

console.log(startSpecStr("Javascript")); //true
console.log(startSpecStr("Java")); //true
console.log(startSpecStr("Python")); //false
console.log(startSpecStr("Ruby")); //false