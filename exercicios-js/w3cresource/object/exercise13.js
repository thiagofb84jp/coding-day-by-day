/**
 * Exercise 13:
 * Write a JavaScript program to sort an array of JavaScript objects.
 */

var library = [
    {
        title: 'Bill Gates',
        author: 'The Road Ahead',
        libraryID: 1254
    },
    {
        title: 'Steve Jobs',
        author: 'Walter Isaacson',
        libraryID: 4264
    },
    {
        title: 'Mockingjay: The Final Book of The Hunger Games',
        author: 'Suzanne Collins',
        libraryID: 3245
    }];

let sortBy = function (fieldName, reverse, initial) {
    let key = initial ?

        function (x) {
            return initial(x[fieldName]);
        } :
        function (x) {
            return x[fieldName];
        };

    reverse = !reverse ? 1 : -1;

    return function (x, y) {
        return x = key(x), y = key(y), reverse * ((x > y) - (y > x));
    };
};

let newObject = library.sort(sortBy("libraryID", true, parseInt));
console.log(newObject);