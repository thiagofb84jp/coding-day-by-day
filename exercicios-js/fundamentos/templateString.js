//Concatenando constantes...
const nome = 'Rebeca';
const concatenacao = 'Olá ' + nome + '!';
const template = `
    Olá
    ${nome}`
console.log(concatenacao, template)

//Concatenando expressões
console.log(`1 + 1 = ${1 + 1}`);

//Dentro de um template string pode ser chamada uma função
const up = texto => texto.toUpperCase();
console.log(`Ei... ${up('cuidado!')}`)