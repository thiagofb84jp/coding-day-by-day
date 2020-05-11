/**
 * Exercise 15:
 * Write a JavaScript function to escape a HTML string.
*/

function escapeHTML(htmlString) {
    'use strict'; //Defines that JavaScript code should be executed in "strict mode".

    return htmlString.replace(/[&<>"]/g, function (tag) {
        let charsToReplace = {
            '&': '&',
            '<': '<',
            '>': '>',
            '"': '"'
        };

        return charsToReplace[tag] || tag;
    });
}

console.log(escapeHTML('&lt;a href=&quot;javascript-string-exercise-17.php&quot; target=&quot;_blank&quot;&gt;'));