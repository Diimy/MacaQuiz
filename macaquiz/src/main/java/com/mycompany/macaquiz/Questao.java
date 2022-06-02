package com.mycompany.macaquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Questao {
    
    //atributos
    private int nQuestao;
    private String enunciado, altA, altB, altC, altD, correta;
    private char charCorreta;
    
    //método de acesso ao banco de dados que gera a questão
    
    public void gerarQuestao(int nQuestao) throws Exception {
        this.nQuestao = nQuestao;
        String sql = "SELECT * FROM Questao WHERE nQuestao = ?";
        try ( Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, nQuestao);
            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    this.enunciado = rs.getString("enunciado");
                    this.altA = rs.getString("altA");
                    this.altB = rs.getString("altB");
                    this.altC = rs.getString("altC");
                    this.altD = rs.getString("altD");
                    this.correta = rs.getString("correta");
                    this.charCorreta = correta.charAt(0);
                }
            }
        }
    }
    
    //getters e setters

    public int getnQuestao() {
        return nQuestao;
    }

    public void setnQuestao(int nQuestao) {
        this.nQuestao = nQuestao;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getAltA() {
        return altA;
    }

    public void setAltA(String altA) {
        this.altA = altA;
    }

    public String getAltB() {
        return altB;
    }

    public void setAltB(String altB) {
        this.altB = altB;
    }

    public String getAltC() {
        return altC;
    }

    public void setAltC(String altC) {
        this.altC = altC;
    }

    public String getAltD() {
        return altD;
    }

    public void setAltD(String altD) {
        this.altD = altD;
    }

    public String getCorreta() {
        return correta;
    }

    public void setCorreta(String correta) {
        this.correta = correta;
    }

    public char getCharCorreta() {
        return charCorreta;
    }

    public void setCharCorreta(char charCorreta) {
        this.charCorreta = charCorreta;
    }

    
}
