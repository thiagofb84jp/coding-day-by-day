/**
 * Pontos Importantes:
 * 1. A variável global está em todos os lugares. Nunca se esqueça disso!
 * 
 */

require('./global');

console.log(MinhaApp.saudacao());
MinhaApp.nome = 'Eita!';
console.log(MinhaApp.nome);