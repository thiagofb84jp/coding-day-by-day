/**
 * Write a JavaScript function to find a word within a string.
 */

function searchWord(text, word) {
    let x = 0, y = 0;

    for (i = 0; i < text.length; i++) {
        if (text[i] == word[0]) {
            for (j = i; j < i + word.length; j++) {
                if (text[j] == word[j - i]) {
                    y++;
                }
                if (y == word.length) {
                    x++;
                }
            }
            y = 0;
        }
    }

    return "'" + word + "' was found " + x + " times.";
}

console.log(searchWord('The quick brown fox', 'fox'));
console.log(searchWord('aa, bb, cc, dd, aa', 'aa'));