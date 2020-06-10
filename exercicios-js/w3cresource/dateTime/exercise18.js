/**
 * Write a JavaScript program to calculate age.
 */

calculateAge = (dob) => {
    let diffMs = Date.now() - dob.getTime();
    let ageDate = new Date(diffMs);

    return Math.abs(ageDate.getUTCFullYear() - 1970);
}

console.log(calculateAge(new Date(1982, 11, 4)));
console.log(calculateAge(new Date(1962, 1, 1)));