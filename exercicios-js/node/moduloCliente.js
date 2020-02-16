/**
 * Pontos Importantes:
 * 1. O módulo 'Cliente' é o equivalente ao 'main' do Java, sendo este o arquivo principal;
 * 2. O 'npm' é o gerenciador de pacotes do Node.JS (Node Package Manager), responsável por baixar uma biblioteca
 *      de terceiros, por;
 */

const moduloA = require('./moduloA');
const moduloB = require('./moduloB');

console.log(moduloA.ola);
console.log(moduloA.bemVindo);
console.log(moduloA.ateLogo);
console.log(moduloA);

console.log(moduloB.bomDia);
console.log(moduloB.boaNoite());
console.log(moduloB);