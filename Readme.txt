-------------- Cesar++ --------------

TUTORIAL: Como rodar o projeto?

Tutorial do backend:

I - Configurar as portas:

	 O servidor está rodando na porta 9000, isso pode ser alterado trocando o valor de "server.port" no arquivo
         "application.properties", que está no caminho: cesarplusplus\src\main\resources\application.properties.
	 Porém isso vai acarretar em problemas no frontend, pois as requisições http estão sendo enviadas para o
	 localhost na porta 9000.

II - Configurar o banco de dados MySQL:

	No mesmo arquivo para configuração da porta do servidor, o "application.properties", é feita a configuração de
	autenticação do banco de dados. Atualmente as configurações de encontram assim:

	(1)	spring.datasource.url=jdbc:mysql://localhost:3306/cesarplusplus
	(2)	spring.datasource.username=root
	(3)	spring.datasource.password=2020201003
	(4)	spring.jpa.hibernate.ddl-auto=create

	- Na configuração 1 é possivel mudar o caminho pelo qual o banco de dados é acessado, daí você precisará
	  criar um servidor MySQL e escrever esse path de acordo como o servidor do database está configurado no seu computador.
	
	- Na configuração 2 você deve preencher com o seu username do banco de dados.
	
	- Na configuração 3 deve ser colocada a senha de acesso para o database.

	- Na configuração 4 é especificado como o banco de dados deve ser tratado na incialização do backend, em "create" toda vez
	  que o sevidor for reiniciado o banco será apagado e novas tabelas serão geradas. Para manter os dados nas tabelas configure
	  como "validate".

Tutorial do frontend:

	- Rode o frontend com algum websever em qualquer porta, pois o backend está programado para aceitar requisições
	  de qualquer caminho. Obs.: Em nosso projeto usamos o Live Server, que vem como extensão no VsCode.


---- Boa experiência! ----