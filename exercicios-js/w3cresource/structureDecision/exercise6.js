/**
 * Faça um Programa que leia três números e mostre o maior deles.
 */

maiorDeTresNumeros = (x, y, z) => {
    if ((x > y) && (x > z)) {
        return console.log(x + " é maior que " + y + " e " + z);
    } else if ((y > x) && (y > z)) {
        return console.log(y + " é maior que " + x + " e " + z);
    } else {
        return console.log(z + " é maior que " + x + " e " + y);
    }
}

maiorDeTresNumeros(30, 20, 10);
maiorDeTresNumeros(10, 50, 20);
maiorDeTresNumeros(10, 20, 100);