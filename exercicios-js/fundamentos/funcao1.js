//Função sem retorno
function imprimirSoma(valor1, valor2 = 0){
    let somar = valor1 + valor2;
    console.log(somar);
}

imprimirSoma(2, 3);
imprimirSoma(2); //Caso não seja passado nenhum parâmetro, a função vai resultado em valor '0' (zero)
imprimirSoma(2, 3, 5, 6, 10, 22, 777);
imprimirSoma();

//Função com retorno
function soma(a = 0, b = 0){
    return a + b;
}

console.log(soma(2, 3));
console.log(soma(2));
console.log(soma());