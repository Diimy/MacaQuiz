Requisitos para rodar o jogo: MySQL, plataforma Java e NetBeans IDE (versão 13 preferencialmente).

Passos para rodar o jogo:

1: Criar um banco de dados com o script disponível na pasta "Banco de Dados".

2: Instalar a fonte presente na pasta macaquiz\src\main\resources. Basta abrir o arquivo zip, abrir o arquivo "JUNGLEFE.TTF" e selecionar "Install".

3: Tenha certeza de que a última versão da plataforma Java está instalada em seu computador. Para isso, abra o menu Iniciar do Windows e pesquise por Java, selecione a opção "Verificar Atualizações" ou "Check for Updates".

4: Mova a pasta "macaquiz" para onde você preferir. Abra o NetBeans IDE, selecione a opção "Open Project" no canto superior esquerdo e selecione a pasta "macaquiz".

5: Um projeto Maven chamado macaquiz aparecerá à esquerda, abra-o e, dentro dele, abra SourcePackages -> com.mycompany.macaquiz e você verá todas as classes do jogo.

6: Abra "ConnectionFactory.java" e, na linha 9 do código, mude a senha de "ECA302" para a senha do seu servidor MySQL.

7: Agora basta clicar com o botão direito no projeto macaquiz (ou no arquivo Macaquiz.java) e selecionar "Run". Talvez a opção Run não esteja disponível, caso isso aconteça, clique com o botão direito no projeto "macaquiz" e selecione a opção de solucionar problemas do projeto.

Obs.: Na primeira vez, o jogo demorará um pouco para abrir, mas depois ele sempre abrirá rapidamente.