/// <reference types = "cypress"/>

describe(' Work with basic elements ', () => {
    //Executa uma vez antes do primeiro teste
    before(() => {
        cy.visit('https://wcaquino.me/cypress/componentes.html');
    });

    //Executa antes de cada um dos testes (em ambos os testes serão executados)
    beforeEach(() => {
        cy.reload();
    });

    it(' Alert ', () => {
        cy.get('#alert').click();
        cy.on('window:alert', message => {
            console.log(message);
            expect(message).to.be.equal('Alert Simples');
        });
    });

    it.only(' Alert com mock ', () => {
        /**
         * Pode ser feito, da mesma forma como no primeiro caso de teste
         */
        const stub = cy.stub().as('alerta');
        cy.on('window:alert', stub);
        cy.get('#alert').click().then(() => {
            expect(stub.getCall(0)).to.be.calledWith('Alert Simples');
        });

        /*cy.get('#alert').click();
        cy.on('window:alert', message => {
            console.log(message);
            expect(message).to.be.equal('Alert Simples');
        });*/
    });

    it.only(' Confirm ', () => {
        cy.on('window:confirm', message => {
            expect(message).to.be.equal('Confirm Simples');
        });
        cy.on('window:alert', message => {
            expect(message).to.be.equal('Confirmado');
        });
        cy.get('#confirm').click();
    });

    it.only(' Deny ', () => {
        cy.on('window:confirm', message => {
            expect(message).to.be.equal('Confirm Simples');
            return false;
        });
        cy.on('window:alert', message => {
            expect(message).to.be.equal('Negado');
        });
        cy.get('#confirm').click();
    });

    it.only(' Prompt ', () => {
        /*cy.on('window:confirm', message => {
            expect(message).to.be.equal('Confirm Simples');
        });
        cy.on('window:alert', message => {
            expect(message).to.be.equal('Confirmado');
        });*/

        cy.get('#prompt').click();
    });

});