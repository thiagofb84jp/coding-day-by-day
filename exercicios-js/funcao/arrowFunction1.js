/**
 * Pontos Importantes:
 * 1. Nestes códigos existem diferentes formas de escrever as funções;
 * 2. São funções mais reduzidas para leitura do código-fonte.
 * 
 */

 //Primeiro Exemplo
let dobro = function(a){
    return 2 * a;
}

dobro = (a) => {
    return 2 * a;
}

dobro = a => 2 * a; //o retorno está implícito

console.log(Math.PI);
console.log(dobro(Math.PI));

//Segundo Exemplo
let ola = function(){
    return 'Olá';
}

ola = () => 'Olá'; //forma padrão de utilização
ola = _ => 'Olá'; //possui pelo menos um parâmetro
console.log(ola());