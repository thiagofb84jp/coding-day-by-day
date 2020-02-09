/**
 * Pontos Importantes:
 * 1. Nesta aula tem-se um exemplo do 'array filter' implementado sem a chamada da biblioteca nativa do 
 *       Javascript;
 */

Array.prototype.filter2 = function(callback){
    const newArray = [];
    for (let i = 0; i < this.length; i++) {
        if (callback(this[i], i, this)) {
            newArray.push(this[i]);
        }
    }
    return newArray;
}

const produtos = [
    { nome: 'Notebook', preco: 2499, fragil: true },
    { nome: 'iPad Pro', preco: 4199, fragil: true },
    { nome: 'Copo de Vidro', preco: 12.49, fragil: true },
    { nome: 'Copo de Plástico', preco: 18.99, fragil: false }
]

console.log(produtos.filter2(function(p){
    return false;
}));

console.log(produtos.filter2(function(p){
    return p.preco > 2400;
}));

console.log(produtos.filter2(function(p){
    return p.fragil === false;
}));

//Areo function na qual retorna todos os produtos com valor acima de R$ 500 reais e todos os produtos que são frágeis
const caro = produto => produto.preco >= 500;
const fragil = produto => produto.fragil;

console.log(produtos.filter2(caro).filter2(fragil));