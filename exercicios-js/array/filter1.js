/**
 * Pontos Importantes:
 * 1. O método filter() cria um novo array com todos os elementos que passaram no teste implementado pela
 *       função fornecida;
 * 2. Uma função 'callback' é uma função passada a outra função como argumento, o que é então invocado dentro
 *       da função externa para completar algum tipo de rotina ou ação.
 */

const produtos = [
    { nome: 'Notebook', preco: 2499, fragil: true },
    { nome: 'iPad Pro', preco: 4199, fragil: true },
    { nome: 'Copo de Vidro', preco: 12.49, fragil: true },
    { nome: 'Copo de Plástico', preco: 18.99, fragil: false }
]

console.log(produtos.filter(function(p){
    return false;
}));

console.log(produtos.filter(function(p){
    return p.preco > 2400;
}));

console.log(produtos.filter(function(p){
    return p.fragil === false;
}));

//Areo function na qual retorna todos os produtos com valor acima de R$ 500 reais e todos os produtos que são frágeis
const caro = produto => produto.preco >= 500;
const fragil = produto => produto.fragil;

console.log(produtos.filter(caro).filter(fragil));