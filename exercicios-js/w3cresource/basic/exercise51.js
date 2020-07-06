/**
 * Write a JavaScript program to replace every character in a given string 
 *  with the character following it in the alphabet.
 */

function letterChanges(text) {
    let s = text.split('');

    for (let i = 0; i < s.length; i++) {
        switch (s[i]) {
            case '':
                break;
            case 'z':
                s[i] = 'a';
                break;
            case 'Z':
                s[i] = 'A';
                break;
            default:
                s[i] = String.fromCharCode(1 + s[i].charCodeAt(0));
        }
        switch (s[i]) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                s[i] = s[i].toUpperCase();
        }
    }

    return s.join('');
}

console.log(letterChanges("PYTHON"));
console.log(letterChanges("W3R"));
console.log(letterChanges("php"));