/**
 * Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */

media = (nota1, nota2, nota3, nota4) => {
    let total = (nota1 + nota2 + nota3 + nota4) / 4;

    console.log('A média total deste bimestre é de: ' + total);
}

media(10, 6, 5, 9);