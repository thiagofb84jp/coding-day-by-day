/**
 * Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: 
 *      F - Feminino, M - Masculino, Sexo Inválido.
 */

verificarSexo = (s) => {
    if (s === 'M') {
        console.log('M - Masculino');
    } else if (s === 'F') {
        console.log('F - Feminino');
    } else {
        console.log('Sexo inválido.');
    }
}

verificarSexo('M');
verificarSexo('F');
verificarSexo('A');