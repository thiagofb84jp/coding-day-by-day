/**
 * Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, 
 *      isósceles ou escaleno.
 */

tipoTriangulo = (ladoA, ladoB, ladoC) => {
    if ((ladoA + ladoB < ladoC) || (ladoA + ladoC < ladoB) || (ladoB + ladoC < ladoA)) {
        console.log("Não se trata de um triângulo");
    } else if ((ladoA == ladoB) && (ladoA == ladoC)) {
        console.log("Equilátero");
    } else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)) {
        console.log("Isóceles");
    } else {
        console.log("Escaleno");
    }
}

tipoTriangulo(5, 5, 2);
tipoTriangulo(5, 8, 9);
tipoTriangulo(8, 8, 8);
tipoTriangulo(2, 2, 10);