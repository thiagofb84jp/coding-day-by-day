/**
 * Pontos importantes da aula:
 * 1. Sempre priorize constantes em vez de variáveis;
 */

let isAtivo = false;
console.log(isAtivo);

isAtivo = true;
console.log(isAtivo);

isAtivo = 1; //Também pode ser transformado em valor booleano (!) - true | (!!) - false
console.log(!isAtivo); //Valor = false
console.log(!!isAtivo); //Valor = true

console.log('\nOs verdadeiros...');
console.log(!!3);
console.log(!!-1);
console.log(!!' ');
console.log(!![]);
console.log(!!{});
console.log(!!Infinity);
console.log(!!(isAtivo = Infinity));

console.log('\nOs falsos...');
console.log(!!0);
console.log(!!'');
console.log(!!null);
console.log(!!NaN);
console.log(!!undefined);
console.log(!!(isAtivo = false));

console.log('pra finalizar...');
console.log(!!('' || null || 0 || ' ')); //O valor será 'true'

let nome = '';
console.log(nome || 'Desconhecido'); //Comparativo de valores. Caso não tenha valor na variável 'nome', ele não imprime nada.