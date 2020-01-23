/**
 * Pontos Importantes:
 * 1. Nestes códigos existem diferentes formas de escrever as funções;
 * 2. São funções mais reduzidas para leitura do código-fonte;
 * 3. Existem momentos em que o 'this' não irá variar.
 * 
 */

function Pessoa(){
    this.idade = 0;

    setInterval(() => {
        this.idade++;
        console.log(this.idade);
    }, 1000)
}

new Pessoa;