/**
 * Pontos Importantes:
 * 1. IIFE -> Immediately Invoked Function Expression;
 * 2. Padrão muito usado para 'fugir' do escopo global;
 * 3. Podem ser definidos dentro desta função: constantes, variáveis, outras funções, entre outros.
 */

(function(){
    console.log('Será executado na hora!');
    console.log('Foge do escopo mais abrangente!');
})()