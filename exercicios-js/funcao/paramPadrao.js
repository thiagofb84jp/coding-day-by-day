/**
 * Pontos Importantes:
 * 1. O 'this' pode variar conforme a função é chamada;
 * 2. Caso seja usada uma 'aeroFunction' o 'this' não irá variar nunca.
 * 
 */

 //Estratégia 1 para gerar valor padrão
function soma1(a, b, c){
    a = a || 1; //Forma de atribuir um valor padrão e realizar um comparativo
    b = b || 1;
    c = c || 1;

    return a + b + c;
}

console.log(soma1(), soma1(3), soma1(1, 2, 3), soma1(0, 0, 0));

function soma2(a, b, c){
    a = a !== undefined ? a : 1;
    b = 1 in arguments ? b : 1;
    c = isNaN(c) ? 1 : c; //Montagem da função para resolver valores zerados

    return a + b + c;
}

console.log(soma2(), soma2(3), soma2(1, 2, 3), soma2(0, 0, 0));

//Valor padrão do es2015 (Ection )
function soma3(a = 1, b = 1, c = 1){
    return a + b + c;
}

console.log(soma3(), soma3(3), soma3(1, 2, 3), soma3(0, 0, 0));