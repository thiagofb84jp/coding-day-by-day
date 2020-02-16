/**
 * Pontos Importantes:
 * 1. 
 */

//Forma de repassar um dos módulos do Node.JS (neste caso, o Lodash)
//Esta função tem como executar, de forma randômica, valores aleatórios no intervalo entre 1 e 1000
const _ = require('lodash');
setInterval(() => console.log(_.random(5, 60)), 2000);