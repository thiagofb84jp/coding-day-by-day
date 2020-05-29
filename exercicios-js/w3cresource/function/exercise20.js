function subset(array, arraySize) {
    let resultSet = [],
        result;

    for (let x = 0; x < Math.pow(2, array.length); x++) {
        result = [];
        i = array.length - 1;

        do {
            if ((x & (1 << i)) != 0) {
                result.push(array[i]);
            }
        } while (i--);

        if (result.length >= arraySize) {
            resultSet.push(result);
        }
    }
    return resultSet;
}

console.log(subset([1, 2, 3], 2));