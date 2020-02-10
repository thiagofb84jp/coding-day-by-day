/**
 * Pontos Importantes:
 * 1. A programação 'Imperativa' se baseia em se espeificar os passos que um programa deve seguir para
 *      alcançar um estado desejado (também é conhecido como PROCEDURAL);
 * 2. A abordagem 'Imperativa' ensina exatamente os passos nos quais devem ser feitos para se atingir
 *      um determinado objetivo, sem deixar nenhum detalhe faltando (o foco é no COMO e não no QUE 
 *      tem que ser feito);
 * 3. A programação 'Declarativa' é um paradigma de programação baseado em programação funcional, 
 *      programação lógica ou programação restritiva, onde ensina o que tem que ser feito, onde internamente 
 *      as coisas vão sendo feitas aos poucos.
 */

const alunos = [
    { nome: 'João', nota: 7.9 },
    { nome: 'Maria', nota: 9.2 }
]

//Abordagem Imperativa
let total1 = 0;
for (let i = 0; i < alunos.length; i++) {
    total1 += alunos[i].nota;
}

console.log(total1 / alunos.length);

//Abordagem Declarativa
const getNota = aluno => aluno.nota;
const soma = (total, atual) => total + atual;
const total2 = alunos.map(getNota).reduce(soma);
console.log(total2 / alunos.length);