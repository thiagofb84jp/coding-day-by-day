/**
 * Write a JavaScript function to escapes special characters (&, <, >, ', ") for use in HTML.
 */

escapeHTML = (str) => {
    if ((str === null) || (str === '')) {
        return false;
    } else {
        str = str.toString();
    }

    let map = {
        '&': '&amp;',
        '<': '&lt;',
        '>': '&gt;',
        '"': '&quot;',
        "'": '&#039;'
    };

    return str.replace(/[&<>"']/g, function(m) {
        return map[m];
    });
}

console.log(escapeHTML('PHP & MySQL'));
console.log(escapeHTML('3 > 2'));