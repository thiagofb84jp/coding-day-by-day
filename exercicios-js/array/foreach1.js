/**
 * Pontos Importantes:
 * 1. Foreach executa uma dada função em cada elemento de um array;
 * 2. Sua sintaxe: arr.forEach(callback(currentValue [, index [, array]])[, thisArg]);
 * 3. Callback é uma função para executar em cada elemento, recebendo 3 (três) argumentos: currentValue, 
 *      index e array;
 */

const aprovados = ['Agatha', 'Aldo', 'Daniel', 'Raquel'];

//Foreach
aprovados.forEach(function (nome, indice, array) {
    console.log(`${indice  +1}) ${nome}`);
    console.log(array);
});

console.log('\n');

//Arrow function
aprovados.forEach(nome => console.log(nome));

console.log('\n');

//Atribuindo uma constante para o array
const exibirAprovados = aprovado => console.log(aprovado);
aprovados.forEach(exibirAprovados);