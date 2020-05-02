/// <reference types = "cypress"/>

describe(' Esperas... ', () => {
    //Executa uma vez antes do primeiro teste
    before(() => {
        cy.visit('https://wcaquino.me/cypress/componentes.html');
    });

    //Executa antes de cada um dos testes (em ambos os testes serão executados)
    beforeEach(() => {
        cy.reload();
    });

    it(' Deve aguardar elemento estar disponível ', () => {
        cy.get('#novoCampo').should('not.exist');
        cy.get('#buttonDelay').click();
        cy.get('#novoCampo').should('not.exist');
        cy.get('#novoCampo').should('exist');
        cy.get('#novoCampo').type('funciona');
    });

    it(' Deve fazer retrys ', () => {
        cy.get('#buttonDelay').click();
        cy.get('#novoCampo')
            //.should('not.exist')
            .should('exist')
            .type('funciona');
    });

    it.only(' Uso do find ', () => {
        cy.get('#buttonList').click();
        cy.get('#lista li')
            .find('span')
            .should('contain', 'Item 1');

        //Atentar-se ao uso do find() mais de uma vez!    
        cy.get('#lista li span')
            .should('contain', 'Item 2');
    });

});