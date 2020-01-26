/**
 * Pontos Importantes:
 * 1. Função Factory é uma função que retorna um objeto (sempre retorna um novo objeto a partir da chamada da função).
 */

 //Forma simples de criar uma função
const prod1 = {
    nome: 'Produto 1',
    preco: 45
}

const prod2 = {
    nome: 'Produto 2',
    preco: 58
}

//Factory simples
function criarPessoa(){
    return {
        nome: 'Ana',
        sobrenome: 'Silva'
    }
}

console.log(criarPessoa());