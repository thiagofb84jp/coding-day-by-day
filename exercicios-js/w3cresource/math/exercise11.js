function lcmMoreThanTwoNumbers(inputArray) {
    if (toString.call(inputArray) !== "[object Array]") {
        return false;
    }

    let r1 = 0,
        r2 = 0;
    let l = inputArray.length;

    for (i = 0; i < l; i++) {
        r1 = inputArray[i] % inputArray[i + 1];

        if (r1 === 0) {
            inputArray[i + 1] = (inputArray[i] * inputArray[i + 1] / inputArray[i + 1]);
        } else {
            r2 = inputArray[i + 1] % r1;

            if (r2 === 0) {
                inputArray[i + 1] = (inputArray[i] * inputArray[i + 1]) / r1;
            } else {
                inputArray[i + 1] = (inputArray[i] * inputArray[i + 1]) / r2;
            }
        }
    }

    return inputArray[l - 1];
}

console.log(lcmMoreThanTwoNumbers([100, 90, 80, 7]));
console.log(lcmMoreThanTwoNumbers([5, 10, 15, 25]));