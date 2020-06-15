/**
 * Write a JavaScript program to display the colors in the following way:
 */


let color = ["Blue ", "Green", "Red", "Orange", "Violet", "Indigo", "Yellow "];

ordinal = (number) => {
    let o = ["th", "st", "nd", "rd"];
    x = n % 100;

    return x + (o[(x - 20) % 10] || o[x] || o[0]);
}

for (n = 0; n < color.length; n++) {
    let ordinalNumber = n + 1;
    let output = (ordinal(ordinalNumber) + " choice is " + color[n] + ".");

    console.log(output);
}