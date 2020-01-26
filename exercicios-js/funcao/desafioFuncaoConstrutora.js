/**
 * Pontos Importantes:
 * 1. Neste exemplo foi criada uma função construtora da classe 'Pessoa';
 * 2. Lembrando que podem ser criados objetos a partir de:
 * - Função construtora;
 * - Classe;
 * - Função factory.
 */

/*
//Classe
class Pessoa{
    constructor(nome){
        this.nome = nome;
    }

    falar(){
        console.log(`Meu nome é ${this.nome}`);
    }
}
*/

//Função construtora da classe 'Pessoa'
function Pessoa(nome){
    this.nome = nome;

    this.falar = function(){
        console.log(`Meu nome é ${this.nome}`);
    }
}

const p1 = new Pessoa('João');
p1.falar();