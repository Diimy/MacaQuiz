package com.mycompany.macaquiz;

import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Macaquiz extends javax.swing.JFrame {
    
    //Construtor padrão
    
    public Macaquiz() {
        //adiciona um título à janela
        super ("Macaquiz");
        //adiciona o ícone à janela
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icone.png")));
        //adiciona os componentes à janela
        initComponents();
        //centraliza a janela
        this.setLocationRelativeTo(null);
        //maximiza a janela
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //esconde a opção de maximizar
        this.setResizable(false);
    }
    
    //Inicializa os objetos das classes Administrador, Jogador e GeradorDeQuestao
    Jogador jogador = new Jogador();
    Administrador administrador = new Administrador();
    Questao questao = new Questao();
    //declara variáveis que serão usadas ao longo do quiz
    char resposta, respostaCorreta;
    int nQuestao, pontuacao, vidas;
    
    //Código gerado automaticamente pelo NetBeans ao constuir o design do jogo. Não altere nada, por favor.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAlternativas = new javax.swing.ButtonGroup();
        jPanel = new javax.swing.JPanel();
        jPanelLogin = new javax.swing.JPanel();
        jLabelBemVindo = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelConectarSe = new javax.swing.JLabel();
        jLabelIDUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelCadastro = new javax.swing.JLabel();
        jButtonCadastrarSe = new javax.swing.JButton();
        jPanelCadastro = new javax.swing.JPanel();
        jLabelBemVindoCadastro = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelTituloCadastro = new javax.swing.JLabel();
        jLabelJogador = new javax.swing.JLabel();
        jLabelApelido = new javax.swing.JLabel();
        jLabelSenhaCadastro = new javax.swing.JLabel();
        jTextFieldJogador = new javax.swing.JTextField();
        jTextFieldApelido = new javax.swing.JTextField();
        jPasswordFieldSenhaCadastro = new javax.swing.JPasswordField();
        jLabelLogin = new javax.swing.JLabel();
        jButtonConecteSe = new javax.swing.JButton();
        jButtonSairCadastro = new javax.swing.JButton();
        jPanelIntroducao = new javax.swing.JPanel();
        jLabelBemVindoIntroducao = new javax.swing.JLabel();
        jButtonProximo = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jTextAreaIntroducao = new javax.swing.JTextArea();
        jPanelMenu = new javax.swing.JPanel();
        jLabelMenu = new javax.swing.JLabel();
        jButtonIniciarQuiz = new javax.swing.JButton();
        jButtonRanking = new javax.swing.JButton();
        jButtonSairMenu = new javax.swing.JButton();
        jLabelFoto = new javax.swing.JLabel();
        jButtonConfigurar = new javax.swing.JButton();
        jLabelApelidoMenu = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelIdJogador = new javax.swing.JLabel();
        jLabelPatenteMenu = new javax.swing.JLabel();
        jLabelPatenteMenu2 = new javax.swing.JLabel();
        jLabelPontuacaoMenu = new javax.swing.JLabel();
        jLabelPontuacaoMenu2 = new javax.swing.JLabel();
        jPanelRanking = new javax.swing.JPanel();
        jButtonVoltarRanking = new javax.swing.JButton();
        jLabelRanking = new javax.swing.JLabel();
        jTextRanking = new javax.swing.JTextArea();
        jPanelConfig = new javax.swing.JPanel();
        jButtonVoltarConfig = new javax.swing.JButton();
        jLabelConfig = new javax.swing.JLabel();
        jButtonPerfil = new javax.swing.JButton();
        jPanelPerfil = new javax.swing.JPanel();
        jButtonVoltarPerfil = new javax.swing.JButton();
        jLabelConfig1 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jLabelIdJogadorPerfil = new javax.swing.JLabel();
        jTextFieldApelidoPerfil = new javax.swing.JTextField();
        jLabelApelidoPerfil = new javax.swing.JLabel();
        jPanelMenuAdmin = new javax.swing.JPanel();
        jLabelAdministrador = new javax.swing.JLabel();
        jButtonSairMenu1 = new javax.swing.JButton();
        jLabelFoto1 = new javax.swing.JLabel();
        jLabelIdAdmin = new javax.swing.JLabel();
        jPanelComeco = new javax.swing.JPanel();
        jLabelBoaSorte = new javax.swing.JLabel();
        jTextAreaComeco = new javax.swing.JTextArea();
        jButtonComecarQuiz = new javax.swing.JButton();
        jButtonVoltarComeco = new javax.swing.JButton();
        jPanelQuestao = new javax.swing.JPanel();
        jTextAreaEnunciado = new javax.swing.JTextArea();
        jRadioButtonA = new javax.swing.JRadioButton();
        jTextAreaAltA = new javax.swing.JTextArea();
        jRadioButtonB = new javax.swing.JRadioButton();
        jTextAreaAltB = new javax.swing.JTextArea();
        jRadioButtonC = new javax.swing.JRadioButton();
        jTextAreaAltC = new javax.swing.JTextArea();
        jRadioButtonD = new javax.swing.JRadioButton();
        jTextAreaAltD = new javax.swing.JTextArea();
        jLabelNivel = new javax.swing.JLabel();
        jButtonProxima = new javax.swing.JButton();
        jPanelFimDeJogo = new javax.swing.JPanel();
        jLabelFimDeJogo = new javax.swing.JLabel();
        jLabelFimDeJogo2 = new javax.swing.JLabel();
        jLabelPontuacaoFimDeJogo = new javax.swing.JLabel();
        jTextAreaPontuacaoFimDeJogo = new javax.swing.JTextArea();
        jLabelPatenteFimDeJogo = new javax.swing.JLabel();
        jTextAreaPatenteFimDeJogo = new javax.swing.JTextArea();
        jButtonMenuFimDeJogo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelParabens = new javax.swing.JPanel();
        jLabelParabens = new javax.swing.JLabel();
        jLabelParabens2 = new javax.swing.JLabel();
        jLabelPontuacaoParabens = new javax.swing.JLabel();
        jTextAreaPontuacaoParabens = new javax.swing.JTextArea();
        jLabelPatenteParabens = new javax.swing.JLabel();
        jTextAreaPatenteParabens = new javax.swing.JTextArea();
        jButtonMenuParabens = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelMacaco = new javax.swing.JLabel();
        jLabelMacaco2 = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel.setBackground(new java.awt.Color(47, 94, 42));
        jPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 216, 0), 5, true));
        jPanel.setPreferredSize(new java.awt.Dimension(725, 725));
        jPanel.setLayout(new java.awt.CardLayout());

        jPanelLogin.setBackground(new java.awt.Color(47, 94, 42));
        jPanelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelLogin.setPreferredSize(new java.awt.Dimension(720, 720));
        jPanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBemVindo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBemVindo.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jLabelBemVindo.setForeground(new java.awt.Color(255, 216, 0));
        jLabelBemVindo.setText("Bem-vindo(a) ao Macaquiz!");
        jPanelLogin.add(jLabelBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 10, -1, -1));

        jButtonEntrar.setBackground(new java.awt.Color(255, 216, 0));
        jButtonEntrar.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(47, 94, 42));
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        jPanelLogin.add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        jButtonSair.setBackground(new java.awt.Color(255, 216, 0));
        jButtonSair.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(47, 94, 42));
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanelLogin.add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 180, -1));

        jLabelConectarSe.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jLabelConectarSe.setForeground(new java.awt.Color(255, 216, 0));
        jLabelConectarSe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConectarSe.setText("Conectar-se");
        jPanelLogin.add(jLabelConectarSe, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 300, 30));

        jLabelIDUsuario.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelIDUsuario.setForeground(new java.awt.Color(255, 216, 0));
        jLabelIDUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIDUsuario.setText("ID");
        jPanelLogin.add(jLabelIDUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 200, 300, 50));

        jLabelSenha.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(255, 216, 0));
        jLabelSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSenha.setText("Senha");
        jPanelLogin.add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 300, 50));

        jTextFieldUsuario.setBackground(new java.awt.Color(255, 216, 0));
        jTextFieldUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(47, 94, 42));
        jTextFieldUsuario.setSelectionColor(new java.awt.Color(149, 187, 68));
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        jPanelLogin.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 240, 330, -1));

        jPasswordFieldSenha.setBackground(new java.awt.Color(255, 216, 0));
        jPasswordFieldSenha.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jPasswordFieldSenha.setForeground(new java.awt.Color(47, 94, 42));
        jPasswordFieldSenha.setSelectionColor(new java.awt.Color(149, 187, 68));
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        jPanelLogin.add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 320, 330, -1));

        jLabelCadastro.setFont(new java.awt.Font("JungleFever", 0, 24)); // NOI18N
        jLabelCadastro.setForeground(new java.awt.Color(255, 216, 0));
        jLabelCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro.setText("Novo por aqui?");
        jPanelLogin.add(jLabelCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 512, 300, -1));

        jButtonCadastrarSe.setBackground(new java.awt.Color(255, 216, 0));
        jButtonCadastrarSe.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonCadastrarSe.setForeground(new java.awt.Color(47, 94, 42));
        jButtonCadastrarSe.setText("Cadastre-se");
        jButtonCadastrarSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarSeActionPerformed(evt);
            }
        });
        jPanelLogin.add(jButtonCadastrarSe, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 300, -1));

        jPanel.add(jPanelLogin, "card2");

        jPanelCadastro.setBackground(new java.awt.Color(47, 94, 42));
        jPanelCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelCadastro.setPreferredSize(new java.awt.Dimension(720, 720));
        jPanelCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBemVindoCadastro.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBemVindoCadastro.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jLabelBemVindoCadastro.setForeground(new java.awt.Color(255, 216, 0));
        jLabelBemVindoCadastro.setText("Bem-vindo(a) ao Macaquiz!");
        jPanelCadastro.add(jLabelBemVindoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 10, -1, -1));

        jButtonCadastrar.setBackground(new java.awt.Color(255, 216, 0));
        jButtonCadastrar.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(47, 94, 42));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));

        jLabelTituloCadastro.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jLabelTituloCadastro.setForeground(new java.awt.Color(255, 216, 0));
        jLabelTituloCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloCadastro.setText("Cadastro");
        jPanelCadastro.add(jLabelTituloCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 300, 30));

        jLabelJogador.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelJogador.setForeground(new java.awt.Color(255, 216, 0));
        jLabelJogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJogador.setText("ID do jogador");
        jPanelCadastro.add(jLabelJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 300, 50));

        jLabelApelido.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelApelido.setForeground(new java.awt.Color(255, 216, 0));
        jLabelApelido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelApelido.setText("Apelido");
        jPanelCadastro.add(jLabelApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 300, 50));

        jLabelSenhaCadastro.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelSenhaCadastro.setForeground(new java.awt.Color(255, 216, 0));
        jLabelSenhaCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSenhaCadastro.setText("Senha");
        jPanelCadastro.add(jLabelSenhaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 300, 50));

        jTextFieldJogador.setBackground(new java.awt.Color(255, 216, 0));
        jTextFieldJogador.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextFieldJogador.setForeground(new java.awt.Color(47, 94, 42));
        jTextFieldJogador.setSelectionColor(new java.awt.Color(149, 187, 68));
        jTextFieldJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJogadorActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jTextFieldJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 240, 330, -1));

        jTextFieldApelido.setBackground(new java.awt.Color(255, 216, 0));
        jTextFieldApelido.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextFieldApelido.setForeground(new java.awt.Color(47, 94, 42));
        jTextFieldApelido.setSelectionColor(new java.awt.Color(149, 187, 68));
        jTextFieldApelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApelidoActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jTextFieldApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 320, 330, -1));

        jPasswordFieldSenhaCadastro.setBackground(new java.awt.Color(255, 216, 0));
        jPasswordFieldSenhaCadastro.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jPasswordFieldSenhaCadastro.setForeground(new java.awt.Color(47, 94, 42));
        jPasswordFieldSenhaCadastro.setSelectionColor(new java.awt.Color(149, 187, 68));
        jPasswordFieldSenhaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaCadastroActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jPasswordFieldSenhaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 400, 330, -1));

        jLabelLogin.setFont(new java.awt.Font("JungleFever", 0, 24)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(255, 216, 0));
        jLabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogin.setText("Já tem uma conta?");
        jPanelCadastro.add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, 300, -1));

        jButtonConecteSe.setBackground(new java.awt.Color(255, 216, 0));
        jButtonConecteSe.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonConecteSe.setForeground(new java.awt.Color(47, 94, 42));
        jButtonConecteSe.setText("Conecte-se");
        jButtonConecteSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConecteSeActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jButtonConecteSe, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, 300, -1));

        jButtonSairCadastro.setBackground(new java.awt.Color(255, 216, 0));
        jButtonSairCadastro.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonSairCadastro.setForeground(new java.awt.Color(47, 94, 42));
        jButtonSairCadastro.setText("Sair");
        jButtonSairCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairCadastroActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jButtonSairCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 180, -1));

        jPanel.add(jPanelCadastro, "card3");

        jPanelIntroducao.setBackground(new java.awt.Color(47, 94, 42));
        jPanelIntroducao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelIntroducao.setPreferredSize(new java.awt.Dimension(720, 720));
        jPanelIntroducao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBemVindoIntroducao.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBemVindoIntroducao.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jLabelBemVindoIntroducao.setForeground(new java.awt.Color(255, 216, 0));
        jLabelBemVindoIntroducao.setText("Bem-vindo(a) ao Macaquiz!");
        jPanelIntroducao.add(jLabelBemVindoIntroducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 10, -1, -1));

        jButtonProximo.setBackground(new java.awt.Color(255, 216, 0));
        jButtonProximo.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonProximo.setForeground(new java.awt.Color(47, 94, 42));
        jButtonProximo.setText("Próximo");
        jButtonProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });
        jPanelIntroducao.add(jButtonProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 600, 210, -1));

        jButtonVoltar.setBackground(new java.awt.Color(255, 216, 0));
        jButtonVoltar.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(47, 94, 42));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanelIntroducao.add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 210, -1));

        jTextAreaIntroducao.setEditable(false);
        jTextAreaIntroducao.setBackground(new java.awt.Color(47, 94, 42));
        jTextAreaIntroducao.setColumns(20);
        jTextAreaIntroducao.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextAreaIntroducao.setForeground(new java.awt.Color(255, 216, 0));
        jTextAreaIntroducao.setLineWrap(true);
        jTextAreaIntroducao.setRows(5);
        jTextAreaIntroducao.setText("Macaquiz é um jogo de quiz com temática de macaco. Você responderá questões sobre lógica de programação com foco em python, as quais podem ser de nível fácil, médio ou difícil. Ao iniciar o jogo, você terá três vidas, sendo que cada resposta incorreta retira uma de suas vidas e cada sequência de três acertos lhe concede uma vida. O número de acertos e a dificuldade das questões respondidas corretamente determinarão sua pontuação, patente e posição (ranking) na tabela de liderança.");
        jTextAreaIntroducao.setToolTipText("");
        jTextAreaIntroducao.setWrapStyleWord(true);
        jTextAreaIntroducao.setBorder(null);
        jTextAreaIntroducao.setSelectionColor(new java.awt.Color(149, 187, 68));
        jPanelIntroducao.add(jTextAreaIntroducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 500, 440));

        jPanel.add(jPanelIntroducao, "card2");

        jPanelMenu.setBackground(new java.awt.Color(47, 94, 42));
        jPanelMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(720, 720));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenu.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jLabelMenu.setForeground(new java.awt.Color(255, 216, 0));
        jLabelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenu.setText("MENU");
        jLabelMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelMenu.add(jLabelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 10, 116, -1));

        jButtonIniciarQuiz.setBackground(new java.awt.Color(255, 216, 0));
        jButtonIniciarQuiz.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonIniciarQuiz.setForeground(new java.awt.Color(47, 94, 42));
        jButtonIniciarQuiz.setText("Iniciar Quiz");
        jButtonIniciarQuiz.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonIniciarQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarQuizActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonIniciarQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 266, -1));

        jButtonRanking.setBackground(new java.awt.Color(255, 216, 0));
        jButtonRanking.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonRanking.setForeground(new java.awt.Color(47, 94, 42));
        jButtonRanking.setText("Ranking");
        jButtonRanking.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRankingActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 266, -1));

        jButtonSairMenu.setBackground(new java.awt.Color(255, 216, 0));
        jButtonSairMenu.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonSairMenu.setForeground(new java.awt.Color(47, 94, 42));
        jButtonSairMenu.setText("Sair");
        jButtonSairMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSairMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairMenuActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonSairMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 266, -1));

        jLabelFoto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelFoto.setForeground(new java.awt.Color(255, 216, 0));
        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExemploFoto.jpg"))); // NOI18N
        jLabelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 216, 0), 5));
        jPanelMenu.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 100, 128, 128));

        jButtonConfigurar.setBackground(new java.awt.Color(255, 216, 0));
        jButtonConfigurar.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonConfigurar.setForeground(new java.awt.Color(47, 94, 42));
        jButtonConfigurar.setText("Configurar");
        jButtonConfigurar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonConfigurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfigurarActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonConfigurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 266, -1));

        jLabelApelidoMenu.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelApelidoMenu.setForeground(new java.awt.Color(255, 216, 0));
        jLabelApelidoMenu.setText("Apelido");
        jPanelMenu.add(jLabelApelidoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jLabelID.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(255, 216, 0));
        jLabelID.setText("ID:");
        jPanelMenu.add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabelIdJogador.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabelIdJogador.setForeground(new java.awt.Color(255, 216, 0));
        jLabelIdJogador.setText("idJogador");
        jPanelMenu.add(jLabelIdJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabelPatenteMenu.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelPatenteMenu.setForeground(new java.awt.Color(255, 216, 0));
        jLabelPatenteMenu.setText("Patente:");
        jPanelMenu.add(jLabelPatenteMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabelPatenteMenu2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabelPatenteMenu2.setForeground(new java.awt.Color(255, 216, 0));
        jLabelPatenteMenu2.setText("Patente");
        jPanelMenu.add(jLabelPatenteMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        jLabelPontuacaoMenu.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelPontuacaoMenu.setForeground(new java.awt.Color(255, 216, 0));
        jLabelPontuacaoMenu.setText("Pontuação:");
        jPanelMenu.add(jLabelPontuacaoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jLabelPontuacaoMenu2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabelPontuacaoMenu2.setForeground(new java.awt.Color(255, 216, 0));
        jLabelPontuacaoMenu2.setText("50");
        jPanelMenu.add(jLabelPontuacaoMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        jPanel.add(jPanelMenu, "card2");

        jPanelRanking.setBackground(new java.awt.Color(47, 94, 42));
        jPanelRanking.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelRanking.setPreferredSize(new java.awt.Dimension(720, 720));
        jPanelRanking.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltarRanking.setBackground(new java.awt.Color(255, 216, 0));
        jButtonVoltarRanking.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonVoltarRanking.setForeground(new java.awt.Color(47, 94, 42));
        jButtonVoltarRanking.setText("Voltar");
        jButtonVoltarRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarRankingActionPerformed(evt);
            }
        });
        jPanelRanking.add(jButtonVoltarRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 600, 210, -1));

        jLabelRanking.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRanking.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jLabelRanking.setForeground(new java.awt.Color(255, 216, 0));
        jLabelRanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRanking.setText("Ranking");
        jLabelRanking.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelRanking.add(jLabelRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 180, -1));

        jTextRanking.setEditable(false);
        jTextRanking.setBackground(new java.awt.Color(47, 94, 42));
        jTextRanking.setColumns(20);
        jTextRanking.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        jTextRanking.setForeground(new java.awt.Color(255, 216, 0));
        jTextRanking.setRows(5);
        jTextRanking.setText("Erro ao carregar ranking");
        jTextRanking.setToolTipText("");
        jTextRanking.setBorder(null);
        jPanelRanking.add(jTextRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 590, 500));

        jPanel.add(jPanelRanking, "card2");

        jPanelConfig.setBackground(new java.awt.Color(47, 94, 42));
        jPanelConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelConfig.setPreferredSize(new java.awt.Dimension(720, 720));
        jPanelConfig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltarConfig.setBackground(new java.awt.Color(255, 216, 0));
        jButtonVoltarConfig.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonVoltarConfig.setForeground(new java.awt.Color(47, 94, 42));
        jButtonVoltarConfig.setText("Voltar");
        jButtonVoltarConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarConfigActionPerformed(evt);
            }
        });
        jPanelConfig.add(jButtonVoltarConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 600, 210, -1));

        jLabelConfig.setBackground(new java.awt.Color(255, 255, 255));
        jLabelConfig.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jLabelConfig.setForeground(new java.awt.Color(255, 216, 0));
        jLabelConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConfig.setText("Configurações");
        jLabelConfig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelConfig.add(jLabelConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 10, 290, -1));

        jButtonPerfil.setBackground(new java.awt.Color(255, 216, 0));
        jButtonPerfil.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonPerfil.setForeground(new java.awt.Color(47, 94, 42));
        jButtonPerfil.setText("Perfil");
        jButtonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerfilActionPerformed(evt);
            }
        });
        jPanelConfig.add(jButtonPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 200, 210, -1));

        jPanel.add(jPanelConfig, "card2");

        jPanelPerfil.setBackground(new java.awt.Color(47, 94, 42));
        jPanelPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelPerfil.setPreferredSize(new java.awt.Dimension(720, 720));
        jPanelPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltarPerfil.setBackground(new java.awt.Color(255, 216, 0));
        jButtonVoltarPerfil.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonVoltarPerfil.setForeground(new java.awt.Color(47, 94, 42));
        jButtonVoltarPerfil.setText("Voltar");
        jButtonVoltarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarPerfilActionPerformed(evt);
            }
        });
        jPanelPerfil.add(jButtonVoltarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 200, -1));

        jLabelConfig1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelConfig1.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jLabelConfig1.setForeground(new java.awt.Color(255, 216, 0));
        jLabelConfig1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConfig1.setText("Configurações de Perfil");
        jLabelConfig1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelPerfil.add(jLabelConfig1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 480, -1));

        jButtonSalvar.setBackground(new java.awt.Color(255, 216, 0));
        jButtonSalvar.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(47, 94, 42));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelPerfil.add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, 200, -1));

        jLabelIdJogadorPerfil.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jLabelIdJogadorPerfil.setForeground(new java.awt.Color(255, 216, 0));
        jLabelIdJogadorPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIdJogadorPerfil.setText("IdJogador");
        jPanelPerfil.add(jLabelIdJogadorPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 300, 30));

        jTextFieldApelidoPerfil.setBackground(new java.awt.Color(255, 216, 0));
        jTextFieldApelidoPerfil.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextFieldApelidoPerfil.setForeground(new java.awt.Color(47, 94, 42));
        jTextFieldApelidoPerfil.setSelectionColor(new java.awt.Color(149, 187, 68));
        jTextFieldApelidoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApelidoPerfilActionPerformed(evt);
            }
        });
        jPanelPerfil.add(jTextFieldApelidoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 280, 330, -1));

        jLabelApelidoPerfil.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelApelidoPerfil.setForeground(new java.awt.Color(255, 216, 0));
        jLabelApelidoPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelApelidoPerfil.setText("Apelido");
        jPanelPerfil.add(jLabelApelidoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 300, 50));

        jPanel.add(jPanelPerfil, "card2");

        jPanelMenuAdmin.setBackground(new java.awt.Color(47, 94, 42));
        jPanelMenuAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelMenuAdmin.setPreferredSize(new java.awt.Dimension(720, 720));
        jPanelMenuAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAdministrador.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jLabelAdministrador.setForeground(new java.awt.Color(255, 216, 0));
        jLabelAdministrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAdministrador.setText("Administrador");
        jLabelAdministrador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelMenuAdmin.add(jLabelAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 10, 310, -1));

        jButtonSairMenu1.setBackground(new java.awt.Color(255, 216, 0));
        jButtonSairMenu1.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonSairMenu1.setForeground(new java.awt.Color(47, 94, 42));
        jButtonSairMenu1.setText("Sair");
        jButtonSairMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSairMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairMenu1ActionPerformed(evt);
            }
        });
        jPanelMenuAdmin.add(jButtonSairMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 266, -1));

        jLabelFoto1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelFoto1.setForeground(new java.awt.Color(255, 216, 0));
        jLabelFoto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin.jpg"))); // NOI18N
        jLabelFoto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 216, 0), 4));
        jPanelMenuAdmin.add(jLabelFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 100, 128, 128));

        jLabelIdAdmin.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelIdAdmin.setForeground(new java.awt.Color(255, 216, 0));
        jLabelIdAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIdAdmin.setText("Admin");
        jPanelMenuAdmin.add(jLabelIdAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 600, -1));

        jPanel.add(jPanelMenuAdmin, "card2");

        jPanelComeco.setBackground(new java.awt.Color(47, 94, 42));
        jPanelComeco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelComeco.setPreferredSize(new java.awt.Dimension(720, 720));
        jPanelComeco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBoaSorte.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBoaSorte.setFont(new java.awt.Font("JungleFever", 0, 48)); // NOI18N
        jLabelBoaSorte.setForeground(new java.awt.Color(255, 216, 0));
        jLabelBoaSorte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBoaSorte.setText("Boa sorte!");
        jPanelComeco.add(jLabelBoaSorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 300, -1));

        jTextAreaComeco.setEditable(false);
        jTextAreaComeco.setBackground(new java.awt.Color(47, 94, 42));
        jTextAreaComeco.setColumns(20);
        jTextAreaComeco.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextAreaComeco.setForeground(new java.awt.Color(255, 216, 0));
        jTextAreaComeco.setLineWrap(true);
        jTextAreaComeco.setRows(5);
        jTextAreaComeco.setText("      Dê o seu melhor respondendo a              perguntas sobre lógica de                       programação e python!");
        jTextAreaComeco.setToolTipText("");
        jTextAreaComeco.setWrapStyleWord(true);
        jTextAreaComeco.setBorder(null);
        jTextAreaComeco.setSelectionColor(new java.awt.Color(149, 187, 68));
        jPanelComeco.add(jTextAreaComeco, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 420, 140));

        jButtonComecarQuiz.setBackground(new java.awt.Color(255, 216, 0));
        jButtonComecarQuiz.setFont(new java.awt.Font("JungleFever", 0, 42)); // NOI18N
        jButtonComecarQuiz.setForeground(new java.awt.Color(47, 94, 42));
        jButtonComecarQuiz.setText("Começar!");
        jButtonComecarQuiz.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonComecarQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComecarQuizActionPerformed(evt);
            }
        });
        jPanelComeco.add(jButtonComecarQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 430, 250, -1));

        jButtonVoltarComeco.setBackground(new java.awt.Color(255, 216, 0));
        jButtonVoltarComeco.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonVoltarComeco.setForeground(new java.awt.Color(47, 94, 42));
        jButtonVoltarComeco.setText("Voltar");
        jButtonVoltarComeco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarComecoActionPerformed(evt);
            }
        });
        jPanelComeco.add(jButtonVoltarComeco, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 600, 210, -1));

        jPanel.add(jPanelComeco, "card2");

        jPanelQuestao.setBackground(new java.awt.Color(47, 94, 42));
        jPanelQuestao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelQuestao.setPreferredSize(new java.awt.Dimension(720, 720));
        jPanelQuestao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextAreaEnunciado.setEditable(false);
        jTextAreaEnunciado.setBackground(new java.awt.Color(47, 94, 42));
        jTextAreaEnunciado.setColumns(20);
        jTextAreaEnunciado.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextAreaEnunciado.setForeground(new java.awt.Color(255, 216, 0));
        jTextAreaEnunciado.setLineWrap(true);
        jTextAreaEnunciado.setRows(5);
        jTextAreaEnunciado.setText("Enunciado");
        jTextAreaEnunciado.setToolTipText("");
        jTextAreaEnunciado.setWrapStyleWord(true);
        jTextAreaEnunciado.setBorder(null);
        jTextAreaEnunciado.setSelectionColor(new java.awt.Color(149, 187, 68));
        jPanelQuestao.add(jTextAreaEnunciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 600, 110));

        buttonGroupAlternativas.add(jRadioButtonA);
        jRadioButtonA.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jRadioButtonA.setForeground(new java.awt.Color(255, 216, 0));
        jRadioButtonA.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanelQuestao.add(jRadioButtonA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 20, 20));

        jTextAreaAltA.setEditable(false);
        jTextAreaAltA.setBackground(new java.awt.Color(47, 94, 42));
        jTextAreaAltA.setColumns(20);
        jTextAreaAltA.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextAreaAltA.setForeground(new java.awt.Color(255, 216, 0));
        jTextAreaAltA.setLineWrap(true);
        jTextAreaAltA.setRows(5);
        jTextAreaAltA.setText("Alternativa");
        jTextAreaAltA.setToolTipText("");
        jTextAreaAltA.setWrapStyleWord(true);
        jTextAreaAltA.setBorder(null);
        jTextAreaAltA.setSelectionColor(new java.awt.Color(149, 187, 68));
        jPanelQuestao.add(jTextAreaAltA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 600, 110));

        buttonGroupAlternativas.add(jRadioButtonB);
        jRadioButtonB.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jRadioButtonB.setForeground(new java.awt.Color(255, 216, 0));
        jRadioButtonB.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanelQuestao.add(jRadioButtonB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 20, 20));

        jTextAreaAltB.setEditable(false);
        jTextAreaAltB.setBackground(new java.awt.Color(47, 94, 42));
        jTextAreaAltB.setColumns(20);
        jTextAreaAltB.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextAreaAltB.setForeground(new java.awt.Color(255, 216, 0));
        jTextAreaAltB.setLineWrap(true);
        jTextAreaAltB.setRows(5);
        jTextAreaAltB.setText("Alternativa");
        jTextAreaAltB.setToolTipText("");
        jTextAreaAltB.setWrapStyleWord(true);
        jTextAreaAltB.setBorder(null);
        jTextAreaAltB.setSelectionColor(new java.awt.Color(149, 187, 68));
        jPanelQuestao.add(jTextAreaAltB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 600, 110));

        buttonGroupAlternativas.add(jRadioButtonC);
        jRadioButtonC.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jRadioButtonC.setForeground(new java.awt.Color(255, 216, 0));
        jRadioButtonC.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanelQuestao.add(jRadioButtonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 20, 20));

        jTextAreaAltC.setEditable(false);
        jTextAreaAltC.setBackground(new java.awt.Color(47, 94, 42));
        jTextAreaAltC.setColumns(20);
        jTextAreaAltC.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextAreaAltC.setForeground(new java.awt.Color(255, 216, 0));
        jTextAreaAltC.setLineWrap(true);
        jTextAreaAltC.setRows(5);
        jTextAreaAltC.setText("Alternativa");
        jTextAreaAltC.setToolTipText("");
        jTextAreaAltC.setWrapStyleWord(true);
        jTextAreaAltC.setBorder(null);
        jTextAreaAltC.setSelectionColor(new java.awt.Color(149, 187, 68));
        jPanelQuestao.add(jTextAreaAltC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 600, 110));

        buttonGroupAlternativas.add(jRadioButtonD);
        jRadioButtonD.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jRadioButtonD.setForeground(new java.awt.Color(255, 216, 0));
        jRadioButtonD.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanelQuestao.add(jRadioButtonD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 20, 20));

        jTextAreaAltD.setEditable(false);
        jTextAreaAltD.setBackground(new java.awt.Color(47, 94, 42));
        jTextAreaAltD.setColumns(20);
        jTextAreaAltD.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextAreaAltD.setForeground(new java.awt.Color(255, 216, 0));
        jTextAreaAltD.setLineWrap(true);
        jTextAreaAltD.setRows(5);
        jTextAreaAltD.setText("Alternativa");
        jTextAreaAltD.setToolTipText("");
        jTextAreaAltD.setWrapStyleWord(true);
        jTextAreaAltD.setBorder(null);
        jTextAreaAltD.setSelectionColor(new java.awt.Color(149, 187, 68));
        jPanelQuestao.add(jTextAreaAltD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 600, 110));

        jLabelNivel.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNivel.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelNivel.setForeground(new java.awt.Color(255, 216, 0));
        jLabelNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNivel.setText("Nível Fácil");
        jLabelNivel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelQuestao.add(jLabelNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 400, -1));

        jButtonProxima.setBackground(new java.awt.Color(255, 216, 0));
        jButtonProxima.setFont(new java.awt.Font("JungleFever", 0, 36)); // NOI18N
        jButtonProxima.setForeground(new java.awt.Color(47, 94, 42));
        jButtonProxima.setText("Próxima");
        jButtonProxima.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonProxima.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButtonProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximaActionPerformed(evt);
            }
        });
        jPanelQuestao.add(jButtonProxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 630, 210, 50));

        jPanel.add(jPanelQuestao, "card2");

        jPanelFimDeJogo.setBackground(new java.awt.Color(47, 94, 42));
        jPanelFimDeJogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelFimDeJogo.setPreferredSize(new java.awt.Dimension(720, 720));
        jPanelFimDeJogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFimDeJogo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFimDeJogo.setFont(new java.awt.Font("JungleFever", 0, 48)); // NOI18N
        jLabelFimDeJogo.setForeground(new java.awt.Color(255, 216, 0));
        jLabelFimDeJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFimDeJogo.setText("Fim de Jogo!");
        jPanelFimDeJogo.add(jLabelFimDeJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 600, -1));

        jLabelFimDeJogo2.setFont(new java.awt.Font("Comic Sans MS", 0, 30)); // NOI18N
        jLabelFimDeJogo2.setForeground(new java.awt.Color(255, 216, 0));
        jLabelFimDeJogo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFimDeJogo2.setText("Você perdeu todas as suas vidas.");
        jPanelFimDeJogo.add(jLabelFimDeJogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 460, -1));

        jLabelPontuacaoFimDeJogo.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelPontuacaoFimDeJogo.setForeground(new java.awt.Color(255, 216, 0));
        jLabelPontuacaoFimDeJogo.setText("Pontuação:");
        jPanelFimDeJogo.add(jLabelPontuacaoFimDeJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jTextAreaPontuacaoFimDeJogo.setEditable(false);
        jTextAreaPontuacaoFimDeJogo.setBackground(new java.awt.Color(47, 94, 42));
        jTextAreaPontuacaoFimDeJogo.setColumns(20);
        jTextAreaPontuacaoFimDeJogo.setFont(new java.awt.Font("Comic Sans MS", 0, 30)); // NOI18N
        jTextAreaPontuacaoFimDeJogo.setForeground(new java.awt.Color(255, 216, 0));
        jTextAreaPontuacaoFimDeJogo.setLineWrap(true);
        jTextAreaPontuacaoFimDeJogo.setRows(5);
        jTextAreaPontuacaoFimDeJogo.setText("Pontos");
        jTextAreaPontuacaoFimDeJogo.setToolTipText("");
        jTextAreaPontuacaoFimDeJogo.setWrapStyleWord(true);
        jTextAreaPontuacaoFimDeJogo.setBorder(null);
        jTextAreaPontuacaoFimDeJogo.setSelectionColor(new java.awt.Color(149, 187, 68));
        jPanelFimDeJogo.add(jTextAreaPontuacaoFimDeJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 300, 40));

        jLabelPatenteFimDeJogo.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelPatenteFimDeJogo.setForeground(new java.awt.Color(255, 216, 0));
        jLabelPatenteFimDeJogo.setText("Patente:");
        jPanelFimDeJogo.add(jLabelPatenteFimDeJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        jTextAreaPatenteFimDeJogo.setEditable(false);
        jTextAreaPatenteFimDeJogo.setBackground(new java.awt.Color(47, 94, 42));
        jTextAreaPatenteFimDeJogo.setColumns(20);
        jTextAreaPatenteFimDeJogo.setFont(new java.awt.Font("Comic Sans MS", 0, 30)); // NOI18N
        jTextAreaPatenteFimDeJogo.setForeground(new java.awt.Color(255, 216, 0));
        jTextAreaPatenteFimDeJogo.setLineWrap(true);
        jTextAreaPatenteFimDeJogo.setRows(5);
        jTextAreaPatenteFimDeJogo.setText("Patente\natente\n");
        jTextAreaPatenteFimDeJogo.setToolTipText("");
        jTextAreaPatenteFimDeJogo.setWrapStyleWord(true);
        jTextAreaPatenteFimDeJogo.setBorder(null);
        jTextAreaPatenteFimDeJogo.setSelectionColor(new java.awt.Color(149, 187, 68));
        jPanelFimDeJogo.add(jTextAreaPatenteFimDeJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 430, 40));

        jButtonMenuFimDeJogo.setBackground(new java.awt.Color(255, 216, 0));
        jButtonMenuFimDeJogo.setFont(new java.awt.Font("JungleFever", 0, 42)); // NOI18N
        jButtonMenuFimDeJogo.setForeground(new java.awt.Color(47, 94, 42));
        jButtonMenuFimDeJogo.setText("Menu");
        jButtonMenuFimDeJogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonMenuFimDeJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuFimDeJogoActionPerformed(evt);
            }
        });
        jPanelFimDeJogo.add(jButtonMenuFimDeJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 250, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Macaco Triste.gif"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 216, 0), 4));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelFimDeJogo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 195, 208, 208));

        jPanel.add(jPanelFimDeJogo, "card2");

        jPanelParabens.setBackground(new java.awt.Color(47, 94, 42));
        jPanelParabens.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelParabens.setPreferredSize(new java.awt.Dimension(720, 720));
        jPanelParabens.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelParabens.setBackground(new java.awt.Color(255, 255, 255));
        jLabelParabens.setFont(new java.awt.Font("JungleFever", 0, 48)); // NOI18N
        jLabelParabens.setForeground(new java.awt.Color(255, 216, 0));
        jLabelParabens.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelParabens.setText("Parabéns!");
        jPanelParabens.add(jLabelParabens, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 600, -1));

        jLabelParabens2.setFont(new java.awt.Font("Comic Sans MS", 0, 30)); // NOI18N
        jLabelParabens2.setForeground(new java.awt.Color(255, 216, 0));
        jLabelParabens2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelParabens2.setText("Você concluiu o quiz!");
        jPanelParabens.add(jLabelParabens2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 460, -1));

        jLabelPontuacaoParabens.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelPontuacaoParabens.setForeground(new java.awt.Color(255, 216, 0));
        jLabelPontuacaoParabens.setText("Pontuação:");
        jPanelParabens.add(jLabelPontuacaoParabens, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jTextAreaPontuacaoParabens.setEditable(false);
        jTextAreaPontuacaoParabens.setBackground(new java.awt.Color(47, 94, 42));
        jTextAreaPontuacaoParabens.setColumns(20);
        jTextAreaPontuacaoParabens.setFont(new java.awt.Font("Comic Sans MS", 0, 30)); // NOI18N
        jTextAreaPontuacaoParabens.setForeground(new java.awt.Color(255, 216, 0));
        jTextAreaPontuacaoParabens.setLineWrap(true);
        jTextAreaPontuacaoParabens.setRows(5);
        jTextAreaPontuacaoParabens.setText("Pontos");
        jTextAreaPontuacaoParabens.setToolTipText("");
        jTextAreaPontuacaoParabens.setWrapStyleWord(true);
        jTextAreaPontuacaoParabens.setBorder(null);
        jTextAreaPontuacaoParabens.setSelectionColor(new java.awt.Color(149, 187, 68));
        jPanelParabens.add(jTextAreaPontuacaoParabens, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 300, 40));

        jLabelPatenteParabens.setFont(new java.awt.Font("JungleFever", 0, 30)); // NOI18N
        jLabelPatenteParabens.setForeground(new java.awt.Color(255, 216, 0));
        jLabelPatenteParabens.setText("Patente:");
        jPanelParabens.add(jLabelPatenteParabens, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        jTextAreaPatenteParabens.setEditable(false);
        jTextAreaPatenteParabens.setBackground(new java.awt.Color(47, 94, 42));
        jTextAreaPatenteParabens.setColumns(20);
        jTextAreaPatenteParabens.setFont(new java.awt.Font("Comic Sans MS", 0, 30)); // NOI18N
        jTextAreaPatenteParabens.setForeground(new java.awt.Color(255, 216, 0));
        jTextAreaPatenteParabens.setLineWrap(true);
        jTextAreaPatenteParabens.setRows(5);
        jTextAreaPatenteParabens.setText("Patente\natente\n");
        jTextAreaPatenteParabens.setToolTipText("");
        jTextAreaPatenteParabens.setWrapStyleWord(true);
        jTextAreaPatenteParabens.setBorder(null);
        jTextAreaPatenteParabens.setSelectionColor(new java.awt.Color(149, 187, 68));
        jPanelParabens.add(jTextAreaPatenteParabens, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 430, 40));

        jButtonMenuParabens.setBackground(new java.awt.Color(255, 216, 0));
        jButtonMenuParabens.setFont(new java.awt.Font("JungleFever", 0, 42)); // NOI18N
        jButtonMenuParabens.setForeground(new java.awt.Color(47, 94, 42));
        jButtonMenuParabens.setText("Menu");
        jButtonMenuParabens.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonMenuParabens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuParabensActionPerformed(evt);
            }
        });
        jPanelParabens.add(jButtonMenuParabens, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 250, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Macaco Aplaudindo.gif"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 216, 0), 4));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelParabens.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 195, 208, 208));

        jPanel.add(jPanelParabens, "card2");

        getContentPane().add(jPanel);
        jPanel.setBounds(600, 200, 720, 720);

        jLabelMacaco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMacaco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gif macaco.gif"))); // NOI18N
        jLabelMacaco.setText("jLabel2");
        getContentPane().add(jLabelMacaco);
        jLabelMacaco.setBounds(200, 650, 220, 280);

        jLabelMacaco2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMacaco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gif macaco.gif"))); // NOI18N
        jLabelMacaco2.setText("jLabel2");
        getContentPane().add(jLabelMacaco2);
        jLabelMacaco2.setBounds(1500, 650, 220, 280);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundEscuro.jpg"))); // NOI18N
        jLabelBackground.setText("jLabel1");
        jLabelBackground.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabelBackground.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabelBackground.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Métodos
    
    private void setFoto(Jogador jogador) {
        //determina a foto mostrada no menu do jogo de acordo com a patente do jogador
        switch (jogador.getPatente()) {
            case "Macakid": {
                jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Macakid.gif")));
                break;
            }
            case "Amador": {
                jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Amador.gif")));
                break;
            }
            case "Bodybuilder": {
                jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bodybuilder.gif")));
                break;
            }
            case "Macaco Louco": {
                jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Macaco Louco.gif")));
                break;
            }
            case "King Kong": {
                jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/King Kong.gif")));
                break;
            }
        }
    }
    
    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        //pega o id do jogador
        String id = jTextFieldUsuario.getText();
        //pega a senha do jogador como char[] e converte para String
        String senha = new String(jPasswordFieldSenha.getPassword());
        try {
            //verifica se o usuário é válido
            jogador.setIdJogador(id);
            jogador.setSenha(senha);
            DAO dao = new DAO();
            if (dao.existeJogador(jogador)) {
                JOptionPane.showMessageDialog(null, "Bem-vindo(a), " + jogador.getIdJogador() + "!");
                //fecha o painel de login e abre o de introdução
                jPanelLogin.setVisible(false);
                jPanelIntroducao.setVisible(true);
                //pega o apelido e a pontuação do jogador no banco de dados
                jogador.setApelido(jogador.getApelidoBD());
                jogador.setPontuacaoMaxima(jogador.getPontuacaoBD()); //o método setPontuacaoMaxima já determina a patente dependendo da pontuação do jogador
                //define as informações do jogador no menu
                jLabelApelidoMenu.setText(jogador.getApelido());
                jLabelIdJogador.setText(jogador.getIdJogador());
                jLabelPontuacaoMenu2.setText(Integer.toString(jogador.getPontuacaoMaxima()));
                jLabelPatenteMenu2.setText(jogador.getPatente());
                setFoto(jogador);
            }
            else {
                administrador.setSenha(senha);
                administrador.setIdAdmin(id);
                if (dao.existeAdministrador(administrador)) {
                    JOptionPane.showMessageDialog(null, "Bem-vindo(a), " + administrador.getIdAdmin() + "!");
                    //define as informações do administrador no menu admin
                    jLabelIdAdmin.setText(id);
                    //fecha o painel de login e abre o de menu admin
                    jPanelLogin.setVisible(false);
                    jPanelMenuAdmin.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "ID e/ou senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas técnicos. Tente novamente mais tarde.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jButtonCadastrarSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarSeActionPerformed
        //fecha o painel de login e abre o de cadastro
        jPanelLogin.setVisible(false);
        jPanelCadastro.setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarSeActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        //pega o id do jogador
        String idJogador = jTextFieldJogador.getText();
        //pega o apelido do jogador
        String apelido = "";
        apelido = jTextFieldApelido.getText();
        if (apelido.equals("")) {
            apelido = idJogador;
        }
        //pega a senha do usuário como char[] e converte para String
        String senha = new String(jPasswordFieldSenhaCadastro.getPassword());
        try {
            //verifica se o usuário é válido
            Jogador jogadorCadastro = new Jogador(idJogador, apelido, senha);
            DAO dao = new DAO();
            if (idJogador.length() > 3 && senha.length() > 3) {
                if (dao.existeJogador(jogadorCadastro)) {
                    JOptionPane.showMessageDialog(null, "O ID " + jogadorCadastro.getIdJogador() + " já existe!", "Erro", JOptionPane.WARNING_MESSAGE);
                }
                else {
                    jogadorCadastro.inserir();
                    JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso!");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "O ID e a senha devem ter, no mínimo, quatro caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas técnicos. Tente novamente mais tarde.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJogadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJogadorActionPerformed

    private void jTextFieldApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApelidoActionPerformed

    private void jPasswordFieldSenhaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaCadastroActionPerformed

    private void jButtonConecteSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConecteSeActionPerformed
        //fecha o painel de cadastro e abre o de login
        jPanelCadastro.setVisible(false);
        jPanelLogin.setVisible(true);
    }//GEN-LAST:event_jButtonConecteSeActionPerformed

    private void jButtonSairCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairCadastroActionPerformed
        //fecha o JFrame
        this.dispose();
    }//GEN-LAST:event_jButtonSairCadastroActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        //fecha o painel de introducao e abre o de login
        jPanelIntroducao.setVisible(false);
        jPanelLogin.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        //fecha o painel de introducao e abre o de menu
        jPanelIntroducao.setVisible(false);
        jPanelMenu.setVisible(true);
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRankingActionPerformed
        //carrega as posições no painel de ranking
        jTextRanking.setText(jogador.listarRanking());
        //fecha o painel de menu e abre o de ranking
        jPanelMenu.setVisible(false);
        jPanelRanking.setVisible(true);
    }//GEN-LAST:event_jButtonRankingActionPerformed

    private void jButtonIniciarQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarQuizActionPerformed
        //esconde os macacos dançantes para que o jogador não se distraia ao longo do quiz
        jLabelMacaco.setVisible(false);
        jLabelMacaco2.setVisible(false);
        //fecha o painel de menu e abre o de questões
        jPanelMenu.setVisible(false);
        jPanelComeco.setVisible(true);
    }//GEN-LAST:event_jButtonIniciarQuizActionPerformed

    private void jButtonSairMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairMenuActionPerformed
        //fecha o JFrame
        this.dispose();
    }//GEN-LAST:event_jButtonSairMenuActionPerformed

    private void jButtonConfigurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfigurarActionPerformed
        //fecha o painel de menu e abre o de configurações
        jPanelMenu.setVisible(false);
        jPanelConfig.setVisible(true);
    }//GEN-LAST:event_jButtonConfigurarActionPerformed

    private void jButtonVoltarRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarRankingActionPerformed
        //fecha o painel de ranking e abre o de menu
        jPanelRanking.setVisible(false);
        jPanelMenu.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarRankingActionPerformed

    private void jButtonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerfilActionPerformed
        //carrega o as informações do jogador no perfil
        jLabelIdJogadorPerfil.setText(jogador.getIdJogador());
        try {
            jTextFieldApelidoPerfil.setText(jogador.getApelidoBD());
        } catch (Exception ex) {
            Logger.getLogger(Macaquiz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //fecha o painel de configurações e abre o de perfil
        jPanelConfig.setVisible(false);
        jPanelPerfil.setVisible(true);
    }//GEN-LAST:event_jButtonPerfilActionPerformed

    private void jButtonVoltarConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarConfigActionPerformed
        //fecha o painel de configurações e abre o de menu
        jPanelConfig.setVisible(false);
        jPanelMenu.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarConfigActionPerformed

    private void jButtonVoltarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarPerfilActionPerformed
        //fecha o painel de perfil e abre o de configurações
        jPanelPerfil.setVisible(false);
        jPanelConfig.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarPerfilActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        //salva as informações no banco de dados
        jogador.setApelido(jTextFieldApelidoPerfil.getText());
        jogador.atualizar();
        //altera o apelido no menu
        jLabelApelidoMenu.setText(jogador.getApelido());
        //mensagem feedback
        JOptionPane.showMessageDialog(null, "Apelido alterado com sucesso.", "Alterações salvas", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldApelidoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApelidoPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApelidoPerfilActionPerformed

    private void jButtonSairMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairMenu1ActionPerformed
        //fecha o JFrame
        this.dispose();
    }//GEN-LAST:event_jButtonSairMenu1ActionPerformed

    private void jButtonComecarQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComecarQuizActionPerformed
        //gera a primeira questão e preenche a tela com seus atributos
        nQuestao = 1;
        try {
            questao.gerarQuestao(nQuestao);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas técnicos. Tente novamente mais tarde.");
            e.printStackTrace();
        }
        jTextAreaEnunciado.setText(questao.getEnunciado());
        jTextAreaAltA.setText(questao.getAltA());
        jTextAreaAltB.setText(questao.getAltB());
        jTextAreaAltC.setText(questao.getAltC());
        jTextAreaAltD.setText(questao.getAltD());
        respostaCorreta = questao.getCharCorreta();
        //atribui o valor inicial às variáveis pontuacao, vidas e sequencia
        pontuacao = 0;
        vidas = 3;
        //fecha o painel de nível fácil e abre o de questão fácil
        jPanelComeco.setVisible(false);
        jPanelQuestao.setVisible(true);
    }//GEN-LAST:event_jButtonComecarQuizActionPerformed

    private void jButtonVoltarComecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarComecoActionPerformed
        //faz com que os macacos dançantes reapareçam
        jLabelMacaco.setVisible(true);
        jLabelMacaco2.setVisible(true);
        //fecha o painel do nível fácil e abre o de menu
        jPanelComeco.setVisible(false);
        jPanelMenu.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarComecoActionPerformed

    private void jButtonMenuFimDeJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuFimDeJogoActionPerformed
        //Atualiza as informações do jogador no menu
        
        //Abre o painel de menu
        jPanelFimDeJogo.setVisible(false);
        jPanelMenu.setVisible(true);
    }//GEN-LAST:event_jButtonMenuFimDeJogoActionPerformed

    private void jButtonProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximaActionPerformed
        //determina se a resposta é correta ou não
        if (jRadioButtonA.isSelected()) {
            resposta = 'A';
        }
        if (jRadioButtonB.isSelected()) {
            resposta = 'B';
        }
        if (jRadioButtonC.isSelected()) {
            resposta = 'C';
        }
        if (jRadioButtonD.isSelected()) {
            resposta = 'D';
        }
        //o jogador ganha 2, 3, ou 4 pontos (dependendo da dificuldade) se a resposta selecionada dor correta
        if (resposta == respostaCorreta) {
            if (nQuestao <= 5) {
                pontuacao = pontuacao + 2;
            }
            else if (nQuestao <= 10) {
                pontuacao = pontuacao + 3;
            }
            else {
                pontuacao = pontuacao + 4;
            }
            //mostra mensagem de resposta correta com pontuação e vida
            JOptionPane.showMessageDialog(null, String.format("\n\nPontuação: %d\nVidas: %d", pontuacao, vidas), "Alternativa correta!", JOptionPane.PLAIN_MESSAGE);
            //se o jogador respondeu todas as questões: atualiza o BD se a pontuacao obtida no quiz é maior do que a registrada no BD
            if (nQuestao == 15) {
                try {
                    if (pontuacao > jogador.getPontuacaoBD()) {
                        jogador.setPontuacaoMaxima(pontuacao); //automaticamente atualiza a patente
                        jogador.atualizar();
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Problemas técnicos. Tente novamente mais tarde.");
                    e.printStackTrace();
                }
                //carrega os dados do jogador no painel de parabéns
                jTextAreaPontuacaoParabens.setText(Integer.toString(jogador.getPontuacaoMaxima()));
                jTextAreaPatenteParabens.setText(jogador.getPatente());
                jPanelParabens.setVisible(true);
                jPanelQuestao.setVisible(false);
                //carrega os macacos dançantes
                jLabelMacaco.setVisible(true);
                jLabelMacaco2.setVisible(true);
            }
            else {
                //aumenta o número da questão
                nQuestao = nQuestao + 1;
                //gera a questão
                try {
                    questao.gerarQuestao(nQuestao);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Problemas técnicos. Tente novamente mais tarde.");
                    e.printStackTrace();
                }
                //insere os dados da questão no painel de questão
                jTextAreaEnunciado.setText(questao.getEnunciado());
                jTextAreaAltA.setText(questao.getAltA());
                jTextAreaAltB.setText(questao.getAltB());
                jTextAreaAltC.setText(questao.getAltC());
                jTextAreaAltD.setText(questao.getAltD());
                //altera o título do nível caso o jogador tenha chegado a uma questão de nível mais difícil
                if (nQuestao == 6) {
                    jLabelNivel.setText("Nível Médio");
                }
                if (nQuestao == 11) {
                    jLabelNivel.setText("Nível Difícil");
                }
                respostaCorreta = questao.getCharCorreta();
            }
        }
        //o jogador perde uma vida se a alternativa for incorreta
        else {
            vidas = vidas - 1;
            //mostra mensagem de resposta incorreta com pontuação e vida
            JOptionPane.showMessageDialog(null, String.format("Resposta: %s\n\nPontuação: %d\nVidas: %d", questao.getCorreta(), pontuacao, vidas), "Alternativa incorreta!", JOptionPane.ERROR_MESSAGE);
            //abre o painel de fim de jogo com pontuação e patente se o jogador perdeu todas as vidas
            if (vidas == 0) {
                try {
                    if (pontuacao > jogador.getPontuacaoBD()) {
                        jogador.setPontuacaoMaxima(pontuacao); //automaticamente atualiza a patente
                        jogador.atualizar();
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Problemas técnicos. Tente novamente mais tarde.");
                    e.printStackTrace();
                }
                //carrega os dados do jogador no painel de fim de jogo
                jTextAreaPontuacaoFimDeJogo.setText(Integer.toString(jogador.getPontuacaoMaxima()));
                jTextAreaPatenteFimDeJogo.setText(jogador.getPatente());
                jPanelFimDeJogo.setVisible(true);
                jPanelQuestao.setVisible(false);
                //carrega os macacos dançantes
                jLabelMacaco.setVisible(true);
                jLabelMacaco2.setVisible(true);
            }
            else {
                //aumenta o número da questão
                nQuestao = nQuestao + 1;
                //gera a questão
                try {
                    questao.gerarQuestao(nQuestao);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Problemas técnicos. Tente novamente mais tarde.");
                    e.printStackTrace();
                }
                
                jTextAreaEnunciado.setText(questao.getEnunciado());
                jTextAreaAltA.setText(questao.getAltA());
                jTextAreaAltB.setText(questao.getAltB());
                jTextAreaAltC.setText(questao.getAltC());
                jTextAreaAltD.setText(questao.getAltD());
                //altera o título do nível caso o jogador tenha chegado a uma questão de nível mais difícil
                if (nQuestao == 6) {
                    jLabelNivel.setText("Nível Médio");
                }
                if (nQuestao == 11) {
                    jLabelNivel.setText("Nível Difícil");
                }
                respostaCorreta = questao.getCharCorreta();
            }
        }
        
    }//GEN-LAST:event_jButtonProximaActionPerformed

    private void jButtonMenuParabensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuParabensActionPerformed
        //Atualiza as informações do jogador no menu
        jLabelPatenteMenu2.setText(jogador.getPatente());
        jLabelPontuacaoMenu.setText(Integer.toString(jogador.getPontuacaoMaxima()));
        //Abre o painel de menu
        jPanelFimDeJogo.setVisible(false);
        jPanelMenu.setVisible(true);
    }//GEN-LAST:event_jButtonMenuParabensActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Macaquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Macaquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Macaquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Macaquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Macaquiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupAlternativas;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCadastrarSe;
    private javax.swing.JButton jButtonComecarQuiz;
    private javax.swing.JButton jButtonConecteSe;
    private javax.swing.JButton jButtonConfigurar;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonIniciarQuiz;
    private javax.swing.JButton jButtonMenuFimDeJogo;
    private javax.swing.JButton jButtonMenuParabens;
    private javax.swing.JButton jButtonPerfil;
    private javax.swing.JButton jButtonProxima;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonRanking;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSairCadastro;
    private javax.swing.JButton jButtonSairMenu;
    private javax.swing.JButton jButtonSairMenu1;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JButton jButtonVoltarComeco;
    private javax.swing.JButton jButtonVoltarConfig;
    private javax.swing.JButton jButtonVoltarPerfil;
    private javax.swing.JButton jButtonVoltarRanking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAdministrador;
    private javax.swing.JLabel jLabelApelido;
    private javax.swing.JLabel jLabelApelidoMenu;
    private javax.swing.JLabel jLabelApelidoPerfil;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelBemVindo;
    private javax.swing.JLabel jLabelBemVindoCadastro;
    private javax.swing.JLabel jLabelBemVindoIntroducao;
    private javax.swing.JLabel jLabelBoaSorte;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelConectarSe;
    private javax.swing.JLabel jLabelConfig;
    private javax.swing.JLabel jLabelConfig1;
    private javax.swing.JLabel jLabelFimDeJogo;
    private javax.swing.JLabel jLabelFimDeJogo2;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelFoto1;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIDUsuario;
    private javax.swing.JLabel jLabelIdAdmin;
    private javax.swing.JLabel jLabelIdJogador;
    private javax.swing.JLabel jLabelIdJogadorPerfil;
    private javax.swing.JLabel jLabelJogador;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelMacaco;
    private javax.swing.JLabel jLabelMacaco2;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelNivel;
    private javax.swing.JLabel jLabelParabens;
    private javax.swing.JLabel jLabelParabens2;
    private javax.swing.JLabel jLabelPatenteFimDeJogo;
    private javax.swing.JLabel jLabelPatenteMenu;
    private javax.swing.JLabel jLabelPatenteMenu2;
    private javax.swing.JLabel jLabelPatenteParabens;
    private javax.swing.JLabel jLabelPontuacaoFimDeJogo;
    private javax.swing.JLabel jLabelPontuacaoMenu;
    private javax.swing.JLabel jLabelPontuacaoMenu2;
    private javax.swing.JLabel jLabelPontuacaoParabens;
    private javax.swing.JLabel jLabelRanking;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSenhaCadastro;
    private javax.swing.JLabel jLabelTituloCadastro;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelComeco;
    private javax.swing.JPanel jPanelConfig;
    private javax.swing.JPanel jPanelFimDeJogo;
    private javax.swing.JPanel jPanelIntroducao;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelMenuAdmin;
    private javax.swing.JPanel jPanelParabens;
    private javax.swing.JPanel jPanelPerfil;
    private javax.swing.JPanel jPanelQuestao;
    private javax.swing.JPanel jPanelRanking;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JPasswordField jPasswordFieldSenhaCadastro;
    private javax.swing.JRadioButton jRadioButtonA;
    private javax.swing.JRadioButton jRadioButtonB;
    private javax.swing.JRadioButton jRadioButtonC;
    private javax.swing.JRadioButton jRadioButtonD;
    private javax.swing.JTextArea jTextAreaAltA;
    private javax.swing.JTextArea jTextAreaAltB;
    private javax.swing.JTextArea jTextAreaAltC;
    private javax.swing.JTextArea jTextAreaAltD;
    private javax.swing.JTextArea jTextAreaComeco;
    private javax.swing.JTextArea jTextAreaEnunciado;
    private javax.swing.JTextArea jTextAreaIntroducao;
    private javax.swing.JTextArea jTextAreaPatenteFimDeJogo;
    private javax.swing.JTextArea jTextAreaPatenteParabens;
    private javax.swing.JTextArea jTextAreaPontuacaoFimDeJogo;
    private javax.swing.JTextArea jTextAreaPontuacaoParabens;
    private javax.swing.JTextField jTextFieldApelido;
    private javax.swing.JTextField jTextFieldApelidoPerfil;
    private javax.swing.JTextField jTextFieldJogador;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextArea jTextRanking;
    // End of variables declaration//GEN-END:variables
}
