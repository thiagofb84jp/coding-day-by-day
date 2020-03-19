/**
 * Pontos Importantes da revisão:
 * 1. Conceito de 'Arrow Function' (lembre-se: são funções anônimas);
 * 2. Arrow Function com 'this';
 * 3. Parâmetro default;
 * 4. Operador 'Rest' (ou Spread);
 */


const soma = (a, b) => a + b;
console.log(soma(2, 3));

const lexico1 = () => console.log(this === exports);
const lexico2 = lexico1.bind({});
lexico1(); //true
lexico2(); //true

function log(texto = 'Node'){
    console.log(texto);
}

log();
log('Sou mais forte');

function total(...numeros){
    let total = 0;
    numeros.forEach(n => total += n);
    return total;
}

console.log(total(2, 3, 4, 5));