random = function(min, max) {
    if (min == null && max == null) {
        return 0;
    }

    if (max == null) {
        max = min;
        min = 0;
    }

    return min + Math.floor(Math.random() * (max - min + 1));
}

console.log(random(20, 1))
console.log(random(1, 10))
console.log(random(6));
console.log(random())