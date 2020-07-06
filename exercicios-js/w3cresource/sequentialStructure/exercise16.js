/**
 * Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros 
 *  quadrados da área a ser pintada. Considere que a cobertura da tinta é de 
 *  1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, 
 *  que custam R$ 80,00. 
 *  Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */

function calcQtdLatasEPrecoTotal(metros) {
    let litros = metros / 3;

    let precoLitro = 80.0;
    let capacidadeLitro = 18;

    let qtdLatas = litros / capacidadeLitro;
    let total = qtdLatas * precoLitro;

    console.log("Você precisará usar o total de " + qtdLatas.toFixed(2) + " latas de tinta");
    console.log("O preço total é de R$: " + total.toFixed(2));
}

calcQtdLatasEPrecoTotal(56);