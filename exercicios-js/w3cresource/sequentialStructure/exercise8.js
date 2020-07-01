/**
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário 
 *  no referido mês.
 */

function calcTotalDeHorasTrabalhadas(valorHora, numHorasTrabalhadas) {
    let valorTotal = valorHora * numHorasTrabalhadas;

    console.log('Você receberá neste mês o total de R$ ' + valorTotal);
}

calcTotalDeHorasTrabalhadas(8.66, 170);