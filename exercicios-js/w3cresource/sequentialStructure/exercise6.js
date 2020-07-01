/**
 * Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */

calcArea = (raio) => {
    let area = Math.PI * Math.pow(raio, 2);

    console.log('A área do círculo é de '+ area.toFixed(2) + 'cm²');
}

calcArea(3);