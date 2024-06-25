# Controle de Fluxo

Este projeto tem como objetivo exercitar os conceitos de Controle de Fluxo em Java através da implementação de um cenário específico. O sistema desenvolvido receberá dois números inteiros como parâmetros via terminal e utilizará esses números para realizar interações e imprimir valores incrementados no console.

## Funcionalidades

Recebimento de Parâmetros:
- O sistema recebe dois parâmetros inteiros via terminal.


Validação dos Parâmetros:
- Se o primeiro parâmetro for maior que o segundo, o sistema lançará uma exceção customizada chamada ParametrosInvalidosException com a mensagem: "O segundo parâmetro deve ser maior que o primeiro".


Impressão de Números Incrementados:
- Caso os parâmetros sejam válidos, o sistema realizará uma interação (for) com o número de ocorrências igual à diferença entre os dois parâmetros.

- Durante a interação, o sistema imprimirá no console mensagens no formato: "Imprimindo o número X", onde X varia de 1 até a diferença entre os parâmetros.
