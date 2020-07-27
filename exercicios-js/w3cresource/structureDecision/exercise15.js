/**
 * Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este 
 *      ano é ou não bissexto.
 */

function bissexto(ano) {
    if ((ano % 4 == 0) && (ano % 100 !== 0) || ano % 400 == 0) {
        console.log("O ano informado é Bissexto.");
    } else {
        console.log("O ano informado não é Bissexto.");
    }
}

bissexto(2020);
bissexto(2019);