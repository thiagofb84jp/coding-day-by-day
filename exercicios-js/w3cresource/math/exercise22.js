/**
 * Write a JavaScript function that Convert an integer into a Roman numeral.
 */

integerToRoman = (num) => {
    if (typeof num != 'number') {
        return false;
    }

    let digits = String(+num).split(""),
        key = ["", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM",
            "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC",
            "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"],
        romanNum = "",
        i = 3;

    while (i--) {
        romanNum = (key[+digits.pop() + (i * 10)] || "") + romanNum;
    }

    return Array(+digits.join("") + 1).join("M") + romanNum;
}

console.log(integerToRoman(1));
console.log(integerToRoman(27));
console.log(integerToRoman(50));
console.log(integerToRoman(1997));
console.log(integerToRoman(1955));