/**
 * Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre 
 *  em graus Farenheit.
 */

convertCelsiusToFarenheit = (celsius) => {
    let farenheit = (celsius * 9/5) + 32;

    console.log(celsius + '°C equivale a ' + farenheit + '°F');
}

convertCelsiusToFarenheit(100);