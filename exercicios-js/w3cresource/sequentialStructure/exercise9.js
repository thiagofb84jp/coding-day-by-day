/**
 * Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a 
 *      temperatura em graus Celsius.
 */

convertFarenheitToCelsius = (farenheit) => {
    let celsius = (farenheit - 32) * 5/9;

    console.log(farenheit + '°F equivale a ' + celsius.toFixed(2) +'°C');
}

convertFarenheitToCelsius(85);