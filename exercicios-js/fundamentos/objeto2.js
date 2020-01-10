/**
 * 1. Para criação de classes, quem exerce essa função são as funções
 */

console.log(typeof Object);
console.log(typeof new Object);

const Cliente = function(){}
console.log(typeof Cliente)
console.log(typeof new Cliente)

class Produto{} //ES 2015 -> Introdução dessa forma de criação da função em 2015
console.log(typeof Produto); //Function
console.log(typeof new Produto()); //Object