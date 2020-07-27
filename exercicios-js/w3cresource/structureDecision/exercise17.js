/**
 * Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c.
 */

function equacaoSegundoGrau(coefA, coefB, coefC) {

    if (coefA == 0) {
        console.log('Não é uma equação do segundo grau.');
    } else {
        let delta = coefB * coefB - (4 * coefA * coefC);

        if (delta < 0) {
            console.log('Delta é menor que zero. Raízes imaginárias.');
        } else if (delta == 0) {
            let raiz = -coefB / (2 * coefA);
            console.log('Delta = ', 0, "Raiz = ", raiz);
        } else {
            let raiz1 = (-coefB + Math.sqrt(delta)) / (2 * coefA);
            let raiz2 = (-coefB + Math.sqrt(delta)) / (2 * coefA);
            console.log('Raízes = ', raiz1.toFixed(2), ' e ', raiz2.toFixed(2));
        }
    }
}

equacaoSegundoGrau(0, 0, 0);
equacaoSegundoGrau(3, 5, 10);
equacaoSegundoGrau(3, 27, 1);