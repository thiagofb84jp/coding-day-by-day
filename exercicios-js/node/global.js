/**
 * Pontos Importantes:
 * 1. Cuidado, pois, sempre que se mexe com um objeto global compartilhado, as chances de se terem
 *      problemas são bem maiores. O sistema de módulos do Node vem justamente para resolver esse tipo
 *      de problema;
 * 2. Lembre-se de que, deixando de forma global, qualquer arquivo do sistema terá acesso a sua App;
 */

global.MinhaApp = Object.freeze({
    saudacao(){
        return 'Estou em todos os lugares!';
    },
    nome: 'Sistema Legal'
});