# Questao 1

Esta questão foi feita usando o padrão Factory Method para conseguir criar diferentes tipos de relatórios sem mexer no código principal. Primeiro foi criada a interface Report, que define o que todo relatório precisa fazer. Depois foram criados dois relatórios: o diário e o semanal, cada um com sua lógica de preparo e geração.

Para não deixar a criação dos relatórios espalhada pelo sistema, foi criada também a interface ReportCreator. Cada criador (como o do diário e o do semanal) sabe qual relatório deve devolver. Na classe Main, só chamamos esses criadores e o relatório já fica pronto para uso.

# Questao 2

Nesta questão usei o padrão Strategy para permitir que o cálculo de risco possa ser trocado em tempo de execução. A ideia foi criar um sistema onde cada modelo de risco (agressivo, moderado e conservador) tem sua própria lógica, mas todos seguem a mesma interface. Assim, o fluxo principal não precisa ser alterado quando um modelo muda ou quando um novo modelo for criado no futuro.

Foi criada uma interface chamada RiskModel, que define o método de cálculo. Depois foram criados três modelos (agressivo, moderado e conservador), cada um implementando seu jeito de calcular o score. O RiskAnalyzer é a classe que usa o modelo escolhido e consegue trocar de modelo a qualquer momento. A classe Main só demonstra essa troca e mostra os resultados.
