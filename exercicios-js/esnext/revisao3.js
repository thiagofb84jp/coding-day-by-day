/**
 * Pontos Importantes:
 * 1. Diferenças entre Object.values e Object.entries;
 * 2. Melhorias na notação literal entre objetos;
 * 3. Classe e herança;
 */

const obj = { a: 1, b: 2, c: 3}
console.log(Object.values(obj));
console.log(Object.entries(obj));

const nome = 'Carla';
const pessoa = {
    nome, 
    ola(){
        return 'Oi gente!';
    }
}

console.log(pessoa.nome, pessoa.ola());

class Animal {}
class Cachorro extends Animal {
    falar(){
        return 'Au! Au!';
    }
}

console.log(new Cachorro().falar());