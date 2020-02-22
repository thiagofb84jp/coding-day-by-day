/***
 * Pontos Importantes:
 * 1. A chamada 'fs' nativa do Javascript é indicada para trabalhar com arquivos do sistema;
 * 2. Lembrando que, ao receber o conteúdo do arquivo, ele recebe como objeto. É preciso que ele seja convertido para JSON;
 * 3. Lembre-se que o sinal do underline duplo ('__') indica que o arquivo está sendo percorrido para o diretório atual;
 */

const fs = require('fs');

//Lendo arquivos de forma síncrona...
const caminho = __dirname + '/arquivo.json';

//Lendo arquivos de forma síncrona
const conteudo = fs.readFileSync(caminho, 'utf-8');
console.log(conteudo);

//Lendo arquivos de forma assíncrona passando uma callback quando o arquivo for chamado
fs.readFile(caminho, 'utf-8', (err, conteudo) => {
    const config = JSON.parse(conteudo);
    console.log(`${config.db.host}:${config.db.port}`);
});

const config = require('./arquivo.json');
console.log(config.db);

//Realizando a leitura completa da pasta
fs.readdir(__dirname, (err, arquivos) => {
    console.log('Conteúdo da pasta...');
    console.log(arquivos);
});