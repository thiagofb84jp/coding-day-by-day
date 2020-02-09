/**
 * Pontos Importantes:
 * 1. Uma função callback é uma função passada a outra função como argumento, que é então invocado dentro
 *      da função externa para completar algum tipo de rotina ou ação;
 * 2. É passada como argumento de outra função e/ou chamada quando um evento for acontecido, ou quando uma parte
 *      de código receber uma resposta de que estava à espera.
 * 3. Uma das vantagens é de o computador poder executar outros processos enquanto a resposta não chega.
 */

//Exemplo 1
function greeting(name){
    alert('Hello' + name);
}

function processUserInput(callback){
    var name = window.prompt('Please enter your name.');
    callback(name);
}

processUserInput(greeting);

//Exemplo 2
function callback(e){
    alert('Aconteceu um evento ' + e.type);
}

window.addEventListener('click', callback);