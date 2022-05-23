Passos para rodar o jogo:

1: Criar um banco de dados com o seguinte script:

create database bdmacaquiz;
use bdmacaquiz;

create table Jogador (idJogador varchar(20) primary key, apelido varchar(20) not null, senha varchar(20) not null, patente varchar(20), pontuacaoMaxima integer not null);

create table Administrador (idAdmin varchar(20) primary key, senha varchar(20) not null);

2: Instalar a fonte presente na pasta src\main\resources. Basta abrir o arquivo zip, abrir o arquivo "JUNGLEFE.TTF" e clicar em "Install".

3: Mova a pasta "macaquiz" para dentro da pasta "NetBeansProjects", que provavelmente fica dentro da pasta "Documentos". Assim o projeto do macaquiz deverá aparecer no seu NetBeans.

4: Com o NetBeans aberto, abra o projeto macaquiz e, dentro dele, abra SourcePackaes -> com.mycompany.macaquiz e você verá todas as classes do jogo.

5: Abra "ConnectionFactory.java" e, na linha 9 do código, mude a senha de "ECA302" para a senha do seu SQL Server.

6: Agora basta clicar com o botão direito em "Interface.java" e selecionar "Run file" (ou a tradução para português).

Na primeira vez, provavelmente vai demorar um pouco para abrir o jogo, mas depois ele vai sempre abrir bem rápido.