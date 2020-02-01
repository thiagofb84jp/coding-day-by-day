/**
 * Pontos Importantes:
 * 1. Cadeia de Protótipos são objetos de protótipos dos quais herdam métodos e propriedades fornecidos por 
 *      herança por outros objetos de protótipos.
 */

//Cadeia de protótipos (prototype chain)
Object.prototype.atrr0 = '0';
const avo = { atrr1 : 'A' };
const pai = { __proto__: avo, attr2: 'B', attr3: '3' };
const filho = { __proto__: pai, attr3: 'C' };
console.log(filho.atrr0, filho.atrr1, filho.attr2, filho.attr3); // 0 A B C

const carro = {
    velAtual: 0,
    velMax: 200,
    acelerarMais(delta){
        if (this.velAtual + delta <= this.velMax) {
            this.velAtual += delta;
        }else{
            this.velAtual = this.velMax;
        }
    },
    status(){
        return `${this.velAtual}Km/h de ${this.velMax}Km/h`;
    }
}