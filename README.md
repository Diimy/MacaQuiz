# MacaQuiz
Projeto Integrador Interdisciplinar - Macaquiz: um jogo educativo sobre programação com temática de macaco. Nossa expectativa é de atualizar constantemente o jogo até ficar como o esperado.

Versão alfa 0.0.1 - 10/05/2022
  -> Melhora na movimentação.
  -> Novas animações de movimentação.

Versão alfa 0.0.2 - 12/05/2022
  -> Criação das classes Jogador e Administrador com getters, setters e métodos CRUD que interagem com o banco de dados projetado.
  -> Criação da classe ConnectionFactory, utilizada exclusivamente para gerenciamento da conexão entre programas java e o banco de dados.
  -> Criação do programa TesteBD, utilizado para testar as interações entre as classes e o banco de dados.

Versão alfa 0.0.3 - 22/05/2022
  -> Criação das interfaces e funcionalidades do jogo na classe Interface, através de subclasses e métodos da classe javax.swing.JFrame, com interfaces funcionais para
  login, cadastro, introdução, menu do jogador com foto, menu do administrador (sem funções nessa versão), ranking, configurações e perfil.
  -> Criação da classe DAO (Data Acess Object), com a função de validar a existência de jogadores/administradores no banco de dados, sendo utilizada no login.
