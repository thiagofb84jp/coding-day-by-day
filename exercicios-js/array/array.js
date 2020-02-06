/**
 * Pontos Importantes:
 * 1. Array em Javascript é um Objeto! Por consequente, não existe o array nativo em Javascipt
 *      assim como nas outras linguagens;
 * 2. O array em Javascript organiza os seus dados através de uma estrutura indexada se iniciando do zero;
 * 3. Trata-se de um conjunto de dados (que pode assumir os mais diversos tipos, desde o tipo primitivo a objeto)
 *      sendo utilizados para armazenar mais de um valor em uma única variável;
 * 4. Trata-se de uma estrutura dinâmica, heterogênea. Uma boa prática é instanciar dados do mesmo array.
 */

 console.log(typeof Array, typeof new Array, typeof[]);

 //Forma não tão recomendada para acessar os índices de um array
 let aprovados = new Array('Bia', 'Carlos', 'Ana');
 console.log(aprovados);

 //Forma recomendada de acessar os índices de um array
 aprovados = ['Bia', 'Carlos', 'Ana'];
 console.log(aprovados[0]);
 console.log(aprovados[1]);
 console.log(aprovados[2]);
 console.log(aprovados[3]); //Undefined

 //Formas para adicionar um novo elemento na posição do array
aprovados[3] = 'Paulo';
aprovados.push('Abia');
console.log(aprovados.length);

aprovados[9] = 'Rafael';
console.log(aprovados.length);
console.log(aprovados[8] === undefined); //Existem os elementos disponíveis, mas ele estão, como padrão, undefined

//Função na qual ordena os elementos do array
console.log(aprovados);
aprovados.sort()
console.log(aprovados);

//Função na qual exclui os elementos de um array
delete aprovados[1];
console.log(aprovados[1]);
console.log(aprovados[2]);

//Função na qual adiciona e remove elementos de um array
aprovados = ['Bia', 'Carlos', 'Ana'];
aprovados.splice(1, 2, 'Elemento1', 'Elemento2');
console.log(aprovados);