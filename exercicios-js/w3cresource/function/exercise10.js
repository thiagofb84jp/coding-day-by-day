/**
 * Exercise 10:
 * Write a JavaScript function that checks whether a passed string is palindrome or not?
 */

function checkPalindrome(strEntry){
    let cStr = strEntry.toLowerCase().replace(/[^a-zA-Z0-9]+/g, '');
    let cCount = 0;

    if (cStr === "") {
        console.log("Nothing found!");
        return false;
    }

    if ((cStr.length) % 2 === 0) {
        cCount = (cStr.length) / 2;
    } else {
        if (cStr.length === 1) {
            console.log("Entry is a palindrome");
            return true;
        } else {
            cCount = (cStr.length - 1) / 2;
        }
    }

    for(let x = 0; x < cCount; x++){
        if (cStr[x] != cStr.slice(-1 - x)[0]) {
            console.log("Entry is not a palindrome");
            return false;
        }
    }
    console.log("The entry is a palindrome");
    return true;
}

checkPalindrome('madam'); //true
checkPalindrome('nurses run'); //true
checkPalindrome('fox'); //false