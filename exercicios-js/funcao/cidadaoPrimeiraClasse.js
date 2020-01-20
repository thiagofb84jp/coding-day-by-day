/**
 * Pontos Importantes:
 * 1. Função em JS é First-Class Object (Citizens);
 * 2. High-Order function;
 * 3. Caso a função não retorne nada, ela retorna o valor 'undefined' (caso não seja chamado o 'return');
 * 4. Uma função pode ser criado dentro da construção do array.
 */

 //Criar uma função de forma literal
 function fun1(){ }

 //Armazenar em uma variável
 const fun2 = function(){ }

 //Armazenar em um array
 const array = [function (a, b) { return a + b }, fun1, fun2]
 console.log(array[0](2, 3));

 //Armazenar em um atributo de objeto
 const obj = {}
 obj.falar = function () { return 'Opa!' }
 console.log(obj.falar());

 //Passar função como parâmetro (nem sempre é uma boa prática, mas a linguagem permite isso)
 function run(fun){
     fun();
 }

 run(function () { console.log('Executando...') })

 //Uma função pode retornar/conter uma função
 function soma(a, b){
     return function(c){
         console.log(a + b + c);
     }
 }

 //Duas formas de se chamar a função 'dentro da' função
 soma(2, 3)(4); //passando o número ao lado para chamar a função
 const cincoMais = soma(2, 3); //passando uma constante para chamar a função
 cincoMais(4);