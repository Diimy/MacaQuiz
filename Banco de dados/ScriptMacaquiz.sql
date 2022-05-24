create database bdmacaquiz;
use bdmacaquiz;

create table Jogador (idJogador varchar(20) primary key, apelido varchar(20) not null, senha varchar(20) not null, patente varchar(20), pontuacaoMaxima integer not null);
create table Administrador (idAdmin varchar(20) primary key, senha varchar(20) not null);
create table Questao (nQuestao integer primary key, enunciado varchar(200), alternativas varchar(600), correta varchar(200), charCorreta char(1));

insert into Questao values (1,
'Um programa é',
'A) uma sequência finita e lógica de ações que visam obter uma solução para um problema.\n
B) um conjunto de instruções escritas em uma linguagem de programação, executado por um computador.\n
C) uma sequência infinita e ilógica de ações não executáveis que visam obter um problema para uma solução.\n
D) TV globinho, sendo um dos mais famosos entre o público juvenil.',
'B) um conjunto de instruções escritas em uma linguagem de programação, executado por um computador.',
'B');