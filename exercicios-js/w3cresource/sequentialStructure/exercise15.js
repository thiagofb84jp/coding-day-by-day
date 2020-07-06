/**
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
 *  Calcule e mostre o total do seu salário no referido mês, sabendo-se que são 
 *  descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, 
 * faça um programa que nos dê:
    a) salário bruto.
    b) quanto pagou ao INSS.
    c) quanto pagou ao sindicato.
    d) o salário líquido.
 */

calcSalarioLiquido = (qtdValorHora, horasTrabalhadas) => {
    let salarioBruto = qtdValorHora * horasTrabalhadas;

    let impostoRenda = (11 / 100 * salarioBruto);
    let inss = (8 / 100 * salarioBruto);
    let sindicato = (5 / 100 * salarioBruto);

    valorTotal = impostoRenda + inss + sindicato;
    salarioLiquido = salarioBruto - valorTotal;

    console.log("************ Cálculo do Salário ************");
    console.log("Seu salário bruto é de : " + salarioBruto);
    console.log("Seu salário líquido é de: " + salarioLiquido + "\n");
    
    console.log("************ Valor dos impostos ************");
    console.log("Imposto de Renda: " + impostoRenda);
    console.log("INSS: " + inss);
    console.log("Sindicato: " + sindicato);
}

calcSalarioLiquido(20, 100);