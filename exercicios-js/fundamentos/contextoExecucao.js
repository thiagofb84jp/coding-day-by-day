/**
 * Pontos importantes:
 * 1. Não crie variáveis sem as palavras-chave 'let' e 'var';
 * 2. Conheça bem o local (runtime) onde você está executando o Javascript;
 * 3. Não coloque variáveis no escopo global do programa. Se possível, coloque constantes.
 */
let a = 3;

global.b = 123;
this.c = 456;
this.d = false;
this.e = 'teste';

console.log(a); //3
console.log(global.a); //undefined
console.log(this.c); //456
console.log(module.exports.c); //456
console.log(module.exports === this); //true
console.log(module.exports); //recebe o módulo de 'exports'

//Criando uma variável sem a palavra-chave 'let'
//Não realize este tipo de prática
abc = 3;
console.log(global.abc);