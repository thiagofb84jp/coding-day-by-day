/**
 * Operador ternário = possui mais de 3 (três) operandos
 * O operador ternário é composto por 3 (três partes):
 * => 1ª parte é uma expressão que vai retornar sempre verdadeiro ou falso
 * => 2ª parte é o resultado que vai ser retornado quando a expressão for verdadeira
 * => 3ª parte é o resultado que vai ser retornado quando a expressão for falsa
 */

const resultado = nota => nota >= 7 ? 'Aprovado' : 'Reprovado';

console.log(resultado(7.1)); //Aprovado
console.log(resultado(6.9)); //Reprovado

//Outra forma de utilizar os operadores ternários
const resultadoNota = nota =>{
    return nota >= 7 ? 'Aprovado' : 'Reprovado';
}

console.log(resultadoNota(7.1)); //Aprovado
console.log(resultadoNota(6.9)); //Reprovado