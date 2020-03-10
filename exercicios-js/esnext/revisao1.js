/**
 * Pontos Importantes da primeira revisão:
 * 1. Diferenças entre 'var' e 'let';
 * 2. Template String;
 * 3. Destructuring;
 */

//let e const
{
    var a = 2;
    let b = 3;
    console.log(b); //acessível apenas dentro do escopo (no caso do 'let')
}

console.log(a); //acessível fora do escopo (no caso do 'var')

//Template String
const produto = 'iPad';
console.log(`${produto} é caro!`);

//Destructuring (retira algo de dentro de uma estrutura -> objeto, array, String, entre outros)
const [l, e, ...tras] = "Cod3r";
console.log(l, e, tras);

const [x, y] = [1, 2, 3]
console.log(x, y);

const { idade: i, nome } = { nome: 'Ana', idade: 9 }
console.log(i, nome);