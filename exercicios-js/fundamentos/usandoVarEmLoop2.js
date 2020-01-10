const funcs = [];

for(var i = 0; i < 10; i++){
    funcs.push(function(){
        console.log(i);
    });
}

//Com 'var', ele pegou o último valor depois do término do 'loop'
funcs[2]();
funcs[8]();