/**
 * Pontos Importantes:
 * 1. Lembrando que o Array.prototype.push() adicoina um ou mais elementos ao final de um array e retorna
 *       o novo comprimento desse array.
 */

//Implementação do nosso próprio map
Array.prototype.map2 = function(callback){
    const newArray = [];
    for (let i = 0; i < this.length; i++) {
        newArray.push(callback(this[i], i, this));
    }
    return newArray;
}

const carrinho = [
    '{ "nome": "Borracha", "preco": 3.45 }',
    '{ "nome": "Caderno", "preco": 13.90 }',
    '{ "nome": "Kit de Lápis", "preco": 41.22 }',
    '{ "nome": "Caneta", "preco": 7.50 }',
]

//Retornar um array apenas com os preços

//Extração dos valores do JSON e convertendo-os para objeto
const paraObjeto = json => JSON.parse(json);
//Obtendo o preço do JSON de carrinho
const apenasPreco = produto => produto.preco;

const resultado = carrinho.map2(paraObjeto).map2(apenasPreco);
console.log(resultado);