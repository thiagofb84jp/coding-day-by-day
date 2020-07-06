/**
 * Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou 
 *      em galões de 3,6 litros, que custam R$ 25,00.
    a) Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
    b) comprar apenas latas de 18 litros;
    c) comprar apenas galões de 3,6 litros;
    d) misturar latas e galões, de forma que o preço seja o menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
 */

calcQtdLatasTinta = (metros) => {
    let metrosLata = metros / 6;

    if (metrosLata <= 0) {
        metrosLata = 1;
    }

    let qtdLatas18 = Math.floor(metrosLata / 18 + (18 * 0.10));
    let qtdLatas36 = Math.floor(metrosLata / 3.6 + (3.6 * 0.10));
    let qtdLatas = metrosLata / 18;
    let resto = metrosLata % 18;

    let qtdGaloes;

    if (resto > 0 && resto <= 3.6) {
        qtdGaloes = 1;
    } else if (resto === 0) {
        qtdGaloes = 0;
    } else {
        qtdGaloes = Math.floor(resto / 3.6 + (3.6 * 0.10));
    }

    if (qtdLatas18 <= 0 || qtdLatas36 <= 0 || qtdGaloes < 0) {
        qtdLatas36 = 1;
        qtdLatas18 = 1;
        qtdGaloes = 1;
    }

    let precoLatas18 = qtdLatas18 * 80;
    let precoGaloes36 = qtdLatas36 * 25;
    let precoLatas = qtdLatas * 80;
    let precoGaloes = qtdGaloes * 25;

    let precoOtimo = qtdGaloes * 25;

    console.log(precoLatas18);
    console.log(precoGaloes36);
    console.log(precoLatas.toFixed(2));
    console.log(precoGaloes);
    console.log(precoOtimo);

}


calcQtdLatasTinta(56);