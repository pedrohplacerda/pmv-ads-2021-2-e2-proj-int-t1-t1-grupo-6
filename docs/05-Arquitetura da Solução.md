# Arquitetura da Solução

## Diagrama de Classes

O diagrama de classes descreve como é a modelagem do sistema, além de servir como uma documentação muito funcional e descritiva das classes do sistema, ela serve como base da construção do sistema. Isso porque esse diagrama fornece uma visão ampla do projeto, possibilitando visualizar possíveis erros de arquitetura e consertá-los antes de começar a programar, o que diminui os custos de produção. Segue diagrama de classes do nosso sistema abaixo:



![Diagramas de Classes - Documentação da IBM](img/Classe%20UML.png)

## Solução 

A solução implementada conta com os seguintes módulos:
Navegador - Interface básica do sistema

Páginas Web - Conjunto de arquivos HTML, CSS, JavaScript e imagens que implementam as funcionalidades do sistema.

Local Storage - armazenamento mantido no Navegador, onde são implementados bancos de dados baseados em JSON. São eles:

Canais - seções de notícias apresentadas

Comentários - registro de opiniões dos usuários sobre as notícias

Preferidas - lista de notícias mantidas para leitura e acesso posterior

News API - plataforma que permite o acesso às notícias exibidas no site.

Hospedagem - local na Internet onde as páginas são mantidas e acessadas pelo navegador.

Obs.: o banco de dados estará presente na Arquitetura da Solução.

Hospedagem

O site utiliza a plataforma do Heroku como ambiente de hospedagem do site do projeto. O site é mantido no ambiente da URL: 
