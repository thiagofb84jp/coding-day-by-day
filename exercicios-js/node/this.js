/***
 * Pontos Importantes:
 * 1. O 'this' não aponta para global e sim para module.exports;
 * 2. O 'this' é um objeto que faz referência ao module.exports;
 * 3. Dentro de uma função, o 'this' não aponta para o 'exports', mas fora de uma função ele aponta;
 * 4. Dentro de uma função, o 'this' aponta para uma global;
 */

console.log(this === global); //false
console.log(this === module); //false

console.log(this === module.exports); //true
console.log(this === exports); //true

function logThis(){
    console.log('Dentro de uma função...');
    console.log(this === exports); //false
    console.log(this === module.exports); //false
    console.log(this === global); //true
}

logThis();