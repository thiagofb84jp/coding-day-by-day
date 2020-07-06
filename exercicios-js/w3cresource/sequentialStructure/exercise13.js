/**
 * Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
    a) Para homens: (72.7*h) - 58
    b) Para mulheres: (62.1*h) - 44.
 */

function pesoIdeal(altura) {
    let pesoIdealHomem = (72.7 * altura) - 58;
    let pesoIdealMulher = (62.1 * altura) - 44.7;

    console.log("O peso ideal para um homem é de: " + pesoIdealHomem.toFixed(2));
    console.log("O peso ideal para uma mulher é de: " + pesoIdealMulher.toFixed(2));
}

pesoIdeal(1.95);