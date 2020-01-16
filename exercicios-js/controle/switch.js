/**
 * Pontos Importantes:
 * 1. O valor que é passado como entrada para o switch não é uma expressão que retorne 
 * verdadeiro ou falso, mas um valor inteiro;
 * 2. Em Javascript, existem formas diferentes de se montar a estrutura do case (conforme pode ser visto 
 * logo abaixo)
 * 3. Trata-se de uma seleção múltipla
 */

const imprimirResultado = function (nota){
    switch (Math.floor(nota)){
        case 10:
        case 9:
            console.log('Quadro de honra');
            break;
        case 8: case 7:
            console.log('Aprovado');
            break;
        case 6: case 5: case 4:
            console.log('Recuperação');
            break;
        case 3: case 2: case 1: case 0:
            console.log('Reprovado');
            break;
        default:
            console.log('Nota inválida');
    }
}

imprimirResultado(10);
imprimirResultado(8.9);
imprimirResultado(6.55);
imprimirResultado(2.3);
imprimirResultado(-1);
imprimirResultado(11);