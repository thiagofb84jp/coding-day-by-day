/**
 * Pontos Importantes:
 * 1. O 'arguments' é um array interno em que toda função tem esse array disponível;
 * 2. Quando nenhum parâmetro é passado este array permanece vazio;
 */

function soma(){
    let soma = 0;
    for(i in arguments){
        soma += arguments[i];
    }
    return soma;
}

console.log(soma());
console.log(soma(1));
console.log(soma(1.1, 2.2, 3.3));
console.log(soma(1.1, 2.2, "Teste")); //A função concatena a String repassada (soma os dois valores e concatena a String)
console.log(soma('a', 'b', 'c'));