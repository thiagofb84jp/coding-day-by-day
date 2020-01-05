const peso1 = 1.0;
const peso2 = Number('2.0');

console.log(peso1, peso2);
console.log(Number.isInteger(peso1));
console.log(Number.isInteger(peso2));

const avaliacao1 = 9.871;
const avaliacao2 = 6.871;

const total = avaliacao1 * peso1 + avaliacao2 * peso2;
const media = total / (peso1 + peso2);

console.log(media.toFixed(2)); //Limita a quantidade de casas decimais sendo exibidas no resultado
console.log(media.toFixed(2).toString()); //Transforma a média em um valor String
console.log(media.toString(2)); //Transforma a média em um valor binário
console.log(typeof media); //Extrai o tipo da variável 'media' (tipo do dado)
console.log(typeof Number); //Tipo da função