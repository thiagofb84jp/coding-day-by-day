/**
 * Pontos Importantes:
 * 1. A estrutura 'while' pode ser executada nenhuma (nunca entrar no laço) 
 * ou mais de uma vez;
 * 2. Trata-se de uma estrutura de repetição baseado nos valores 'true' ou 'false'
 * onde, enquanto for verdadeiro, o laço continua;
 * 3. Próprio para executar laços que possuem uma determinada quantidade de repetições.
 * 
 */

function getInteiroAleatorioEntre(min, max){
    const valor = Math.random() * (max - min) + min;
    return Math.floor(valor);
}

let opcao = 0;

while (opcao != -1) {
    opcao = getInteiroAleatorioEntre(-1, 10);
    console.log(`Opção escolhida foi ${opcao}.`);
}

console.log('Até a próxima!');