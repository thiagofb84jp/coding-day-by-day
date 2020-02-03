/**
 * Pontos Importantes:
 * 1. Todos os objetos criados a partir de uma função construtora apontam para um mesmo protótipo a partir 
 *      do atributo '__proto__';
 * 2. Quando se cria um objeto a partir de uma função construtora usando 'new', o protótipo deste objeto
 *      automaticamente aponta a função que foi criada '.prototype';
 * 3. Em resumo:
 *      - Tem-se o conceito de protótipo (ter um link para outros objetos e pesquisar na cadeia de protótipos,
 *          procurando funções e atributos a partir da cadeia de protótipos);
 *      - O atributo 'prototype' da função (toda função tem esse atributo);
 *      - O atributo '__proto__' (quando um objeto referencia o seu protótipo);
 *      - TODA função possui um atributo chamado 'prototype'.    
 */

function MeuObjeto(){}
console.log(MeuObjeto.prototype);

const obj1 = new MeuObjeto;
const obj2 = new MeuObjeto;

console.log(obj1.__proto__ === obj2.__proto__); //Primeira observação
console.log(MeuObjeto.prototype === obj1.__proto__); //Segunda observação

MeuObjeto.prototype.nome = 'Anônimo';
MeuObjeto.prototype.falar = function(){
    console.log(`Bom dia! Meu nome é ${this.nome}!`);
}

obj1.falar();

obj2.nome = 'Rafael';
obj2.falar();

const obj3 = {};
obj3.__proto__ = MeuObjeto.prototype;
obj3.nome = 'Obj3';
obj3.falar();

//Resumindo a loucura... (todos os valores serão iguais a 'true')
console.log((new MeuObjeto).__proto__ === MeuObjeto.prototype);
console.log(MeuObjeto.__proto__ === Function.prototype);
console.log(Function.prototype.__proto__ === Object.prototype);
console.log(Object.prototype.__proto__ === null);