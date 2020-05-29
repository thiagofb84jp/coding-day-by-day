let baseConvert = function(number, initialBase, changeBase) {
    if ((initialBase && changeBase) < 2 || (initialBase && changeBase) > 36) {
        return 'Base between 2 and 36';
    }

    return parseInt(number + '', initialBase).toString(changeBase);
}

console.log(baseConvert('E164', 16, 8));
console.log(baseConvert(1000, 2, 8));