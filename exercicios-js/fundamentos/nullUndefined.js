/**
 * 1. Caso se queira zerar o valor de uma variável, aponte (preferencialmente) o valor 'null';
 * 2. Preferencialmente aponte os valores dos operadores para 'nulo';
 * 3. Quando algo não for definido, deixe que a própria linguagem defina
 */

let valor; //variável não inicializada (nunca foi inicializada)
console.log(valor);

valor = null; //ausência de valor (não tem nenhum endereço de memória)
console.log(valor);
// console.log(valor.toString()); //Cuidado com variáveis que potencialmente podem estar nulas

const produto = {}
console.log(produto.preco); //Resulta em um objeto vazio
console.log(produto);

produto.preco = 3.50;
console.log(produto.preco);

produto.preco = undefined //Evite atribuir undefined para as variáveis
console.log(!!produto.preco); //Resulta em 'false'
// delete produto.preco -> Retira o atributo do array
console.log(produto);

produto.preco = null; //Sem preço
console.log(!!produto.preco);
console.log(produto); //Valor do preço igual a nulo