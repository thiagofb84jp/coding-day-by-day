/**
 * Pontos Importantes:
 * 1. Promise() é um objeto usado para processamento assíncrono. Um 'Promise' representa um valor que pode estar disponível
 *      agora, no futuro ou nunca.     
 */

function falarDepoisDe(segundos, frase){
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve(frase)
        }, segundos * 1000)
    })
}

falarDepoisDe(3, 'Que legal!')
    .then(frase => frase.concat('?!?'))
    .then(outraFrase => console.log(outraFrase))
    .catch(e => console.log(e)); //para tratar erros da promise