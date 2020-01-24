/**
 * Pontos Importantes:
 * 1. Callback se trata de uma função para outra função, e quando um determinado evento ocorrer,
 *      essa função será chamada de volta (quando um evento ocorrer);
 * 2. Ela pode ser chamada uma ou mais de uma vez.
 */

const fabricantes = ["Mercedes", "Audi", "BMW\n"];

function imprimir(nome, indice){
    console.log(`${indice + 1}. ${nome}`);
}

fabricantes.forEach(imprimir);
fabricantes.forEach(fabricante => console.log(fabricante));