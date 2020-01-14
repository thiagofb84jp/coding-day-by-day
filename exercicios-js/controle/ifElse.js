/**
 * Pontos Importantes:
 * 1. O Javascript realiza a comparação de inteiro com String. :O
 * 
 */

const imprimirResultado = function(nota){
    if (nota >= 7) {
        console.log('Aprovado');
    }else{
        console.log('Reprovado');
    }
}

imprimirResultado(10);
imprimirResultado(4);
imprimirResultado('Epa!'); //Cuidado para evitar esse tipo de comparação!