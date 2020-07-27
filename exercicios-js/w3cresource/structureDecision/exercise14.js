/**
 * Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda.
 */

calcularFolhaPagamento = (horasTrabalhadas, valorHora) => {
    let salarioBruto = horasTrabalhadas * valorHora;

    calcDescontosEImprimeFolhaPagamento(salarioBruto);
}

calcDescontosEImprimeFolhaPagamento = (salarioBruto) => {
    let descSindicato = (salarioBruto / 100) * 3;
    let fgts = (salarioBruto / 100) * 11;

    let salarioLiquido;
    let ir = 0;
    if (salarioBruto <= 900) {
        salarioLiquido = salarioBruto - descSindicato;
    } else if (salarioBruto <= 1500) {
        ir = (salarioBruto / 100) * 5;
        salarioLiquido = salarioBruto - descSindicato - ir;
    } else if (salarioBruto <= 2500) {
        ir = (salarioBruto / 100) * 10;
        salarioLiquido = salarioBruto - descSindicato - ir;
    } else {
        ir = (salarioBruto / 100) * 20;
        salarioLiquido = salarioBruto - descSindicato - ir;
    }

    console.log('/**********************************************/');
    console.log('Salário bruto (R$): ', salarioBruto.toFixed(2));
    console.log('Desconto sindicato (R$): ', descSindicato.toFixed(2));
    console.log('Imposto de Renda (R$): ', ir.toFixed(2));
    console.log('FGTS (R$): ', fgts.toFixed(2));
    console.log('Salário Líquido (R$): ', salarioLiquido.toFixed(2));
    console.log('/**********************************************/');
}

calcularFolhaPagamento(58, 13.66);
calcularFolhaPagamento(220, 15.66);