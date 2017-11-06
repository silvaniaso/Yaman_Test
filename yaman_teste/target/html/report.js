$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("yamanTeste.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: fabio.alves@gmail.com"
    }
  ],
  "line": 3,
  "name": "Desafio de testes automatizados Yaman.",
  "description": "\t\t Realizar pesquisas no site Mercado Livre.",
  "id": "desafio-de-testes-automatizados-yaman.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5754466578,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Realiza pesquisa e imprime o titulo e valor dos cinco primeiros resultados",
  "description": "",
  "id": "desafio-de-testes-automatizados-yaman.;realiza-pesquisa-e-imprime-o-titulo-e-valor-dos-cinco-primeiros-resultados",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "A pagina inicial foi acessada",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "A pesquisa pelo item \"notebook\" e realizada",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Imprime o titulo e valor do item",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.acessarPaginaPrincipal()"
});
formatter.result({
  "duration": 5439421331,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "notebook",
      "offset": 22
    }
  ],
  "location": "Steps.pesquisarItem(String)"
});
formatter.result({
  "duration": 3499686483,
  "status": "passed"
});
formatter.match({
  "location": "Steps.imprimirInformacoesItens()"
});
formatter.result({
  "duration": 2540015571,
  "status": "passed"
});
formatter.after({
  "duration": 648946969,
  "status": "passed"
});
formatter.before({
  "duration": 3416371111,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Realiza pesquisa e tira print do penultimo anuncio da segunda pagina",
  "description": "",
  "id": "desafio-de-testes-automatizados-yaman.;realiza-pesquisa-e-tira-print-do-penultimo-anuncio-da-segunda-pagina",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "A pagina inicial foi acessada",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "A pesquisa pelo item \"televisão\" e realizada",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Tira print do penultimo anuncio da segunda pagina",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.acessarPaginaPrincipal()"
});
formatter.result({
  "duration": 4529596934,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "televisão",
      "offset": 22
    }
  ],
  "location": "Steps.pesquisarItem(String)"
});
formatter.result({
  "duration": 2718524775,
  "status": "passed"
});
formatter.match({
  "location": "Steps.evidenciarPenultimoItem()"
});
formatter.result({
  "duration": 10271569262,
  "status": "passed"
});
formatter.after({
  "duration": 686934576,
  "status": "passed"
});
});