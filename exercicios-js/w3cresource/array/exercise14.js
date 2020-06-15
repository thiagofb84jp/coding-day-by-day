/**
 * Write a JavaScript program to add items in an blank array and display the items.
 */

let x = 0;
let array = Array();

addElementToArray = () => {
    array[x] = document.getElementById("text1").value;
    alert("Element: " + array[x] + " Added at index " + x);
    x++;
    document.getElementById("text1").value = "";
}

displayArray = () => {
    let e = "<hr/>";

    for (let y = 0; y < array.length; y++) {
        e += "Element " + y + " = " + array[y] + "<br/>";
    }

    document.getElementById("Result").innerHTML = e;
}