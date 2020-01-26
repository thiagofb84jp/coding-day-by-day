/**
 * Pontos Importantes:
 * 1. Contexto Léxico é muito importante, pois, quando ela for declarada, ela carrega consigo 
 * (embora tenha sido chamada em outro local) o contexto no qual ela foi escrita.
 * Ela procura dentro do escopo léxico onde ela foi definida.
 */

const valor = 'Global';

function minhaFuncao(){
    console.log(valor);
}

function exec(){
    const valor = 'Local';
    minhaFuncao();
}

exec();