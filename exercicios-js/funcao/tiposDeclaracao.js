/**
 * Pontos Importantes
 * 1. A diferença entre as chamadas funções 'declarada', 'expressa' e 'nomeada expressa'
 * é que: 
 * Função declarada => Pode-se declarar a função bem antes do código-fonte ter sido declarada;
 * Função expressa => Só permite que ela seja chamada depois de ela ter sido declarada no código-fonte;
 * Função expressa nomeada => Segue o mesmo comportamento da função expressa.
 */

 //Function declaration
 function soma(x, y){
    return x + y;
 }

 //Function expression
 const sub = function(x, y){
    return x - y;
 }

 //Named function expression
 const mult = function mult(x, y){
    return x * y;
 }