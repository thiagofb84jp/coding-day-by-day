function lcmTwoNumbers(x, y) {
    if ((typeof x !== 'number') || (typeof y !== 'number')) {
        return false;
    }

    return (!x || !y) ? 0 : Math.abs((x * y) / gcdTwoNumbers(x, y));
}

function gcdTwoNumbers(x, y) {
    x = Math.abs(x);
    y = Math.abs(y);

    while (y) {
        let t = y;
        y = x % y;
        x = t;
    }

    return x;
}

console.log(lcmTwoNumbers(3, 15));
console.log(lcmTwoNumbers(10, 15));