/**
 * Pontos Importantes:
 * 1. Cadeia de Protótipos são objetos de protótipos dos quais herdam métodos e propriedades fornecidos por 
 *      herança por outros objetos de protótipos;
 * 2. A função que estabelece uma relação de protótipo entre dois objetos é a 'Object.setPrototypeOf';
 * 3. O tipo de manipulação pelo atributo do protótipo deve ser evitada a todo o custo.
 */

//Cadeia de protótipos (prototype chain)
Object.prototype.atrr0 = '0'; //Esse tipo de manipulação não deve ser feita!
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

const ferrari = {
    modelo: 'F40',
    velMax: 324 //shadowing
}

const volvo = {
    modelo: 'V40',
    status(){
        return `${this.modelo}: ${super.status()}`;
    }
}

Object.setPrototypeOf(ferrari, carro);
Object.setPrototypeOf(volvo, carro);

console.log(ferrari);
console.log(volvo);

volvo.acelerarMais(300);
console.log(volvo.status());

ferrari.acelerarMais(300);
console.log(ferrari.status());