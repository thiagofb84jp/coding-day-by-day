/**
 * Pontos Importantes:
 * 1. O método Object.preventExtensions() impede que novas propriedades sejam adicionadas a um objeto, isto é, 
 *      impedem futuras extensões ao objeto;
 *   - O que ocorre (em Object.preventExtensions()) é que o objeto pode ser modificado, mas não permite a adição 
 *      de novos atributos;
 * 2. O método Object.seal() sela um Objeto, evitando que novas propriedades sejam adicionadas à ele e marcando todas
 *      as propriedades existentes como não configuráveis.
 *   - Quando um objeto é selado, não é possível adicionar novos atributos, excluir atributos do objeto, mas é
 *      possível modificar os atributos de um objeto (nos que já existem);
 * 3. O método Object.freeze() congela um objeto: isto é, impede que novas propriedades sejam adicionadas à ele;
 *      impede que as propriedades existentes sejam removidas; e impede que propriedades existentes, ou sua inumerabilidade,
 *      configurabilidade, ou capacidade de escrita sejam alteradas.
 *   - Resultado de um objeto selado, só que com valores constantes (não há a possibilidade de inclusão de novos valores,
 *      exclusão de chaves do objeto, nem tampouco a modificação das variáveis do objeto).
 */
//Object.preventExtensions
const produto = Object.preventExtensions({
    nome: 'Qualquer', preco: 1.99, tag: 'promocao'
})
console.log('Extensível:', Object.isExtensible(produto));

produto.nome = 'Borracha';
produto.descricao = 'Borracha escolar branca';
delete produto.tag;
console.log(produto);

//Object.seal
const pessoa = { nome: 'Juliana', idade: 35 }
Object.seal(pessoa);
console.log('Selado:', Object.isSealed(pessoa));

pessoa.sobrenome = 'Silva';
delete pessoa.nome;
pessoa.idade = 29;
console.log(pessoa);

//Object.freeze = selado + valores constantes