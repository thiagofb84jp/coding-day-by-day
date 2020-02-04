=begin
/*Pontos Importantes*/
1. O tipo de uma variável é definido no momento em que a mesma recebe o valor, ou seja
    sua tipagem é dinâmica;
2. O tipo 'booleano' para o Ruby é o TrueClass;
=end

produto = "Macbook Air"
preco = 5999.99
quantidade = 10
disponivel = true

puts produto
puts quantidade
puts preco
puts disponivel

quantidade = "9"

puts produto.class
puts preco.class
puts quantidade.class
puts disponivel.class
