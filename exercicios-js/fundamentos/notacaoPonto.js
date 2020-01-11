/**
 * Pontos importantes:
 * 1. A anotação ponto (.) é importante na forma de organização do Javascript, pois
 *      é possível acessar os membros de uma função a partir desta notação.
 */

console.log(Math.ceil(6.1)); //Realiza o arredondamento da função

//A notação ponto (.) cria dinamicamente algo (um objeto, por exemplo)
const obj1 = {}
obj1.nome = 'Bola';
//obj1['nome'] = 'Bola2'; -> Outra forma de criar um objeto
console.log(obj1.nome);

function Obj(nome){
    this.nome = nome;
    this.exec = function(){
        console.log('Exec...');
    }
}

const obj2 = new Obj('Cadeira');
const obj3 = new Obj('Mesa');
console.log(obj2.nome);
console.log(obj3.nome);
obj3.exec();