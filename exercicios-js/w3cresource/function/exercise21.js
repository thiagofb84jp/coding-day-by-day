function arrayBinarySearch(narray, delement) {
    let mposition = Math.floor(narray.length / 2);

    if (narray[mposition] === delement) {
        return mposition;
    } else if (narray.length === 1) {
        return null;
    } else if (narray[mposition] < delement) {
        let arr = narray.slice(mposition + 1);
        let res = arrayBinarySearch(arr, delement);

        if (res === null) {
            return null;
        } else {
            return mposition + 1 + res;
        }
    } else {
        let arr1 = narray.slice(0, mposition);
        return arrayBinarySearch(arr1, delement);
    }
}

let myArray = [1, 2, 3, 5, 6, 7, 10, 11, 14, 15, 17, 19, 20, 22, 23];
console.log(arrayBinarySearch(myArray, 6));