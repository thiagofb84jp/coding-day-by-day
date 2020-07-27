/**
 * Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */

function mostrarNumerosOrdemDecrescente(num1, num2, num3) {

    if (num1 > num2) {
        if (num2 > num3) {
            console.log(num1 + "," + num2 + "," + num3);
        } else if (num1 > num3) {
            console.log(num1 + "," + num3 + "," + num2);
        } else {
            console.log(num3 + "," + num1 + "," + num2);
        }
    } else {
        if (num2 > num3) {
            if (num1 > num3) {
                console.log(num2 + "," + num1 + "," + num3);
            } else {
                console.log(num2 + "," + num3 + "," + num1);
            }
        } else {
            console.log(num3 + "," + num2 + "," + num1);
        }
    }
}

mostrarNumerosOrdemDecrescente(10.6, 100, 5.5);