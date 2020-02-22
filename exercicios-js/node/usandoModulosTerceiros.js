/**
 * Pontos Importantes:
 * 1. Lodash é uma biblioteca pronta (conjunto de recursos prontos para serem usados);
 * 2. Lembre-se: um Framework é um 'arcabouço'/estrutura para desenvolver o sistema seguindo as 
 *      configurações que o próprio Framework oferece, onde o sistema é construído por cima.
 */

//Forma de repassar um dos módulos do Node.JS (neste caso, o Lodash)
//Esta função tem como executar, de forma randômica, valores aleatórios no intervalo entre 1 e 1000
const _ = require('lodash');
setInterval(() => console.log(_.random(5, 60)), 2000);