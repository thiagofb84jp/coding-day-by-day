/**
 * Pontos Importantes:
 * 1. Operador ... rest(juntar)/spread(espalhar);
 */

//usar rest como parâmetro de uma função
//usar spread como objeto
const funcionario = { nome: 'Maria', salario: 12348.99 };
const clone = { ativo: true, ...funcionario };
console.log(clone);

//usar spread como array
const grupoA = [ 'João', 'Pedro', 'Glória' ]
const grupoFinal = [ 'Maria', ...grupoA, 'Rafaela' ]
console.log(grupoFinal);