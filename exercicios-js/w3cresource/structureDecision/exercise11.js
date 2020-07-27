/**
 * As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para 
 *  desenvolver o programa que calculará os reajustes.
 */

calcularAumentoSalarial = (salario) => {
    let percentual;
    let valorAumento;
    let salarioReajustado;

    if (salario <= 280) {
        percentual = 20;
        valorAumento = (percentual / 100) * salario;
        salarioReajustado = salario + valorAumento;
    } else if ((salario > 280) && (salario <= 700)) {
        percentual = 15;
        valorAumento = (percentual / 100) * salario;
        salarioReajustado = salario + valorAumento;
    } else if ((salario >= 700) && (salario <= 1500)) {
        percentual = 10;
        valorAumento = (percentual / 100) * salario;
        salarioReajustado = salario + valorAumento;
    } else if (salario >= 1500) {
        percentual = 5;
        valorAumento = (percentual / 100) * salario;
        salarioReajustado = salario + valorAumento;
    }

    console.log("*************************************");
    console.log("Salário antes do reajuste: R$ " + salario);
    console.log("Percentual de aumento aplicado: " + percentual + "%");
    console.log("Valor do aumento: R$ " + valorAumento);
    console.log("Novo salário: R$ " + salarioReajustado);
    console.log("*************************************");
}

calcularAumentoSalarial(250);
calcularAumentoSalarial(678);
calcularAumentoSalarial(1400);
calcularAumentoSalarial(1700);
calcularAumentoSalarial(3000);