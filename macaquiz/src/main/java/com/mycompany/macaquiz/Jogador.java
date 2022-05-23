package com.mycompany.macaquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Jogador {

    //atributos
    
    private String idJogador;
    private String apelido;
    private String senha;
    private String patente;
    private int pontuacaoMaxima;

    //construtores
    
    public Jogador() {}

    public Jogador(String idJogador, String apelido, String senha) {
        setIdJogador(idJogador);
        setApelido(apelido);
        setSenha(senha);
        setPontuacaoMaxima(0);
    }
    
    public Jogador(String idJogador, String apelido, String senha, int pontuacaoMaxima) {
        setIdJogador(idJogador);
        setApelido(apelido);
        setSenha(senha);
        setPontuacaoMaxima(pontuacaoMaxima);
    }

    //métodos modificadores
    
    public void setIdJogador(String idJogador) {
        this.idJogador = idJogador;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPatente() {
        if (pontuacaoMaxima < 10) {
            this.patente = "Iniciante";
        } else if (pontuacaoMaxima >= 10 && pontuacaoMaxima < 20) {
            this.patente = "Amador";
        }
        if (pontuacaoMaxima >= 20 && pontuacaoMaxima < 30) {
            this.patente = "Macaco Louco";
        }
        if (pontuacaoMaxima >= 30) {
            this.patente = "King Kong";
        }
    }

    public void setPontuacaoMaxima(int pontuacaoMaxima) {
        this.pontuacaoMaxima = pontuacaoMaxima;
        setPatente();
    }

    //métodos de acesso
    
    public String getIdJogador() {
        return this.idJogador;
    }

    public String getApelido() {
        return this.apelido;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getPatente() {
        return this.patente;
    }

    public int getPontuacaoMaxima() {
        return this.pontuacaoMaxima;
    }

    @Override
    public String toString() {
        return "Id: " + this.idJogador
                + "\nApelido: " + this.apelido
                + "\nPatente: " + this.patente
                + "\nPontuacao: " + this.pontuacaoMaxima;
    }

    //métodos para o banco de dados bdmacaquiz
    
    public void inserir() {
        //1: Definir o comando SQL
        String sql = "INSERT INTO Jogador(idJogador, apelido, senha, patente, pontuacaoMaxima) VALUES (?, ?, ?, ?, ?)";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, idJogador);
            ps.setString(2, apelido);
            ps.setString(3, senha);
            ps.setString(4, patente);
            ps.setInt(5, pontuacaoMaxima);
            //5: Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizar() {
        //1: Definir o comando SQL
        String sql = "UPDATE Jogador SET apelido = ?, senha = ?, patente = ?, pontuacaoMaxima = ? WHERE idJogador =  ?";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, apelido);
            ps.setString(2, senha);
            ps.setString(3, patente);
            ps.setInt(4, pontuacaoMaxima);
            ps.setString(5, idJogador);
            //5: Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void apagar() {
        //1: Definir o comando SQL
        String sql = "DELETE FROM Jogador WHERE idJogador = ?";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, idJogador);
            //5: Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listar() {
        //1: Definir o comando SQL
        String sql = "SELECT * FROM Jogador";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Executa o comando e guarda o resultado em um ResultSet
            ResultSet rs = ps.executeQuery();
            //5: itera sobre o resultado
            while (rs.next()) {
                String idJogador = rs.getString("idJogador");
                String apelido = rs.getString("apelido");
                String senha = rs.getString("senha");
                String patente = rs.getString("patente");
                String pontuacaoMaxima = rs.getString("pontuacaoMaxima");
                String aux = String.format(
                        "Id: %s, Apelido: %s, Senha: %s Patente: %s, Pontuacao Maxima: %s",
                        idJogador,
                        apelido,
                        senha,
                        patente,
                        pontuacaoMaxima
                );
                JOptionPane.showMessageDialog(null, aux);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String listarRanking() {
        //1: Definir o comando SQL
        String sql = "SELECT * FROM Jogador ORDER BY pontuacaoMaxima DESC LIMIT 20";
        String ranking = "";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Executa o comando e guarda o resultado em um ResultSet
            ResultSet rs = ps.executeQuery();
            //5: itera sobre o resultado
            int posicao = 0;
            while (rs.next()) {
                posicao++;
                String idJogador = rs.getString("idJogador");
                String patente = rs.getString("patente");
                int pontuacaoMaxima = rs.getInt("pontuacaoMaxima");
                ranking = ranking + String.format("%2sº | %-20s | %-12s | %d pontos\n", posicao, idJogador, patente, pontuacaoMaxima);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ranking = "ERRO AO ACESSAR RANKING";
        }
        return ranking;
    }
    
    public String getApelidoBD() throws Exception {
        String apelidoBD = null;
        String sql = "SELECT * FROM Jogador WHERE idJogador = ?";
        try ( Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, idJogador);
            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    apelidoBD = rs.getString("apelido");
                }
            }
        }
        return apelidoBD;
    }
    
    public int getPontuacaoBD() throws Exception {
        int pontuacaoBD = 0;
        String sql = "SELECT * FROM Jogador WHERE idJogador = ?";
        try ( Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, idJogador);
            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    pontuacaoBD = rs.getInt("pontuacaoMaxima");
                }
            }
        }
        return pontuacaoBD;
    }
}