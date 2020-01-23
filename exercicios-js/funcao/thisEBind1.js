/**
 * Pontos Importantes:
 * 1. O 'bind()' é quando se passa um objeto no qual seja resolvido o 'this';
 * 2. Trata-se do método (bind() function) responsável por amarrar o objeto sempre que o método for executado;
 * 3. Ele amarra um tipo específico.
 */

const pessoa = {
    saudacao: 'Bom dia!',
    falar(){
        console.log(this.saudacao);
    }
}

pessoa.falar(); //imprime a saudação do objeto 'pessoa'
const falar = pessoa.falar;
falar(); //O resultado será 'undefined' -> Conflito entre paradigmas: funcional e OO

const falarDePessoa = pessoa.falar.bind(pessoa);
falarDePessoa(); //bind() auxiliou a amarrar o objeto 'pessoa'

const falar2 = pessoa.falar;
falar2();