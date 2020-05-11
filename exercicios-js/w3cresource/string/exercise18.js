/**
 * Exercises
 * Write a JavaScript function to insert a string within a string at a particular position (default is 1).
 */

insert = function insert(mainString, insString, pos) {
    if (typeof (pos) == "undefined") {
        pos = 0;
    }

    if (typeof (insString) == "undefined") {
        insString = '';
    }

    return mainString.slice(0, pos) + insString + mainString.slice(pos);
}

console.log(insert('We are doing some exercises.'));
console.log(insert('We are doing some exercises.', 'Javascript '));
console.log(insert('We are doing some exercises.', 'Javascript ', 18));