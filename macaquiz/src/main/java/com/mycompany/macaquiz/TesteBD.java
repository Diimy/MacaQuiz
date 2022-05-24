package com.mycompany.macaquiz;

import javax.swing.JOptionPane;

public class TesteBD {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        JOptionPane.showMessageDialog(null, jogador.listarRanking());
    }
}