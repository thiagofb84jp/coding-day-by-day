/**
 * Pontos Importantes:
 * 1. Use o 'let' apenas DENTRO do laço 'for', fazendo com que ele fique inacessível
 * para outros.
 */

const notas = [6.7, 7.4, 9.8, 8.1, 7.7];

for (let i in notas) {
    console.log(i, notas[i]);
}

const pessoa = {
    nome: 'Ana',
    sobrenome: 'Silva',
    idade: 29,
    peso: 64
}

for(let atributo in pessoa){
    console.log(`${atributo} = ${pessoa[atributo]}`);
}