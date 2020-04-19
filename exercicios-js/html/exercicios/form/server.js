const express = require('express');
const app = express();
const bodyParser = require('body-parser');

/**
 * Neste trecho, ele pega o urlencoded, pega o objeto repassado e o imprime no 
 * console.
 */
app.use(bodyParser.urlencoded({ extended: true }));

app.post('/usuarios', (req, resp) => {
    console.log(req.body);
    resp.send('<h1>Parabéns. Usuário Incluído!</h1>');
});

app.post('/usuarios/:id', (req, resp) => {
    console.log(req.params.id);
    console.log(req.body);
    resp.send('<h1>Parabéns. Usuário Alterado!</h1>');
});

app.listen(3003);