/**
 * Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta 
 *  área para o usuário.
 */

calcAreaQuadrado = (base, altura) => {
    let area = base * altura;
    console.log('A área do quadrado é de '+ area.toFixed(2) + 'm²');

    let dobroArea = area * 2;
    console.log('O dobro da área do quadrado é de '+ dobroArea.toFixed(2) + 'm²');
}

calcAreaQuadrado(2, 5);