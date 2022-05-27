create database bdmacaquiz;
use bdmacaquiz;

create table Jogador (idJogador varchar(20) primary key, apelido varchar(20) not null, senha varchar(20) not null, patente varchar(20), pontuacaoMaxima integer not null);

create table Administrador (idAdmin varchar(20) primary key, senha varchar(20) not null);

create table Questao (nQuestao integer primary key, enunciado varchar(200), altA varchar(200), altB varchar(200), altC varchar(200), altD varchar(200), correta varchar(200), charCorreta char(1));

insert into Questao values (
1,
'Um programa é',
'A) uma sequência finita e lógica de ações que visam obter uma solução para um problema.',
'B) um conjunto de instruções escritas em uma linguagem de programação, executado por um computador.',
'C) uma sequência infinita e ilógica de ações não executáveis que visam obter um problema para uma solução.',
'D) TV globinho, sendo um dos mais famosos entre o público juvenil.',
'B) um conjunto de instruções escritas em uma linguagem de programação, executado por um computador.',
'B');

insert into Questao values (
2,
'Um algoritmo é:',
'A) uma sequência finita e lógica de ações executáveis que visam obter uma solução para um problema.',
'B) um conjunto de instruções escritas em uma linguagem de programação, executado por um computador.',
'C) uma sequência infinita e ilógica de ações não executáveis que visam obter um problema para uma solução.',
'D) a matrix.',
'A) uma sequência finita e lógica de ações executáveis que visam obter uma solução para um problema.',
'A'
);

insert into Questao values (
3,
'Como algoritmos podem ser representados?',
'A) Por Pseudocódigos e Fluxogramas.',
'B) Por Pseudocódigos.',
'C) Por Fluxogramas.',
'D) Nenhuma das alternativas anteriores.',
'A) Por Pseudocódigos e Fluxogramas.',
'A'
);

insert into Questao values (
4,
'Qual é o tipo de variável usado para denominar uma sequência de caracteres?',
'A) int',
'B) float',
'C) string',
'D) bool',
'C) string',
'C'
);

insert into Questao values (
5,
'Qual dos sinais a seguir é usado para atribuir um valor a uma variável?',
'A) :',
'B) -',
'C) +',
'D) =',
'D) =',
'D'
);

insert into Questao values (
6,
'Dentre as opções a seguir, qual poderia ser o nome a uma variável?',
'A) 14gorilas',
'B) 14 gorilas',
'C) quatorze_gorilas',
'D) quatorze gorilas',
'C) quatorze_gorilas',
'C'
);

insert into Questao values (
7,
'Qual a forma correta de usar a função if?',
'A) (if num1 > num2)',
'B) if num1 > num2:',
'C) if num1 > num2 then:',
'D) if num1 > num2 {',
'B) if num1 > num2:',
'B'
);

insert into Questao values (
8,
'Como se insere um comentário em código Python?',
'A) #assim',
'B) /*assim*/',
'C) //assim',
'D) "assim"',
'A) #assim',
'A'
);

insert into Questao values (
9,
'Qual a forma correta de usar a função while?',
'A) while (x < y)',
'B) while x < y {',
'C) x < y while {',
'D) while x < y :',
'D) while x < y :',
'D'
);

insert into Questao values (
10,
'Sobre a função range, qual sintaxe é a correta?',
'A) range (início, meio, fim)',
'B) range (passo, início, fim)',
'C) range (início, fim, passo)',
'D) range (início, passo)',
'C) range (início, fim, passo)',
'C'
);

insert into Questao values (
11,
'Qual comando é utilizado para parar um loop?',
'A) stop',
'B) exit',
'C) break',
'D) return',
'C) break',
'C'
);

insert into Questao values (
12,
'Qual das coleções a seguir é ordenada, alterável e permite membros duplicados?',
'A) Lista',
'B) Set',
'C) Tupla',
'D) Dicionário',
'A) Lista',
'A'
);

insert into Questao values (
13,
'Quando se usa a cláusula elif?',
'A) Quando o if precisa ser encerrado',
'B) Quando a validação adversa à validação do if precisa ser realizada.',
'C) Quando uma validação diferente da validação do if precisa ser realizada.',
'D) Quando uma segunda instrução específica é necessária.',
'C) Quando uma validação diferente da validação do if precisa ser realizada.',
'C'
);

insert into Questao values (
14,
'Qual dessas coleções é um dicionário?',
'A) ("cenoura","banana","tomate")',
'B) {"fruta": "banana","legume": "cenoura"}',
'C) ["cenoura","banana","tomate"]',
'D) {"cenoura","banana","tomate"}',
'B) {"fruta": "banana","legume": "cenoura"}',
'B'
);

insert into Questao values (
15,
'Qual dessas coleções é uma tupla?',
'A) {"mesa","cadeira","estante"}',
'B) ("mesa","cadeira","estante")',
'C) ["mesa","cadeira","estante"]',
'D) (objetos: "mesa","cadeira","estante")',
'B) ("mesa","cadeira","estante")',
'B'
);

Comentários:

A pontuação armazenada no banco de dados é a maior pontuação que o jogador já conseguiu.
Caso um jogador não insira um apelido, seu apelido será igual ao seu id.
A patente do jogador será determinada pelo programa em Java de acordo com a pontuação final do jogador.
