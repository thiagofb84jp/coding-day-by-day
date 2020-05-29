function binaryToDecimal(bstr) {
    return parseInt((bstr + '').replace(/[^01]/gi), 2);
}

console.log(binaryToDecimal('110011'));
console.log(binaryToDecimal('100'));