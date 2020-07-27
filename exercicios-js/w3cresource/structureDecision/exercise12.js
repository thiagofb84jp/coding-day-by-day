/**
 * Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), 
 *      se digitar outro valor deve aparecer valor inválido.
 */

function diaDaSemana(diaSemana) {
    switch (diaSemana) {
        case 1:
            console.log("1 - Segunda");
            break;
        case 2:
            console.log("2 - Terça");
            break;
        case 3:
            console.log("3 - Quarta");
            break;
        case 4:
            console.log("4 - Quinta");
            break;
        case 5:
            console.log("5 - Sexta");
            break;
        case 6:
            console.log("6 - Sábado");
            break;
        case 7:
            console.log("7 - Domingo");
            break;
        default:
            console.log("Valor inválido! Por favor, digite outro.");
            break;
    }
}

diaDaSemana(1);
diaDaSemana(5);
diaDaSemana(8);