
/**
 * Pontos Importantes:
 * 1. O método reduce() executa uma função reducer(provida por você) para cada membro do array, resultando
 *         num único valor de retorno;
 * 2. Função que serve para transformar o array em um único elemento.
 */

const alunos = [
    { nome: 'João', nota: 7.3, bolsista: false},
    { nome: 'Maria', nota: 9.2, bolsista: true},
    { nome: 'Pedro', nota: 9.8, bolsista: false},
    { nome: 'Ana', nota: 8.7, bolsista: true}
]

console.log(alunos.map(a => a.nota));

const resultado = alunos.map(a => a.nota).reduce(function(acumulador, atual){
    console.log(acumulador, atual);
    return acumulador + atual;
});

//Soma do resultado total
console.log(resultado);