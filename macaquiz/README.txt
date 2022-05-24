Requisitos para rodar o jogo: MySQL, plataforma Java e NetBeans IDE (versão 13 preferencialmente).

Passos para rodar o jogo:

1: Criar um banco de dados com o seguinte script:

create database bdmacaquiz;
use bdmacaquiz;

create table Jogador (idJogador varchar(20) primary key, apelido varchar(20) not null, senha varchar(20) not null, patente varchar(20), pontuacaoMaxima integer not null);

create table Administrador (idAdmin varchar(20) primary key, senha varchar(20) not null);

2: Instalar a fonte presente na pasta \src\main\resources. Basta abrir o arquivo zip, abrir o arquivo "JUNGLEFE.TTF" e selecionar "Install".

3: Tenha certeza de que a última versão da plataforma Java está instalada em seu computador. Para isso, abra o menu Iniciar do Windows e pesquise por Java, selecione a opção "Verificar Atualizações" ou "Check for Updates".

4: Mova a pasta "macaquiz" para onde você preferir. Abra o NetBeans, selecione a opção "Open Project" no canto superior esquerdo e selecione a pasta "macaquiz".

5: Um projeto Maven chamado macaquiz aparecerá à esquerda, abra-o e, dentro dele, abra SourcePackages -> com.mycompany.macaquiz e você verá todas as classes do jogo.

6: Abra "ConnectionFactory.java" e, na linha 9 do código, mude a senha de "ECA302" para a senha do seu SQL Server.

7: Agora basta clicar com o botão direito em "Macaquiz.java" e selecionar "Run file" (ou a tradução para português).

Obs.: Na primeira vez, o jogo demorará um pouco para abrir, mas depois ele sempre abrirá rapidamente.