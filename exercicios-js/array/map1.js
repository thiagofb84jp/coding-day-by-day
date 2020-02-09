/**
 * Pontos Importantes:
 * 1. Serve para fazer uma transformação/mapear os elementos do Array;
 * 2. A ideia é mapear um Array para um outro Array do mesmo tamanho, só que com os dados transformados; 
 * 3. Invoca a função callback passada por argumento para cada elemento do Array e devolve um novo Array como resultado;
 * 4. Lembre-se que a função 'arrow' tem um retorno implícito.
 */

const nums = [1, 2, 3, 4, 5];

//For com propósito
let resultado = nums.map(function(e){
    return e * 2;
});

console.log(resultado);

//Função arrow (ela tem um retorno implícito)
const soma10 = e => e + 10;
const triplo = e => e * 3;
const paraDinheiro = e => `R$ ${parseFloat(e).toFixed(2).replace('.', ',')}`;

resultado = nums.map(soma10).map(triplo).map(paraDinheiro);
console.log(resultado);