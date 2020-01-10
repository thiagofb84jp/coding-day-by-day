//Usando 'var', há a possibilidade desse comportamento ocorrer
console.log('a = ', a);
var a = 2;
console.log('a = ', a);

//Usando 'let', não há a possibilidade desse comportamento ocorrer
console.log('b = ', b);
let b = 2;
console.log('b = ', b);