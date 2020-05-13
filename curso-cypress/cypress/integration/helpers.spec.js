/// <reference types = "cypress"/>

describe(' Helpers ', () => {

    it(' Wrap ', () => {
        const object = { nome: 'User', idade: 20 }
        expect(object).to.have.property('nome');
        cy.wrap(object).should('have.property', 'nome');

        cy.visit('https://wcaquino.me/cypress/componentes.html');

        cy.get('#formNome').then($element => {
            cy.wrap($element).type('funciona via cypress');
        });

        const promise = new Promise((resolve, reject) => {
            setTimeout(() => {
                resolve(10);
            }, 500);
        });

        cy.get('#buttonSimple').then(() => console.log('Encontrei o primeiro botão'));
        //promise.then(num => console.log(num)); -> Para não usar as promises, se deve usar o Wrap
        cy.wrap(promise).then(ret => console.log(ret));
        cy.get('#buttonList').then(() => console.log('Encontrei o segundo botão'));

        cy.wrap(1).should(number => {
            return 2;
        }).should('be.equal', 1);
    });

    it(' Its... ', () => {
        const object1 = { nome: 'User', idade: 20 }
        cy.wrap(object1).should('have.property', 'nome', 'User');
        cy.wrap(object1).its('nome').should('be.equal', 'User');

        const object2 = { nome: 'User', idade: 20, endereco: { rua: 'dos bobos' } }
        cy.wrap(object2).its('nome').should('be.equal', 'User');
        cy.wrap(object2).its('endereco').should('have.property', 'rua');
        cy.wrap(object2).its('endereco').its('rua').should('contain', 'bobos');
        cy.wrap(object2).its('endereco.rua').should('contain', 'bobos');

        cy.visit('https://wcaquino.me/cypress/componentes.html');
        cy.title().its('length').should('be.equal', 20);
    });

    it.only(' Invoke... ', () => {
        const getValue = () => 1;
        const soma = (a, b) => a + b;

        cy.wrap({ fn: getValue }).invoke('fn').should('be.equal', 1);
        cy.wrap({ fn: soma }).invoke('fn', 2, 5).should('be.equal', 7);

        cy.visit('https://wcaquino.me/cypress/componentes.html');
        cy.get('#formNome').invoke('val', 'Texto via invoke');
        cy.window().invoke('alert', 'Dá pra ver?');
        cy.get('#resultado')
            .invoke('html', '<input type="button", value="hacked!"/>');
    });

});