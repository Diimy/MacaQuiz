package com.mycompany.macaquiz;

public class GeradorDeQuestao {
    
    //atributos
    
    private String
            questao1, q1A, q1B, q1C, q1D, resposta1,
            questao2, q2A, q2B, q2C, q2D, resposta2,
            questao3, q3A, q3B, q3C, q3D, resposta3,
            questao4, q4A, q4B, q4C, q4D, resposta4,
            questao5, q5A, q5B, q5C, q5D, resposta5;
    
    private char resposta1char, resposta2char, resposta3char, resposta4char, resposta5char;
    
    //contrutores
    
    public GeradorDeQuestao() {
        //gera a 1ª questão, suas alternativas e resposta
        questao1 = "1. Um programa é:";
        q1A = "A) uma sequência finita e lógica de ações executáveis que visam obter uma solução para um problema.";
        resposta1 = q1B = "B) um conjunto de instruções escritas em uma linguagem de programação que podem ser executadas por um computador.";
        q1C = "C) uma sequência infinita e ilógica de ações não executáveis que visam obter um problema para uma solução.";
        q1D = "D) TV globinho, sendo um dos mais famosos entre o público juvenil.";
        resposta1char = 'B';
        //gera a 2ª questão, suas alternativas e resposta
        questao2 = "2. Um algoritmo é:";
        resposta2 = q2A = "A) uma sequência finita e lógica de ações executáveis que visam obter uma solução para um problema.";
        q2B = "B) um conjunto de instruções escritas em uma linguagem de programação, executado por um computador. ";
        q2C = "C) uma sequência infinita e ilógica de ações não executáveis que visam obter um problema para uma solução.";
        q2D = "D) O filme Matrix.";
        resposta2char = 'A';
        //gera a 3ª questão, suas alternativas e resposta
        questao3 = "3. Como algoritmos podem ser representados?";
        resposta3 = q3A = "A) Por Pseudocódigos e Fluxogramas.";
        q3B = "B) Por Pseudocódigos.";
        q3C = "C) Por Fluxogramas.";
        q3D = "D) Nenhuma das alternativas anteriores.";
        resposta3char = 'A';
        //gera a 4ª questão, suas alternativas e resposta
        questao4 = "4. Qual é o tipo de variável utilizado para denominar sequência de caracteres?";
        q4A = "A) int";
        q4B = "B) float";
        resposta4 = q4C = "C) string";
        q4D = "D) bool";
        resposta4char = 'C';
        //gera a 5ª questão, suas alternativas e resposta
        questao5 = "5. Qual sinal a seguir é utilizado para atribuir um valor a uma variável?";
        q5A = "A) :";
        q5B = "B) -";
        q5C = "C) +";
        resposta5 = q5D = "D) =";
        resposta5char = 'D';
    }
    
    //getters
    
    public String getQuestao1() {
        return questao1;
    }

    public String getQ1A() {
        return q1A;
    }

    public String getQ1B() {
        return q1B;
    }

    public String getQ1C() {
        return q1C;
    }

    public String getQ1D() {
        return q1D;
    }

    public String getQuestao2() {
        return questao2;
    }

    public String getQ2A() {
        return q2A;
    }

    public String getQ2B() {
        return q2B;
    }

    public String getQ2C() {
        return q2C;
    }

    public String getQ2D() {
        return q2D;
    }

    public String getQuestao3() {
        return questao3;
    }

    public String getQ3A() {
        return q3A;
    }

    public String getQ3B() {
        return q3B;
    }

    public String getQ3C() {
        return q3C;
    }

    public String getQ3D() {
        return q3D;
    }

    public String getQuestao4() {
        return questao4;
    }

    public String getQ4A() {
        return q4A;
    }

    public String getQ4B() {
        return q4B;
    }

    public String getQ4C() {
        return q4C;
    }

    public String getQ4D() {
        return q4D;
    }

    public String getQuestao5() {
        return questao5;
    }

    public String getQ5A() {
        return q5A;
    }

    public String getQ5B() {
        return q5B;
    }

    public String getQ5C() {
        return q5C;
    }

    public String getQ5D() {
        return q5D;
    }

    public String getResposta1() {
        return resposta1;
    }

    public String getResposta2() {
        return resposta2;
    }

    public String getResposta3() {
        return resposta3;
    }

    public String getResposta4() {
        return resposta4;
    }

    public String getResposta5() {
        return resposta5;
    }
    public char getResposta1char() {
        return resposta1char;
    }

    public char getResposta2char() {
        return resposta2char;
    }

    public char getResposta3char() {
        return resposta3char;
    }

    public char getResposta4char() {
        return resposta4char;
    }

    public char getResposta5char() {
        return resposta5char;
    }
}
