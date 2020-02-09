/**
 * Pontos Importantes:
 * 1. Neste código exibe a extração dos valores do JSON para Object;
 */

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

const resultado = carrinho.map(paraObjeto).map(apenasPreco);
console.log(resultado);