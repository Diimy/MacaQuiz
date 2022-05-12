package com.mycompany.macaquiz;

import javax.swing.JOptionPane;

public class TesteBD {

    public static void main(String[] args) {
        
        //Menu de escolha jogador/administrador
        String menu1 = "1-Administrador\n2-Jogador";
        String menu2 = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int op1, op2;
        String idJogador, apelido, senha, patente, idAdmin;
        int pontuacaoMaxima;
        //objetos das calsses Administrador e Jogador
        Jogador j = new Jogador();
        Administrador admin = new Administrador();
        op1 = Integer.parseInt(JOptionPane.sowInputDialog(menu1));
        if (op1 == 1) {
            do {
                op2 = Integer.parseInt(JOptionPane.showInputDialog(menu2));
                switch (op2) {
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
            } while (op2 != 0);
        } else {
            do {
                op2 = Integer.parseInt(JOptionPane.showInputDialog(menu2));
                switch (op2) {
                    case 1: //Operação 1: Cadastrar
                        idAdmin = JOptionPane.showInputDialog("Id do administrador?");
                        senha = JOptionPane.showInputDialog("Senha?");
                        admin.setIdAdmin(idAdmin);
                        admin.setSenha(senha);
                        admin.inserir();
                        break;
                    case 2: //Operação 2: Atualizar
                        idAdmin = JOptionPane.showInputDialog("Id do administrador?");
                        senha = JOptionPane.showInputDialog("Senha?");
                        admin.setIdAdmin(idAdmin);
                        admin.setSenha(senha);
                        admin.atualizar();
                        break;
                    case 3: //Operação 3: Apagar
                        idAdmin = JOptionPane.showInputDialog("Id do administrador?");
                        admin.setIdAdmin(idAdmin);
                        admin.apagar();
                        break;
                    case 4: //Operação 4: Listar
                        admin.listar();
                        break;
                    case 0: //Operação 0 : Sair
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                }
            } while (op2 != 0);
        }
    }
}
