/**
 * Pontos Importantes:
 * 1. Neste bloco, tem-se exemplo de callback no browser;
 * 2. Para melhor compreensão, deve-se copiar/colar o código no console do browser (não se esqueça).
 */

document.getElementsByTagName('body')[0].onclick = function (e){
    console.log('O evento ocorreu!');
};