/**
 * Pontos Importantes:
 * 1. Funções anônimas são funções sem nome;
 * 2. Ela é muito recorrente dentro da linguage :-O
 * 3. Pode ser passado uma função anônima dentro de um objeto.
 */

const soma = function (x, y){
    return x + y;
}

const imprimirResultado = function(a, b, operacao = soma){
    console.log(operacao (a, b));
}

imprimirResultado(3, 4); //o valor será 7
imprimirResultado(3, 4, soma); //valor será 7
//Por aqui também pode ser passada uma função anônima
imprimirResultado(3, 4, function (x, y){
    return x - y;
}); //o valor será -1;
imprimirResultado(3, 4, (x, y) => x * y); //o valor será igual a 12

const pessoa = {
    falar: function(){
        console.log('Opa');
    } 
}

pessoa.falar();