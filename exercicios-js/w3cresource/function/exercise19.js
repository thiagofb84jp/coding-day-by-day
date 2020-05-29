function secondGreatestLowest(arrayNumbers) {
    arrayNumbers.sort(function(x, y) {
        return x - y;
    });

    let uniqa = [arrayNumbers[0]];
    let result = [];

    for (let j = 1; j < arrayNumbers.length; j++) {
        if (arrayNumbers[j - 1] != arrayNumbers[j]) {
            uniqa.push(arrayNumbers[j]);
        }
    }

    result.push(uniqa[1], uniqa[uniqa.length - 2]);
    return result.join(',');
}

console.log(secondGreatestLowest([1, 2, 3, 4, 5]));