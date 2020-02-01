/**
 * Pontos Importantes:
 * 1. Não se pode atribuir para uma constante um outro objeto que se encontra em outro endereço de memória;
 * 2. Uma vez que o objeto se encontra "congelado", não há mais a possibilidade de se mexer nesse objeto
 *      (sobre o método Object.freeze);
 */

// pessoa -> 123 -> {...}
const pessoa = { nome : 'João'}
pessoa.nome = 'Pedro';
console.log(pessoa);

// pessoa -> 456 -> {...}
//pessoa = { nome: 'Ana'}

Object.freeze(pessoa);

pessoa.nome = 'Maria';
pessoa.nome = 'Rua ABC';
delete pessoa.nome;

console.log(pessoa.nome);
console.log(pessoa);

const pessoaConstante = Object.freeze({nome : 'João'});
pessoaConstante.nome = 'Maria';
console.log(pessoaConstante);