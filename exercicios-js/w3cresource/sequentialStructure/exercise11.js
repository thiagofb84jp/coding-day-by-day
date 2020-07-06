/**
 * Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
    a) o produto do dobro do primeiro com metade do segundo.
    b) a soma do triplo do primeiro com o terceiro.
    c) o terceiro elevado ao cubo.
 */

manyCalc = (nat1, nat2, realn) => {
    let fistOperation = (nat1 * 2) * (nat2 / 2);
    let secondOperation = (nat1 * 3) + realn;
    let thirdOperation = (realn * realn * realn);

    console.log("******** Many Operations ********");
    console.log("1) o produto do dobro do primeiro com metade do segundo: " + fistOperation);
    console.log("2) a soma do triplo do primeiro com o terceiro: " + secondOperation);
    console.log("3) o terceiro elevado ao cubo: " + thirdOperation)
}

manyCalc(2, 2, 1.5);
