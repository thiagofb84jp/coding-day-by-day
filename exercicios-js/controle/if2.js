/**
 * Pontos Importantes:
 * 1. Cuidado com o ponto-e-vírgula no uso das estruturas de controle
 */

function teste1(num){
    if (num > 7){
        console.log(num);
    }
    console.log('Final');
}

//teste1(6);
//teste1(8);

function teste2(num){
    if (num > 7);{ //Cuidado com o ';'. Não usar com as estruturas de controle 
        console.log(num);
    }
}

teste2(6);
teste2(8);