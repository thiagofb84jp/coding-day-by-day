/**
 * Pontos Importantes:
 * 1. Notação Literal é um objeto composto por dois pares de chaves ({}) que envolve uma ou mais propriedades.
 *      Cada propriedade segue o formato "nome: valor" e devem ser separadas por vírgula.
 */

 const a = 1;
 const b = 2;
 const c = 3;

 //Formas de como atribuir um 'atributo'
 const obj1 = { a: a, b: b, c:c }
 const obj2 = { a, b, c }
 console.log(obj1, obj2);

 const nomeAttr = 'Nota';
 const valorAttr = 7.87;

 const obj3 = {}
 obj3[nomeAttr] = valorAttr;
 console.log(obj3);

 const obj4 = { [nomeAttr]: valorAttr}
 console.log(obj4);

 //Exibe as duas formas (antiga e a nova) de se realizar uma notação literal
 const obj5 = {
     funcao1: function(){
        //...
     },
     funcao2(){
        //...
     }
 }
 console.log(obj5);

 //Exemplo puro de notação literal
 var album = {
     title: "Metallica (Master of Puppets)",
     released: 1987,
     showInfo: function(){
         alert("Título do álbum: " + this.title + "Lançado em: " + this.released);
     }
 }

 console.log(album);