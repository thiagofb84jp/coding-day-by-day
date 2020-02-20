/**
 * Pontos Importantes:
 * 1. Mesmo depois de alterada a variável, o 'module.exports' continua sendo o mesmo objeto de sempre;
 * 2. Caso queira o objeto no qual já foi criado desde o início do arquivo, é preciso 
 */

console.log(module.exports); //retorna um objeto vazio
console.log(module.exports === this); //verdadeiro
console.log(module.exports === exports); //verdadeiro

this.a = 1;
exports.b = 2;
module.exports.c = 3;

exports = null;
console.log(module.exports); //retorna o objeto composto pelos valores declarados pelo exports (a, b e c)

exports = {
    nome: 'Teste'
}

console.log(module.exports); //ele ainda retorna o objeto composto pelos valores declarados no exports (a, b e c)

module.exports = { publico: true }