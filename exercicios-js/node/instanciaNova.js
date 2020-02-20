/**
 * Pontos Importantes:
 * 1. Sem pontos para acrescentar.
 */

//Uma factory retorna um novo objeto
module.exports = () => {
    return {
        valor: 1,
        inc(){
            this.valor++;
        }
    }
}