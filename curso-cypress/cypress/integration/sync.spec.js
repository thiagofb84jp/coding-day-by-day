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

    it(' Uso do find ', () => {
        cy.get('#buttonListDOM').click();
        cy.get('#lista li')
            .find('span')
            .should('contain', 'Item 1');

        //Atentar-se ao uso do find() mais de uma vez!    
        cy.get('#lista li span')
            .should('contain', 'Item 2');
    });

    it.only(' Uso do timeout ', () => {
        /*cy.get('#buttonDelay').click();
        //cy.get('#novoCampo', { timeout: 1000 }).should('exist');
        cy.get('#novoCampo').should('exist');*/

        /*cy.get('#buttonListDOM').click();
        //cy.wait(5000); -> Evite passar esse tipo de atributo
        cy.get('#lista li span', { timeout: 3000 })
            .should('contain', 'Item 2');*/

        cy.get('#buttonListDOM').click();
        
        cy.get('#lista li span')
            .should('have.length', 1)
        cy.get('#lista li span')
            .should('have.length', 2);
    });

    it.only(' Click retry ', () => {
        cy.get('#buttonCount')
            .click()
            .click()
            .should('have.value', '111');
    });

    it.only(' Should vs Then ', () => {
        cy.get('#buttonListDOM').should($element => {
            expect($element).to.have.length(1);
        });
        
        /*cy.get('#lista li span').then($element => {
            console.log($element);
            expect($element).to.have.length(1);
        });*/
    });

});