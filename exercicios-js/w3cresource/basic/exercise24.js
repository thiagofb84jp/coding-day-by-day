/**
 * Exercise 24:
 * Write a JavaScript program to remove a character at the specified position of a given 
 * string and return the new string.
 */

function removeCharacter(str, charPos){
    part1 = str.substring(0, charPos);
    part2 = str.substring(charPos + 1, str.length);

    return (part1 + part2);
}

console.log(removeCharacter("Python", 0));
console.log(removeCharacter("Python", 3));
console.log(removeCharacter("Python", 5));