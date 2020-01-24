/**
 * Pontos Importantes:
 * 1. Caso queira criar uma função privada, pode-se usar o 'const' ou o 'let' antes da função dentro da classe.
 *          Caso seja recebido o 'this', está tornando esta função pública.
 */

function Carro(velocidadeMaxima = 200, delta = 5){
    //atributo privado
    let velocidadeAtual = 0;

    //método público
    this.acelerar = function(){
        if (velocidadeAtual + delta <= velocidadeMaxima) {
            velocidadeAtual+= delta;
        }else{
            velocidadeAtual = velocidadeMaxima;
        }
    }

    //método público
    this.getVelocidadeAtual = function(){
        return velocidadeAtual;
    }

    let setVelocidadeAtual = function(){
        return velocidadeAtual++;
    }
}

//criando uma instância do carro
const uno = new Carro;
uno.acelerar();
console.log(uno.getVelocidadeAtual());

const ferrari = new Carro(350, 20);
ferrari.acelerar();
ferrari.acelerar();
ferrari.acelerar();
console.log(ferrari.getVelocidadeAtual());

console.log(typeof Carro);
console.log(typeof ferrari);