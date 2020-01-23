/**
 * Pontos Importantes:
 * 1. Nestes códigos existem diferentes formas de escrever as funções;
 * 2. São funções mais reduzidas para leitura do código-fonte;
 * 3. Existem momentos em que o 'this' não irá variar;
 * 4. O 'this' em uma função comum Javascript pode variar conforme a chamada.
 * 5. O 'this', em uma função arrow, é um 'this' associado ao contexto no qual a função foi escrita. --> Importante
 */

let comparaComThis = function (param) {
    console.log(this === param);
}

comparaComThis(global); //true

const obj = {}
comparaComThis = comparaComThis.bind(obj);
comparaComThis(global); //false
comparaComThis(obj); //true

let comparaComThisArrow = param => console.log(this === param);
comparaComThisArrow(global); //false
comparaComThisArrow(module.exports); //true

comparaComThisArrow = comparaComThisArrow.bind(obj);
comparaComThisArrow(obj); //false
comparaComThisArrow(module.exports); //true