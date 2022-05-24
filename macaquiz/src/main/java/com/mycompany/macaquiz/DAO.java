package com.mycompany.macaquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {

    public boolean existeJogador(Jogador jogador) throws Exception {
        String sql = "SELECT * FROM Jogador WHERE idJogador = ? AND senha = ?";
        try ( Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, jogador.getIdJogador());
            ps.setString(2, jogador.getSenha());
            try ( ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    
    public boolean existeAdministrador(Administrador administrador) throws Exception {
        String sql = "SELECT * FROM Administrador WHERE idAdmin = ? AND senha = ?";
        try ( Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, administrador.getIdAdmin());
            ps.setString(2, administrador.getSenha());
            try ( ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    
}