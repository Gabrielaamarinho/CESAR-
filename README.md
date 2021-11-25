# Projeto CESAR++ :computer:
TUTORIAL: Como rodar o projeto? <br>
Os passos a seguir assumem que você tem instalado em sua máquina o ```Spring Boot``` e o ```MySQL```

## Tutorial do backend
### I - Configurar as portas

O servidor está rodando na porta 9000, isso pode ser alterado trocando o valor de ```server.port``` no arquivo ```application.properties```, que está no caminho: ```cesarplusplus\src\main\resources\application.properties```. Porém isso vai acarretar em problemas no frontend, pois as requisições http estão sendo enviadas para o ```localhost:9000```.
<br>
### II - Configurar o banco de dados MySQL
No mesmo arquivo para configuração da porta do servidor, o ```application.properties```, é feita a configuração de autenticação do banco de dados. Atualmente as configurações de encontram assim:
1. spring.datasource.url=jdbc:mysql://localhost:3306/cesarplusplus
    - Nessa configuração é possivel mudar o caminho pelo qual o banco de dados é acessado, daí você precisará criar um servidor MySQL e escrever esse path de acordo como o servidor do database está configurado no seu computador.
2. spring.datasource.username=root
    - Aqui, você deve preencher com o seu username do banco de dados.
3. spring.datasource.password=2020201003
    - Coloque a senha de acesso para o database
4. spring.jpa.hibernate.ddl-auto=create
    - Na configuração 4 é especificado como o banco de dados deve ser tratado na incialização do backend, em ```create``` toda vez que o sevidor for reiniciado o banco será apagado e novas tabelas serão geradas. Para manter os dados nas tabelas configure como ```validate```.
<br>

## Tutorial do frontend
### I - Configurar as portas
Rode o frontend com algum websever em qualquer porta, pois o backend está programado para aceitar requisições de qualquer caminho. Obs.: Em nosso projeto usamos o Live Server, que vem como extensão no VsCode.
<br>
## Tutorial Script de Correção
<br>

- [x] Comunicação entre frontend e backend
- [x] Persistência dos dados usando MySQL
- [x] Upload de questões pelo servidor (localhost:9000/questoes)
- [x] Correção das questões com script em Python
- [x] Impressão dos resultados e possiveis erros do código do aluno
- [ ] Rodar a correção automaticamente

---- Boa experiência! ----
