function soBoaNoticia(nota){
    if (nota >= 7) {
        console.log('Aprovado com ' + nota);
    }else{
        console.log('Reprovado com ' + nota);
    }
}

soBoaNoticia(7.1);
soBoaNoticia(6.9);

//Se a cláusula for verdadeira, irá passar
//Detalhe: não foi necessário passar 'true' nesse trecho :O
function seForVerdadeEuFalo(valor){
    if (valor) {
        console.log('É verdade...' + valor);
    }
}

seForVerdadeEuFalo();
seForVerdadeEuFalo(null);
seForVerdadeEuFalo(undefined);
seForVerdadeEuFalo(NaN);
seForVerdadeEuFalo('');
seForVerdadeEuFalo(0);
seForVerdadeEuFalo(-1); //true
seForVerdadeEuFalo(' '); //true
seForVerdadeEuFalo('?'); //true
seForVerdadeEuFalo([]);
seForVerdadeEuFalo([1, 2]); //true
seForVerdadeEuFalo({}); //true