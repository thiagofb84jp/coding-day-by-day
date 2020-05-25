/// <reference types = "cypress"/>

describe(' Work with basic elements ', () => {
    it(' Deve preencher campo de texto ', () => {
        cy.visit('https://wcaquino.me/cypress/componentes.html');

        cy.get('#frame1').then(iframe => {
            const body = iframe.contents().find('body')
            cy.wrap(body).find('#tfield')
                .type('funciona?')
                .should('have.value', 'funciona?');

            cy.on('window:alert', message => {
                console.log(message);
                expect(message).to.be.equal('Alert Simples');
            });

            //cy.wrap(body).find('#otherButton').click();
        });
    });

    it(' Deve testar frame diretamente ', () => {
        cy.visit('https://wcaquino.me/cypress/frame.html');

        cy.get('#otherButton').click();

        cy.on('window:alert', message => {
            console.log(message);
            expect(message).to.be.equal('Click OK!');
        });
    });

});