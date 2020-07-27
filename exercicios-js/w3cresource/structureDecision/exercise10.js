/**
 * Faça um Programa que pergunte em que turno você estuda. Peça para digitar
 *  M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", 
 *      "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
 */

turnoEstudos = (turno) => {
    let message;

    switch (turno.toUpperCase()) {
        case "M":
            message = console.log("Bom dia!");
            break;
        case "V":
            message = console.log("Boa tarde!");
            break;
        case "N":
            message = console.log("Boa noite!");
            break;
        default:
            message = console.log("Valor Inválido! Por favor, digite outro valor.");
            break;
    }

    return message;
}

turnoEstudos("M");
turnoEstudos("v");
turnoEstudos("n");
turnoEstudos("i");