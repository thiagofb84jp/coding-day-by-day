/**
 * Pontos Importantes:
 * 1. No padrão Chain of Responsibility, separa-se o processo em pequenos passos, sendo que a lógica do próximo passo não há uma
 *      amarração específica (não possui tanta dependência);
 * 2. O importante do padrão Chain of Responsibility é que não há uma dependência/acoplamento do próximo passo, sendo o próximo passo 
 *      independente;
 * 3. Lembre-se: o Padrão de Projeto é uma solução para um problema recorrente! São feitas as adaptações necessárias para seu 
 *      funcionamento;
 */

//middleware pattern (chain of responsbility)
const passo1 = (ctx, next) => {
    ctx.valor1 = 'mid1';
    next();
}

const passo2 = (ctx, next) => {
    ctx.valor2 = 'mid2';
    next();
}

const passo3 = ctx => ctx.valor3 = 'mid3';

const exec = (ctx, ...middlewares) => {
    const execPasso = indice => {
        middlewares && indice < middlewares.length;
        middlewares[indice](ctx, () => execPasso(indice + 1));
    }
    execPasso(0);
}

const ctx = {};
exec(ctx, passo3, passo2, passo1);
console.log(ctx);