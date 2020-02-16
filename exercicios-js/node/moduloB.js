/**
 * Pontos Importantes:
 * 1. Aquilo que se exporta para fora de um módulo é apenas o que estará visível para fora;
 */

module.exports = {
    bomDia: 'Bom dia',
    boaNoite(){
        return 'Boa noite';
    }
}