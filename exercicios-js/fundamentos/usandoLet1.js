/**
 * 1. Variáveis definidas com a palavra 'var' possuem o escopo global e escopo de função.
 * 2. Variáveis definidas com a palavra 'let' possuem o escopo gloabl, função e bloco.
 * 3. O 'let' possui um escopo a mais se comparado ao 'var'.
 */

// var numero = 1;
let numero = 1;
{
    //Neste caso, o 'let' estará visível apenas neste bloco de código
    let numero = 2;
    console.log('dentro = ', numero);
}
console.log('fora = ', numero)