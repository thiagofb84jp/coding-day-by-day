/**
 * Pontos Importantes:
 * 1. Preferencialmente, coloque o nome dos arquivos, respeitando a forma como ele
 *      se encontra salvo em sua descrição;
 * 2. JAMAIS deixe de ler as mensagens de falha as quais são apresentadas no console;
 */

const moduloA = require('../../moduloA');
console.log(moduloA.ola);

const saudacao = require('saudacao/index');
console.log(saudacao.ola);

const http = require('http')
http.createServer((req, res) => {
    res.write('Bom dia!');
    res.end();
}).listen(8080);