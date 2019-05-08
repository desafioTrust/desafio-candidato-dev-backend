# TESTE BACKEND 2.0

Estamos disponibilizando para você um projeto REST Maven em Java muito parecido com o que usamos aqui na Trust. 

https://github.com/desafioTrust/desafio-candidato-dev-backend


Por favor crie um repositório privado no GitHub.com com seu teste. Você também deve adicionar o usuário desafioTrust como colaborador do projeto para que possamos fazer a avaliação.

Por favor execute as atividades que estão aqui embaixo, mostre seu potencial e ajude a gente a conhecer melhor o professional que você é, boa sorte!

1)	Code Review. Precisamos que você revise nosso código, sendo assim por favor avalie com critérios de padrões de projeto, boas práticas, padrões Rest de nomenclatura e codificação, o que está no projeto de teste. Monte por favor um README com seus comentários.

2)	Healthcheck.
Os serviços precisam ser validados e monitorados por isso é necessário que seja implementado um serviço que cheque a saúde dos nossos serviços, sendo assim crie um endpoint healthcheck em nosso micro-serviço de teste (um endpoint GET /info) e retorne uma mensagem confirmando que nosso serviço está funcionando e recebendo requisições.
OBS: Será que temos alguma biblioteca pronta que podemos usar nesta atividade? Qual seria?

3)	Implementar serviços de consulta de CEP.
Precisamos construir 2 serviços no projeto de teste, ambos vão consumir o seguinte endpoint:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;https://zuul.trusthub.com.br/orchestrator/v1/obter-endereco-por-cep/{CEP}
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{CEP} - Substituir pelo número do CEP

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Agora, crie o primeiro endpoint GET em nosso micro-serviço que aceite o parâmetro CEP e retorne os detalhes do CEP, buscando em nossa API de CEP´s.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Agora, crie o segundo endpoint POST em nosso micro-serviço que aceite o parâmetro lista de CEP e retorne os detalhes de cada cep, buscando em nossa API de CEP´s.

4)	Implementação de Cache
Pesquise e aplique alguma biblioteca de cache para tornar nosso micro-serviço mais rápido, assim evita chamar nossa API com dados consultados recentemente.

5)	Service Discovery e Perfil:
Adicione no micro-serviço os paramentos de sincronismo com o Discovery Server.
Crie 2 perfis para execução em seu micro-serviço.
Sugestão: Iniciar um Discovery-Server via Docker será um grande diferencial.

6)	Tolerância a falhas:
Não podemos deixar que nosso serviço seja afetado por que o endpoint de consulta de CEP está fora do ar. Sendo assim por favor implemente o Hystrix no nosso projeto de testes.
Em caso de falha... o que poderia acontecer para que o nosso endpoint não retorne apenas uma resposta de erro genérica?


## Como submeter o teste

Ao finalizar envie um e-mail para desafiodev@trust.com.vc com nome, telefone para contato e link do repositório. Por favor avise também seu recrutador.

Boa sorte!
