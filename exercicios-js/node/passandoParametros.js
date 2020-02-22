/**
 * Pontos Importantes:
 * 1. Esta aula exibe a forma de como passar parâmetros colocando uma função.
 */

module.exports = function(... nomes){
    return nomes.map(nome => `Boa semana ${nome}!`);
}