/**
 * Pontos Importantes:
 * 1. É importante realizar o tratamento das falhas da forma mais elegante possível.
 */

function tratarErroELancar(erro){
    throw new Error('Ocorreu um problema. Por favor, verifique novamente.');
    //throw 10;
    //throw true;
    //throw 'mensagem';
    /*throw{
        nome: erro.name,
        msg: erro.message,
        date: new Date
    }*/
}

function imprimirNomeGritado(obj){
    try {
        console.log(obj.name.toUpperCase() + '!!!');    
    } catch (e) {
        tratarErroELancar(e);
    }finally{
        console.log('Sempre serei executado, ok?')
    }
}

const obj = { nome: 'Roberto' }
imprimirNomeGritado(obj);