/**
 * Pontos Importantes:
 * 1. Quando o atributo se encontra com um underline à frente (_var), ele se trata de um atributo privado.
 *      O Javascript permite que essa variável seja acessada normalmente, tratando-se apenas de uma convenção da
 *          linguagem.
 * 2. Javascript NÃO aceita sobrecarga de métodos (ter vários métodos com o mesmo nome, mas com parâmetros diferentes);
 * 3. Convenciona-se atributos dito privados (com o '_var'), e se inserem getters e setters para acessar os valores
 *      de forma mais controlada.
 */

const sequencia = {
    _valor: 1, //convenção
    get valor() { return this._valor++},
    set valor(valor){
        if (valor > this._valor) {
            this._valor = valor;
        }
    }
}

console.log(sequencia.valor, sequencia.valor);
sequencia.valor = 1000;
console.log(sequencia.valor, sequencia.valor);
sequencia.valor = 900;
console.log(sequencia.valor, sequencia.valor);