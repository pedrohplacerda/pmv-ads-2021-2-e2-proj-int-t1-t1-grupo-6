Plano de Testes de Software

Os requisitos para realização dos testes de software são:

- Site publicado na Internet
- Navegador da Internet - Chrome, Firefox ou Edge
- Conectividade de Internet para acesso às plataformas (APISs)

Os testes funcionais a serem realizados no aplicativo são descritos a seguir.


|**Caso de Teste**|**CT-01 - Acessar a tela de estoque** |
| :-: | :- |
|**Requisitos Associados**|RF-01 - O usuário deverá consultar o estoque de seu estabelecimento.|
|**Objetivo do Teste**|Validar o acesso à tela de estoque a partir da tela home.  |
|**Passos**|<p>1) Acessar o Navegador</p><p>2) Digitar o endereço do sistema </p><p>3) Visualizar a página principal</p><p>4) Acessar o estoque a partir do botão na tela home </p>|
|**Critérios de Êxito**|- A tela de estoque deve ser acessada em menos de três segundos. |



|**Caso de Teste**|**CT-02 - Adicionar um produto ao estoque** |
| :-: | :- |
|**Requisitos Associados**|RF-05 - O usuário deverá adicionar novos produtos e seus respectivos códigos de barra|
|**Objetivo do Teste**|Validar a inserção de um produto ao estoque |
|**Passos**|<p>1) Acessar o Navegador</p><p>2) Digitar o endereço do sistema </p><p>3) Visualizar a página principal</p><p>4) Acessar o estoque a partir do botão na tela home </p><p>5) Clicar em “Adicionar novo produto” </p><p>6) Digitar as informações pertinentes ao produto</p><p>7) Validar se o produto foi inserido </p>|
|**Critérios de Êxito**|- O produto deverá aparecer no estoque com as informações inseridas previamente pelo usuário|







|**Caso de Teste**|**CT-03 - Remover um produto ao estoque** |
| :-: | :- |
|**Requisitos Associados**|RF-06 - O usuário deverá remover ou alterar a quantidade de um produto no estoque.|
|**Objetivo do Teste**|Validar a remoção de um produto ao estoque |
|**Passos**|<p>1) Acessar o Navegador</p><p>2) Digitar o endereço do sistema </p><p>3) Visualizar a página principal</p><p>4) Acessar o estoque a partir do botão na tela home </p><p>5) Clicar para remover o produto</p><p>6) Validar se o produto foi removido com sucesso </p>|
|**Critérios de Êxito**|- O produto não mais deverá aparecer no estoque |



|**Caso de Teste**|**CT-04 - Validar a consulta ao caixa do sistema (não admin)**|
| :-: | :- |
|**Requisitos Associados**|RF-03 - O usuário deverá consultar os fluxos de caixa, folhas de pagamento, pedidos e seus respectivos status (ex.: em processamento, aguardando pagamento, pedido confirmado, pedido entregue).|
|**Objetivo do Teste**|Validar o fluxo de caixa |
|**Passos**|<p>1) Acessar o Navegador</p><p>2) Digitar o endereço do sistema </p><p>3) Visualizar a página principal</p><p>4) Acessar a tela de caixa pelo botão na tela home </p><p>5) Consultar as entradas (ex.: pedidos finalizados e pagos) e as saídas (ex.: pagamento de fornecedores e funcionários, compra de matéria prima)</p>|
|**Critérios de Êxito**|- O usuário não-administrador deverá apenas poder consultar os fluxos acima, não podendo alterá-los|




|**Caso de Teste**|**CT-05 - Validar a consulta ao caixa do sistema (admin)**|
| :-: | :- |
|**Requisitos Associados**|RF-03 - O usuário deverá consultar os fluxos de caixa, folhas de pagamento, pedidos e seus respectivos status (ex.: em processamento, aguardando pagamento, pedido confirmado, pedido entregue).|
|**Objetivo do Teste**|Validar o fluxo de caixa |
|**Passos**|<p>1) Acessar o Navegador</p><p>2) Digitar o endereço do sistema </p><p>3) Visualizar a página principal</p><p>4) Acessar a tela de caixa pelo botão na tela home </p><p>5) Consultar as entradas (ex.: pedidos finalizados e pagos) e as saídas (ex.: pagamento de fornecedores e funcionários, compra de matéria prima)</p>|
|**Critérios de Êxito**|- O usuário administrador deverá poder consultar os fluxos acima e também alterá-los|

1. Plano de Testes de Usabilidade

O planejamento dos testes de usabilidade a serem realizados com usuários são descritos na Tabela a seguir.


|**Teste de Benchmark**|Esse teste consiste em estabelecer parâmetros de comparação entre plataformas similares. A finalidade do teste é realizar escolhas que  beneficiem uma melhor utilização. |
| :-: | :- |
|**Teste de aprendizado**|Requer a experimentação pela pessoa que primeiro lida com a ferramenta. Em outras palavras, para completar uma determinada tarefa, a pessoa terá que começar do zero e seguir navegando na plataforma. Depois disso, deverá ser repetido por uma ou mais pessoas.|
|**Testes remotos moderados de usabilidade** |Visa fornecer uma experiência mais envolvente e, portanto, para coletar mais dados orgânicos, eles são realizados diretamente na casa ou no trabalho dos participantes. Nesse caso, os moderadores vão até o local para realizar a pesquisa.|
|**Testes remotos não moderado de usabilidade**|Nesse caso, os participantes realizam os estudos e testes em seus dispositivos, tais como tablets, smartphones, notebooks (etc). |
##