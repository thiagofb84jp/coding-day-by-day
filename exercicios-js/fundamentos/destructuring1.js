/**
 * Pontos importantes:
 * 1. Caso tente desestruturar um dado aninhado, é preciso ter certeza de que esse dado exista!
 */

//Novo recurso do ES2015
const pessoa = {
    nome: 'Ana',
    idade: 5,
    endereco: {
        logradouro: 'Rua ABC',
        numero: 1000
    }
}

//Tire do objeto 'pessoa' o nome e a idade
const { nome, idade } = pessoa;
console.log(nome, idade);

//Esta é outra forma de extrair os valores do objeto pessoa ('nome' e 'idade')
const {nome: n, idade: i} = pessoa;
console.log(n, i);

//Sempre que puder, sete nulo para os atributos undefined
const { sobrenome, bemHumorada = true } = pessoa;
console.log(sobrenome, bemHumorada);

 const { endereco: { logradouro, numero, cep } } = pessoa;
 console.log(logradouro, numero, cep);

 //Caso tente acessar um atributo que não exista, vai dar problema!
 //Esses são atributos que não existem dentro do objeto 'pessoa'
 const { conta: { ag, num } } = pessoa;
 console.log(ag, num);