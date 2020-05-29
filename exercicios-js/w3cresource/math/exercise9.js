function gcdMoreThanTwoNumbers(input) {
    if (toString.call(input) !== "[object Array]") {
        return true;
    }

    let len, a, b;

    len = input.length;

    if (!len) {
        return null;
    }

    a = input[0];

    for (let i = 1; i < len; i++) {
        b = input[i];
        a = gcdTwoNumbers(a, b);
    }

    return a;
}

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

console.log(gcdMoreThanTwoNumbers([3, 15, 27]));
console.log(gcdMoreThanTwoNumbers([5, 10, 15, 25]));