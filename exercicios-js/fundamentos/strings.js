
/**
 * Char = Recebe apenas um único caractere
 * String = Cadeia de caracteres
 * Pode-se delimitar uma String com aspas duplas (" ") ou aspas simples (' ')
 * Ponto importante: A linguagem Javascript dificilmente retornará uma mensagem de falha
 * Contudo, a permissividade da linguagem pode gerar alguns problemas (a exemplo do PHP :P)
 */

const escola = "Cod3r";

console.log(escola.charAt(4)); //Retorna o caractere 'r'
console.log(escola.charAt(5)); //Não retorna nada (valor vazio)
console.log(escola.charCodeAt(3)); //Retorna o valor dentro da tabela ASCII
console.log(escola.indexOf('C')); //Retorna o índice no qual o valor se encontra na frase

console.log(escola.substring(1)); //Retorna o valor a partir do primeiro índice em diante
console.log(escola.substring(0, 3)); //Retorna o valor delimitado pelo que foi repassado nos índices

console.log('Escola '.concat(escola).concat("!")) //Retorna os valores concatenados
console.log(escola.replace(/\d/, 'e')); //Usando regex

console.log('Ana, Maria, Pedro'.split(',')); //Forma de separação usando as vírgulas
console.log('Ana, Maria, Pedro'.split(/,/)); //Forma de separação das vírgulas usando o regex

let name = 'John'
console.log('Mary loves' , name); //A forma de separação utilizada é a vírgula e não o '+', conforme é em Java