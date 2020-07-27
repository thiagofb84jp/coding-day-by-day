/**
 * Faça um Programa que leia três números e mostre o maior e o menor deles.
 */

maiorEMenorDeTresNumeros = (x, y, z) => {
    let maior, menor;

    if ((x > y) && (x > z)) {
        maior = x;
    } else if ((y > x) && (y > z)) {
        maior = y;
    } else {
        maior = z;
    }

    if ((x < y) && (x < z)) {
        menor = x;
    } else if ((y < x) && (y < z)) {
        menor = y;
    } else {
        menor = z;
    }

    return console.log("O maior número é o " + maior + " e o menor número é " + menor);
}

maiorEMenorDeTresNumeros(30, 20, 10);
maiorEMenorDeTresNumeros(5, 50, 20);
maiorEMenorDeTresNumeros(0.5, 20, 100);