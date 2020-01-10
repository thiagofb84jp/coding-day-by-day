const funcs = [];

for(let i = 0; i < 10; i++){
    funcs.push(function(){
        console.log(i)
    });
}

//Com o 'let' ele consegue lembrar do último valor inserido no bloco de código
funcs[2]();
funcs[6]();
funcs[8]();