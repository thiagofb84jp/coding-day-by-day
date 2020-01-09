//Armazenando uma função em uma variável

/**
 * 1. É possível criar funções da maneira mais tradicional da linguagem
 * 2. A 'arrow function' permite reduzir a forma como uma função é criada
 */
const imprimirSoma = function (a, b){
    console.log(a + b);
}

imprimirSoma(2, 3);

//Armazenando uma função arrow em uma variável (arrow function)
const soma = (a, b) => {
    return a + b;
}

console.log(soma(2, 3));

//Retorno implícito (diminuindo o escopo da arrow function)
const subtracao = (a, b) => a - b;

console.log(subtracao); //Retorno da função
console.log(subtracao(2, 3)); //Retorno do valor da função (-1)

//Reduzindo ainda mais o escopo da função
const imprimir = a => console.log(a);
imprimir('Legal!!');