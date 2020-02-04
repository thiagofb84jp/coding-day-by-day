/**
 * Pontos Importantes:
 * 1. O objeto JSON - Javascript Object Notation - contém métodos para parsing e conversão de valores para JSON.
 *      Trata-se de uma sintaxe para serialização de objetos, matrizes, números, strings, booleanos e null.
 */

const obj = { a: 1, b: 2, c: 3, soma() {return a + b + c}}
console.log(JSON.stringify(obj));

//console.log(JSON.parse("{a: 1, b: 2, c: 3}")); -> Formato inválido para JSON
//console.log(JSON.parse("{'a': 1, 'b': 2, 'c': 3}")); -> Formato inválido para JSON
console.log(JSON.parse('{"a": 1, "b": 2, "c": 3}'));
console.log(JSON.parse('{ "a": 1.7, "b": "string", "c": true, "d": {}, "e": [] }'));