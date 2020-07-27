/**
 * Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre 
 * pelo mais barato.
 */

function produtoMaisBarato(prod1, prod2, prod3) {
    let maisBarato;

    if ((prod1 < prod2) && (prod1 < prod3)) {
        maisBarato = prod1;
    } else if ((prod2 < prod1) && (prod2 < prod3)) {
        maisBarato = prod2;
    } else {
        maisBarato = prod3;
    }

    return console.log("O produto mais barato é o " + maisBarato);
}

produtoMaisBarato(15.99, 15.98, 15.97);
produtoMaisBarato(1.58, 0.58, 0.23);