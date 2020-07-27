/**
 * Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. 
 *      A atribuição de conceitos obedece à tabela abaixo:
 */

calcularMedia = (nota1, nota2) => {
    let conceito;
    let mensagem;

    let media = (nota1 + nota2) / 2;

    if ((media > 9) && (media <= 10)) {
        conceito = "A";
        mensagem = "Aprovado";
    } else if ((media > 7.5) && (media <= 9)) {
        conceito = "B";
        mensagem = "Aprovado";
    } else if ((media > 6.0) && (media <= 7.5)) {
        conceito = "C";
        mensagem = "Aprovado";
    } else if ((media > 4.0) && (media <= 6.0)) {
        conceito = "D";
        mensagem = "Reprovado";
    } else if (media < 4.0) {
        conceito = "E";
        mensagem = "Reprovado";
    }

    console.log("******************************************");
    console.log("As notas informadas: " + nota1 + " e " + nota2);
    console.log("A média: " + media.toFixed(2));
    console.log("O conceito foi " + conceito + ". Portanto, você foi " + mensagem + ".");
    console.log("******************************************");
}

calcularMedia(10, 10);
calcularMedia(9.2, 9.1);
calcularMedia(8.5, 8.2);
calcularMedia(6.5, 6.6);
calcularMedia(5.2, 5.9);
calcularMedia(3.6, 2.3);