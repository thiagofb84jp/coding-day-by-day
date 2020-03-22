/**
 * Pontos Importantes: 
 * 1. O Map() é um mapa simples de chave/valor. Qualquer valor (objeto e valores primitivos) pode ser usado
 *      como uma chave ou um valor;
 * 2. Essa estrutura também aceita funções.
 */

const tecnologias = new Map();
tecnologias.set('react', { framework: false })
tecnologias.set('angular', { framework: true })

console.log(tecnologias.react);
console.log(tecnologias.get('react').framework); //a partir daqui tem-se retornado o valor do objeto

const chavesVariadas = new Map([
    [function () { }, 'Função'],
    [{ }, 'Objeto'],
    [123, 'Número'],
])

chavesVariadas.forEach((vl, ch) =>{
    console.log(ch, vl);
});

console.log(chavesVariadas.has(123)); //retorna 'true' ou 'false'
chavesVariadas.delete(123);
console.log(chavesVariadas.has(123)); //false
console.log(chavesVariadas.size); //2

chavesVariadas.set(123, 'a');
chavesVariadas.set(123, 'b');
chavesVariadas.set(456, 'b');
console.log(chavesVariadas); //ao final, retorna um Map contendo os objetos dentro de um array