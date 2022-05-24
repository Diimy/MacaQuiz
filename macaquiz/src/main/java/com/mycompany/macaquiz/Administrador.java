package com.mycompany.macaquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Administrador {
    //atributos
    private String idAdmin;
    private String senha;
    //construtores
    public Administrador() {}
    public Administrador(String idAdmin, String senha) {
        setIdAdmin(idAdmin);
        setSenha(senha);
    }
    //métodos modificadores
    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //métodos de acesso
    public String getIdAdmin() {
        return this.idAdmin;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    //métodos para o banco de dados bdmacaquiz
    public void inserir() {
        //1: Definir o comando SQL
        String sql = "INSERT INTO Administrador(idAdmin, senha) VALUES (?, ?)";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, idAdmin);
            ps.setString(2, senha);
            //5: Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void atualizar() {
        //1: Definir o comando SQL
        String sql = "UPDATE Administrador SET senha = ? WHERE idAdmin =  ?";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(2, senha);
            ps.setString(3, idAdmin);
            //5: Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void apagar() {
        //1: Definir o comando SQL
        String sql = "DELETE FROM Administrador WHERE idAdmin = ?";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, idAdmin);
            //5: Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void listar() {
        //1: Definir o comando SQL
        String sql = "SELECT * FROM Administrador";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Executa o comando e guarda
            //o resultado em um ResultSet
            ResultSet rs = ps.executeQuery();
            //5: itera sobre o resultado
            while (rs.next()) {
                String idAdmin = rs.getString("idAdmin");
                String senha = rs.getString("senha");
                String aux = String.format(
                        "Id: %s, Senha: %s",
                        idAdmin,
                        senha
                );
                JOptionPane.showMessageDialog(null, aux);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
