function gcdTwoNumbers(x, y) {
    if ((typeof x !== 'number') || (typeof y !== 'number')) {
        return false;
    }

    x = Math.abs(x);
    y = Math.abs(y);

    while (y) {
        let t = y;
        y = x % y;
        x = t;
    }

    return x;
}

console.log(gcdTwoNumbers(12, 13));
console.log(gcdTwoNumbers(4, 8));