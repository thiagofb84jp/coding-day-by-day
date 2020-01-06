/**
 * Array = Estrutura unidimensional na qual consegue agrupar mais de um valor em uma única estrutura
 * Ponto importante: é preciso separar os tipos dos diferentes arrays
 */

const valores = [7.7, 8.9, 6.3, 9.2];
console.log(valores[0], valores[3]);
console.log(valores[4]); //Ele vai imprimir sem problemas. O valor impresso será 'undefined'

valores[4] = 10;
console.log(valores);
console.log(valores.length); //Informa quantos elementos tem dentro de um array

valores.push({id: 3}, false, null, 'teste'); //Pode-se misturar outros elementos (bem heterogêneos) dentro do array
console.log(valores);

console.log(valores.pop()); //Extrai o último valor do array e exibe-o no console
delete valores[0];
console.log(valores);

console.log(typeof valores); //Exibe o tipo do array (object)