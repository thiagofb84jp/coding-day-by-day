/**
 * Operadores relacionais
 * Dica importante: via de regra, use o 'estritamente igual' (===) do que o 'igual' (==)
 * O estritamente igual não leva em consideração apenas o valor, mas o tipo da variável
 */

console.log('01)', '1' == 1) //true ('1' é igual a '1')
console.log('02)', '1' === 1) //false ('1' não é estritamente igual a '1')
console.log('03)', '3' != 3) //false ('3' é igual a '3')
console.log('04)', '3' !== 3) //true ('3' é estritamente igual a '3')

console.log('\n05)', 3 < 2) //false
console.log('06)', 3 > 2) //true
console.log('07)', 3 <= 2) //false
console.log('08)', 3 >= 2) //true

const d1 = new Date(0);
const d2 = new Date(0);

console.log('\n09)', d1 === d2); //false
console.log('10)', d1 == d2); //false
console.log('11)', d1.getTime() == d2.getTime()); //true (comparação com numbers)
console.log('12)', d1.getTime() === d2.getTime()); //true (comparação com numbers)

console.log('\n13)', undefined == null); //true
console.log('14)', undefined === null) //false