/**
 * Pontos Importantes:
 * 1. A partir da função 'create', foi possível criar um novo objeto filho para o objeto de origem.
 *      A partir dele, outros atributos poderão ser criados;
 */

const pai = { nome: 'Pedro', corCabelo: 'preto'}

const filha1 = Object.create(pai);
filha1.nome = 'Ana';
console.log(filha1.corCabelo);

const filha2 = Object.create(pai, {
    nome: { value: 'Bia', writable: false, enumerable: true }
});

console.log(filha2.nome);
filha2.nome = 'Carla';
console.log(`${filha2.nome} tem cabelo ${filha2.corCabelo}`);

console.log(Object.keys(filha1));
console.log(Object.keys(filha2));

//Forma de percorrer os atributos de um protótipo
for(let key in filha2){
    filha2.hasOwnProperty(key) ?
        console.log(key) : console.log(`Por herança: ${key}`);
}