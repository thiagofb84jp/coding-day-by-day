/**
 * 1. Diferentemente de outras linguagens, a variável 'sera' ficará visível para todos, mesmo estando fora do bloco;
 * 2. Pode-se criar uma variável (var) que pode ser acessada globalmente ou dentro da função (localmente) 
 * 
 */
{
    {
        {
            {
                var sera = 'Será';
                console.log(sera);
            }
        }
    }
}

console.log(sera);

//A variável estará disponível apenas dentro da função
function teste(){
    var local = 123;
    console.log(local);
}

teste();
console.log(local);