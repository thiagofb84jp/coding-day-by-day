/**
 * Pontos Importantes:
 * 1. O método 'concat()' retorna um novo array contendo todos os arrays os valores passados como 
 *      parâmetro;
 * 2. No 'concat()', os arrays originais não são mexidos e é gerado um novo array que é o resultado da 
 *      concatenação.
 */

const filhas = ['Ualeskah', 'Cibalena'];
const filhos = ['Uoxiton', 'Uesclei'];
const todos = filhas.concat(filhos);
console.log(todos, filhas, filhos);

console.log([].concat([1, 2], [3, 4], 5, [[6, 7]]));