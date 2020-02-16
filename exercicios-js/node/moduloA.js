/**
 * Pontos Importantes:
 * 1. Node.JS é um runtime Javascript formado por duas partes: pelo V8 (interpretador Javascript de código
 *      aberto do Google) juntamente com o LibUV que trata, de forma assíncrona, a parte mais lenta do processo 
 *      (tudo o que diz respeito à entrada/saída de dados);
 * 2. Um módulo tem uma certa 'interioridade', não deixando tudo aquilo que se escreve dentro dele visível
 *      para outros módulos, por exemplo;
 * 3. Usando Node.JS como servidor, ele pode funcionar como servidor Web no qual pode prover conteúdos dinâmicos;
 * 4. O Node.JS usa dois padrões (import/export) de módulos famosos em JS: um deles é o 'Commons.JS' (que é o mais)7
 *      utilizado no Node.JS e o 'ECMA Script 2015';
 */

 
//Detalhe importante: o 'this' é um objeto vazio
console.log(this);

//Dessa forma, estas variáveis podem ser acessadas em outro arquivo
this.ola = 'Fala Pessoal';
exports.bemVindo = 'Bem vindo ao node!';
module.exports.ateLogo = 'Até o próximo exemplo';