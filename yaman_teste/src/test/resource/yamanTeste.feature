#Author: fabio.alves@gmail.com

Feature: Desafio de testes automatizados Yaman.
				 Realizar pesquisas no site Mercado Livre.

Scenario: Realiza pesquisa e imprime o titulo e valor dos cinco primeiros resultados
Given A pagina inicial foi acessada
When A pesquisa pelo item "notebook" e realizada
Then Imprime o titulo e valor do item


Scenario: Realiza pesquisa e tira print do penultimo anuncio da segunda pagina
Given A pagina inicial foi acessada
When A pesquisa pelo item "televisão" e realizada
Then Tira print do penultimo anuncio da segunda pagina

