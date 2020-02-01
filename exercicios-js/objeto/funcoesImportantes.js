/**
 * Pontos Importantes:
 * 1. Nesta aula, tem-se inúmeras funções importantes para o Javascript;
 * 2. Quais as funções mais importantes:
 *     - Keys
 *     - Values
 *     - Entries
 *     - Define Property, entre outros.
 */

const pessoa = {
    nome: 'Rebeca',
    idade: 2,
    peso: 13
}

console.log(Object.keys(pessoa));
console.log(Object.values(pessoa));
console.log(Object.entries(pessoa));

//Foreach é uma outra forma de percorrer os objetos de um array
Object.entries(pessoa).forEach(e => {
    console.log(`${e[0]}: ${e[1]}`);
});

console.log('\n');

//Outra forma de realizar o foreach com a referência 'chave' e 'valor'
Object.entries(pessoa).forEach(([chave, valor]) => {
    console.log(`${chave}: ${valor}`);
});

Object.defineProperty(pessoa, 'dataNascimento', {
    enumerable: true,
    writable: false,
    value: '01/01/2019'
});

pessoa.dataNascimento = '01/01/2019'/
console.log(pessoa.dataNascimento);
console.log(Object.keys(pessoa));

//Object.assign (ECMAScript 2015)
const dest = { a: 1 }
const o1 = { b: 2 }
const o2 = { c: 3, a: 4}
const obj = Object.assign(dest, o1, o2);

Object.freeze(obj);
obj.c = 1234;
console.log(obj);