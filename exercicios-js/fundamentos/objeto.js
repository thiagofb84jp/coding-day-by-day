/**
 * 1. Um par de chaves {} = Array de Objetos (grupo de pares chave <-> valor)
 * 2. Um par de colchetes [] = Array Comum
 * 3. Lembre-se: JSON é diferente de um array de objetos
 */

const prod1 = {}; //array de objetos
prod1.nome = 'Celular Ultra Mega';
prod1.preco = 4998.90;
prod1['descontoLegal'] = 0.40; //Evite atributos com espaços! Ex.: Desconto Legal

console.log(prod1);

const prodArrayComum = []; //array comum


//Pode-se ter uma estrutura aninhada de objetos
const prod2 = {
    nome: 'Camisa Pólo',
    preco: 79.90,
    obj:{
        blahblah: 1,
        obj:{
            blahblah: 2
        }
    }
}

console.log(prod2);