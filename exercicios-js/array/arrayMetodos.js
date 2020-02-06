/**
 * Pontos Importantes:
 * 1. Alguns métodos importantes são: pop(), push(), shift(), unshift(), splice(), slice(), entre outros.
 */

const pilotos = ['Vettel', 'Alonso', 'Rakkonen', 'Massa'];
pilotos.pop(); //O último elemento do array será retirado
console.log(pilotos);

pilotos.push('Verstappen'); //Acrescenta mais um elemento no array
console.log(pilotos);

pilotos.shift(); //Remove o primeiro elemento da lista
console.log(pilotos);

pilotos.unshift('Hamilton'); //Acrescenta o primeiro elemento na lista
console.log(pilotos);

pilotos.splice(2, 0, 'Bottas', 'Massa'); //Pode adicionar e remover elementos em uma lista (adicionou um dos elementos)
console.log(pilotos);

pilotos.splice(3, 1); //Pode adicionar e remover elementos em uma lista (removeu um dos elementos)
console.log(pilotos);

const algunsPilotos1 = pilotos.slice(2) //Gera um novo array
console.log(algunsPilotos1);

const algunsPilotos2 = pilotos.slice(1, 4);
console.log(algunsPilotos2);