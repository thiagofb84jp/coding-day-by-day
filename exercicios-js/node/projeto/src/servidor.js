/**
 * Pontos Importantes:
 * 1. Lembre-se a PORTA é a forma que tem-se para selecionar qual processo vai antender uma determinada
 *      requisição;
 */

const porta = 3303;

const express = require('express');
const app = express();

app.get('/produtos', (req, res, next)=> {
    res.send({ nome: 'Notebook', preco: 123.45 }) //Converter para JSON
});

app.listen(porta, () => {
    console.log(`Servidor está executando na porta ${porta}.`);
});