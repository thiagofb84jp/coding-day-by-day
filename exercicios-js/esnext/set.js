/**
 * Pontos Importantes:
 * 1. O objeto Set() permite que sejam armazenados valores únicos de qualquer tipo, desde valores primitivos a referências 
 *      a objetos;
 * 2. Não permite repetições dos elementos da lista.
 */

//Não aceita repetição/não indexada
const times = new Set();
times.add('Vasco');
times.add('São Paulo').add('Palmeiras').add('Corinthians');
times.add('Flamengo');
times.add('Vasco');

console.log(times);
console.log(times.size);
console.log(times.has('vasco')); //false
console.log(times.has('Vasco')); //true
times.delete('Flamengo'); //exclui o elemento da lista
console.log(times.has('Flamengo')); //false (porque ele foi excluído anteriormente)

const nomes = [ 'Raquel', 'Lucas', 'Júlia', 'Lucas' ];
const nomesSet = new Set(nomes);
console.log(nomesSet);