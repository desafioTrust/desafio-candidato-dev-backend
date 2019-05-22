# TESTE BACKEND 2.0

Estamos disponibilizando para você um projeto REST Maven em Java muito parecido com o que usamos aqui na Trust:  https://github.com/desafioTrust/desafio-candidato-dev-backend

PASSO A PASSO PARA REALIZAÇÃO DO TESTE
Crie um repositório privado no GitHub.com a partir de um fork do projeto desafio-candidato-dev-backend. Você também deve adicionar o usuário **desafioTrust** como colaborador deste repositório privado, para que possamos fazer a avaliação.

Execute as atividades abaixo, mostre seu potencial e ajude a gente a conhecer melhor o profissional que você é. As atividades 1, 2 e 3 são para perfis Junior e Pleno; as posições Pleno e Sênior deverão responder todas as questões. **Boa sorte!**

1) **Code Review:** <br/>
Precisamos que você revise nosso código, sendo assim, por favor avalie o que está no projeto de teste desafio-candidato-dev-backend de acordo com os critérios de: **padrões de projeto, boas práticas, padrões Rest de nomenclatura e codificação**. Monte um **src/main/resources/CODEREVIEW.txt** com seus comentários. Aponte tudo o que você achar errado/estranho em todo o projeto.

2) **Healthcheck:**<br />
Os serviços precisam ser validados e monitorados, por isso, é necessário que seja implementado um resource(api) que cheque a saúde dos nossos serviços. Sendo assim, crie um endpoint healthcheck em nosso micro-serviço de teste desafio-candidato-dev-backend (um endpoint GET /info) e retorne uma mensagem confirmando que nosso serviço está funcionando e recebendo requisições.
OBS: Será que temos alguma biblioteca pronta que podemos usar nesta atividade? Qual seria?
> Por ter a dependencia do Actuator instalado, é possivel utlizar o endpoint "/actuator/health". Caso seja configurado o ServiceDiscovery de forma default e seus clients, é possivel utilizar o http://localhost:8761/eureka/ e ver quais serviços estão de pé.

3) **Implementar serviços de consulta de CEP:**<br />
Precisamos construir 2 serviços no projeto de desafio-candidato-dev-backend, ambos vão consumir o seguinte endpoint:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;https://zuul.trusthub.com.br/orchestrator/v1/obter-endereco-por-cep/{CEP}
<br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{CEP} - Substituir pelo número do CEP

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Agora, crie o primeiro endpoint GET em nosso micro-serviço que aceite o parâmetro CEP e retorne os detalhes do CEP, buscando em nossa API de CEP´s.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Agora, crie o segundo endpoint POST em nosso micro-serviço que aceite o parâmetro lista de CEP e retorne os detalhes de cada cep, buscando em nossa API de CEP´s.

4) **Implementação de Cache:**<br />
Pesquise e aplique alguma biblioteca de cache para tornar nosso micro-serviço mais rápido,  assim evita chamar nossa API com dados consultados recentemente. Justifique brevemente sua resposta.

5) **Service Discovery e Perfil:**<br />
Adicione no micro-serviço os paramentos de sincronismo com o Discovery Server.
Crie 2 perfis para execução em seu micro-serviço.
Sugestão: Iniciar um Discovery-Server via Docker será um grande diferencial.

6) **Tolerância a falhas:**<br />
Não podemos deixar que nosso serviço seja afetado porque o endpoint de consulta de CEP está fora do ar. Sendo assim, implemente o Hystrix no nosso projeto de testes.
Em caso de falha... o que poderia acontecer para que o nosso endpoint não retorne apenas uma resposta de erro genérica? Justifique brevemente sua resposta.


## Como submeter o teste

Ao finalizar, envie um e-mail para **desafiodev@trust.com.vc** com nome, telefone para contato e link do repositório. Por favor, avise também seu recrutador.

Tenha em mente nosso stack de tecnologia:

- Stack **mandatorio** de tecnologia<br />
java 6 ou ++<br />
Spring (IOF) Injeção de dependencia<br />
Conceitos REST<br />
Sql ANCI<br />
Eclipse IDE<br />
GIT<br /><br />

- Stack **plus** de tecnologia<br />
Spring Boot<br />
Spring Eureka<br />
Spring ribbon<br />
Spring zuul<br />
Spring Swagger<br />
Spring Data<br />
Spring JDBCTemplate<br />
Spring Security<br />
Arquitetura Microserviços<br />
Banco de dados nao relacional (ex: mongo).<br />
HTML 5<br />
JAVASCRIPT<br />
TypeScript<br />
Angular 5.X<br />
Kibana<br />
Teste unitarios (junit).<br /><br />

- Stack **direrenciais** de tecnologia<br />
Spring histrix<br />
DevOps<br />
Kubernetes<br />
Docker<br />
Sql Server<br />
Mongo DB<br /><br /><br />


**Boa sorte!**
