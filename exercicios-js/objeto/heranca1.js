/**
 * Pontos Importantes:
 * 1. Prototype é a forma como se pode acessar um atributo de um conjunto de objetos;
 * 2. A forma como se é acessado o atributo de um objeto é o __proto__ (prototype) :-P;
 * 3. Um objeto em Javascript possui referência ao seu protótipo, e essa é a forma como o Javascript define 'Herança';
 * 4. A partir da referência de um protótipo, se pode ter uma outra referência para um outro objeto, e esse objeto
 *      tem atributos e comportamentos que podem ser acessados a partir de um objeto filho;
 * 5. Essa é uma forma de ter reusabilidade, não sendo necessário duplicar código.
 */

const ferrari = {
    modelo: 'F40',
    velMax: 324
}

const volvo = {
    modelo: 'V40',
    velMax: 200
}

//A partir do momento em que uma variável possui a descricao '__proto__', significa que ele está buscando
//  acessar o objeto pai
console.log(ferrari.__proto__);
console.log(ferrari.__proto__ === Object.prototype);
console.log(volvo.__proto__ === Object.prototype);
console.log(Object.prototype.__proto__ === null);

function MeuObjeto(){}
console.log(typeof Object, typeof MeuObjeto);
console.log(Object.prototype, MeuObjeto.prototype);