it(' sem testes, ainda ', () => { })

//We have a promise here (Javascript function)
const getSomething = callback => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve(13);
        }, 1000);
    });
};

const system = () => {
    console.log('init');
    getSomething().then(some => {
        console.log(`Something is ${some}`) //interpolação
    });
    console.log('end');
}

system();