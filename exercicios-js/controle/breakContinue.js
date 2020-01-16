/**
 * Pontos Importantes: 
 * 1. Break = Sai do laço corrente;
 * 2. Continue = Interrompe a repetição corrente e segue para a próxima repetição;
 * 3. NÃO use a estrutura do tipo que está marcado no 'externo'.
 */

const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

for(let x in nums){
    if (x == 5) {
        break;
    }
    console.log(`${x} = ${nums[x]}`);
}

console.log("\n");

for(let y in nums){
    if (y == 5) {
        continue;
    }
    console.log(`${y} = ${nums[y]}`);
}

console.log("\n");

//Este é um  (não use!)
externo: for(let a in nums){
    for(b in nums){
        if (a == 2 && b == 3) break externo;
        console.log(`Par = ${a}, ${b}`);
    }
}