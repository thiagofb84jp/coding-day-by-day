/**
 * Pontos Importantes:
 * 1. As 'Tagged Templates' processam o template dentro de uma função;
 */

function tag(partes, ...valores){
    console.log(partes);
    console.log(valores);
    return 'Outra string';
}

const aluno = 'Gui';
const situacao = 'Aprovado';
console.log(tag `${aluno} está ${situacao}`);