package com.mycompany.macaquiz;

import javax.swing.JOptionPane;

public class TesteJogadorBD {

    public static void main(String[] args) {
        //Menu de teste (apenas para CRUD do jogador)
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int op;
        String idJogador, apelido, senha, patente;
        int pontuacaoMaxima;
        Jogador j = new Jogador();
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1: //Operação 1: Cadastrar
                    idJogador = JOptionPane.showInputDialog("Id do jogador?");
                    apelido = JOptionPane.showInputDialog("Apelido?");
                    senha = JOptionPane.showInputDialog("Senha?");
                    patente = JOptionPane.showInputDialog("Patente?");
                    pontuacaoMaxima = Integer.parseInt(JOptionPane.showInputDialog("Pontuacao maxima?"));
                    j.setIdJogador(idJogador);
                    j.setApelido(apelido);
                    j.setSenha(senha);
                    if (patente.equals("")) {
                        j.setPatente(null);
                    } else {
                        j.setPatente(patente);
                    }
                    j.setPontuacaoMaxima(pontuacaoMaxima);
                    j.inserir();
                    break;
                case 2: //Operação 2: Atualizar
                    idJogador = JOptionPane.showInputDialog("Id do jogador?");
                    apelido = JOptionPane.showInputDialog("Apelido?");
                    senha = JOptionPane.showInputDialog("Senha?");
                    patente = JOptionPane.showInputDialog("Patente?");
                    pontuacaoMaxima = Integer.parseInt(JOptionPane.showInputDialog("Pontuacao maxima?"));
                    j.setIdJogador(idJogador);
                    j.setApelido(apelido);
                    j.setSenha(senha);
                    if (patente.equals("")) {
                        j.setPatente(null);
                    } else {
                        j.setPatente(patente);
                    }
                    j.setPontuacaoMaxima(pontuacaoMaxima);
                    j.atualizar();
                    break;
                case 3: //Operação 3: Apagar
                    idJogador = JOptionPane.showInputDialog("Id do jogador?");
                    j.setIdJogador(idJogador);
                    j.apagar();
                    break;
                case 4: //Operação 4: Listar
                    j.listar();
                    break;
                case 0: //Operação 0 : Sair
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (op != 0);
    }
}
