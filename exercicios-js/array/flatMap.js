/**
 * Pontos Importantes:
 * 1. FlatMap é um map associado com um concat. É ter uma matriz e achatá-la em um único Array;
 * 2. Na função 'FlatMap', há primeiro o mapeamento de cada um dos elementos usando uma função de mapeamento, para 
 *      logo em seguida nivelar os resultados e inseri-los em um novo Array.
 */

const escola = [{
    nome: 'Turma M1',
    alunos: [{
        nome: 'Gustavo',
        nota: 8.1
    },{
        nome: 'Ana',
        nota: 9.3
    }]
}, {
    nome: 'Turma M2',
    alunos: [{
        nome: 'Rebeca',
        nota: 8.9
    },{
        nome: 'Roberto',
        nota: 7.3
    }]
}]

const getNotaDoAluno = aluno => aluno.nota;
const getNotasDaTurma = turma => turma.alunos.map(getNotaDoAluno);

const notas1 = escola.map(getNotasDaTurma);
console.log(notas1);

//Execução dos resultados das notas sem a inclusão do 'FlatMap()'
console.log([].concat([ 8.1, 9.3 ], [ 8.9, 7.3 ]));

//Desenvolvimento da função 'FlatMap'
Array.prototype.flatMap  = function(callback){
    return Array.prototype.concat.apply([], this.map(callback));
}

const notas2 = escola.flatMap(getNotasDaTurma);
console.log(notas2);