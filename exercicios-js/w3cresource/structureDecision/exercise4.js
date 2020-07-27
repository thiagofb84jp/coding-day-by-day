/**
 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 */

vogalOuConsoante = (letra) => {
    if (letra === 'a' || letra === 'e' || letra === 'i' || letra === 'o' || letra === 'u') {
        console.log('A letra "' + letra + '" é uma vogal.');
    } else {
        console.log('A letra "' + letra + '" é uma consoante.');
    }
}

vogalOuConsoante('a');
vogalOuConsoante('x');
vogalOuConsoante('e');
vogalOuConsoante('y');