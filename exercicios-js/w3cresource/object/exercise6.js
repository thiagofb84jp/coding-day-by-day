/**
 * Exercise 6:
 * Write a Bubble Sort algorithm in JavaScript.
 * Note: Bubble sort is a simple sorting algorithm that works by repeatedly stepping through the list to be sorted,
 * Sample Data: [6,4,0, 3,-2,1]
 * Expected Output : [-2, 0, 1, 3, 4, 6]
 */

Array.prototype.bubbleShortAlgo = function () {
    let isSorted = false;

    while (!isSorted) {
        isSorted = true;

        for (let n = 0; n < this.length - 1; n++) {
            if (this[n] > this[n + 1]) {
                let x = this[n + 1];
                this[n + 1] = this[n];
                this[n] = x;
                isSorted = false;
            }
        }
    }

    return this;
}

console.log([6, 4, 0, 3, -2, 1].bubbleShortAlgo());