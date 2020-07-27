/**
 * Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
 */

resultadoFinal = (x, y) => {
    let media = (x + y) / 2;

    if (media === 10) {
        console.log("Aprovado com louvor.");
    } else if (media >= 7) {
        console.log("Aprovado.");
    } else {
        console.log("Reprovado.");
    }
}

resultadoFinal(10, 10);
resultadoFinal(10, 9);
resultadoFinal(5, 3);