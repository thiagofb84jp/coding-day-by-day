/**
 * Pontos Importantes:
 * 1. A diferença da chamada de uma função por 'Call' e outra por 'Apply' é a passagem dos parâmetros, ou seja,
 *      a forma como os parâmetros serão chamados.
 */

function getPreco(imposto = 0, moeda = 'R$'){
    return `${moeda} ${this.preco * (1 - this.desc) * (1 + imposto)}`
}

const produto = {
    nome: 'Notebook',
    preco: 4589,
    desc: 0.15,
    getPreco
}

global.preco = 20;
global.desc = 0.1;
console.log(getPreco());
console.log(produto.getPreco());

const carro = { preco: 49990, desc: 0.20}

console.log(getPreco.call(carro));
console.log(getPreco.apply(carro));

//Na passagem da função por 'Call', a chamada é diretamente pelos parâmetos da função
//O primeiro parâmetro é o contexto e os demais parâmetros que ele vai passar para a função
console.log(getPreco.call(carro, 0.17, '$'));

//Na passagem da função por 'Apply', a chamada também é diretamente pelos parâmetos da função
//O primeiro parâmetro é o contexto e os demais parâmetros que ele vai passar para a função devem ser por array
console.log(getPreco.apply(global, [0.17, '$']));