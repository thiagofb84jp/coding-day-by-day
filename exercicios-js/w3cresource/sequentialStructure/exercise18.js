/**
 * Faça um programa que peça o tamanho de um arquivo para download (em MB) e a 
 *  velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado 
 *      de download do arquivo usando este link (em minutos).
 */

calcTempoAproxDownArquivo = (arquivo, velocidade) => {
    let tempo = arquivo / velocidade;
    let minuto = tempo / 60;

    console.log("O tempo aproximado para download do arquivo " + arquivo + "(MB) usando este link " + velocidade.toFixed(2)
    + "(MB) é de " + minuto.toFixed(2) + "minuto(s)");
}

calcTempoAproxDownArquivo(80, 5);