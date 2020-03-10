/**
 * Pontos Importantes:
 * 1. Lembre-se a PORTA é a forma que tem-se para selecionar qual processo vai antender uma determinada
 *      requisição;
 */

const porta = 3303;

const express = require('express');
const app = express();
const bodyParser = require('body-parser');
const bancoDeDados = require('./bancoDeDados');

/*
//Este é um middleware
app.get('/produtos', (req, res, next)=> {
    console.log('Middleware 1...');
    next();
});

app.get('/produtos', (req, res, next)=> {
    res.send({ nome: 'Notebook', preco: 123.45 }) //Converter para JSON
});
*/

app.use(bodyParser.urlencoded({ extended: true}));

app.get('/produtos', (req, res, next) =>{
    res.send(bancoDeDados.getProdutos());
});

app.get('/produtos/:id', (req, res, next) =>{
    res.send(bancoDeDados.getProduto(req.params.id));
});

app.post('/produtos', (req, res, next) =>{
    const produto = bancoDeDados.salvarProduto({
        nome: req.body.nome,
        preco: req.body.preco
    });
    res.send(produto); //JSON
});

app.put('/produtos/:id', (req, res, next) =>{
    const produto = bancoDeDados.salvarProduto({
        id: req.params.id,
        nome: req.body.nome,
        preco: req.body.preco
    });
    res.send(produto); //JSON
});

app.delete('/produtos/:id', (req, res, next) =>{
    const produto = bancoDeDados.excluirProduto(req.params.id);
    res.send(produto); //JSON
});

app.listen(porta, () => {
    console.log(`Servidor está executando na porta ${porta}.`);
});