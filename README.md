# MacaQuiz
Projeto Integrador Interdisciplinar - Macaquiz: um jogo educativo sobre programação com temática de macaco. Nossa expectativa é de atualizar constantemente o jogo até ficar como o esperado.

Foram criados os projetos macaquiz e macacada, sendo que macaquiz contém o quiz em si e macacada contém um jogo com personagem e movimentação que tentaremos implementar no macaquiz.

Macacada - Histórico de updates:

  Macacada versão alfa 0.0.1 - 10/05/2022
  Melhora na movimentação.
  Novas animações de movimentação.

  Macacada versão alfa 0.0.2 - 24/05/2022
  Mudança na tela de fundo do jogo e mudança no macaco. O macaco agora consegue correr ao segurar o SHIFT e consegue pular com a tecla W. Foi adicionado colisão na janela então o macaco não sai mais da Janela. Foi alterado o design do personagem também, agora existe uma animação para quando está parado e outra quando começa a correr. Cuidado ao apertar a tecla Enter, é uma habilidade que está sendo melhorada ainda.

  Macacada versão alfa 0.0.3 - 25/05/2022
  Agora o Player tem local de nascimento definido também e foram adicionados comentários ao código do jogo para melhor entendimento.

Macaquiz - Histórico de Updates:

  Macaquiz versão alfa 0.0.1 - 12/05/2022
  Criação das classes Jogador e Administrador com getters, setters e métodos CRUD que interagem com o banco de dados projetado.
  Criação da classe ConnectionFactory, utilizada exclusivamente para gerenciamento da conexão entre programas java e o banco de dados.
  Criação do programa TesteBD, utilizado para testar as interações entre as classes e o banco de dados.

  Macaquiz versão alfa 0.0.2 - 22/05/2022
  Criação das interfaces e funcionalidades do jogo na classe Macaquiz, através de subclasses e métodos da classe javax.swing.JFrame, com interfaces funcionais para
    login, cadastro, introdução, menu do jogador com foto, menu do administrador (sem funções nessa versão), ranking, configurações e perfil.
  Criação da classe DAO (Data Acess Object), com a função de validar a existência de jogadores/administradores no banco de dados, sendo utilizada no login.

  Macaquiz versão alfa 0.0.3 - 22/05/2022
  Criação da classe GeradorDeQuestao que contém e gera as questões utilizadas pela classe Macaquiz.
  Criação dos painéis de interface: Nível Fácil, Questão Fácil, Resposta Correta e Resposta Incorreta, incluindo funcionalidades para estes.
  Criação de novas patentes, as quais são determinadas conforme a pontuação máxima atingida pelo jogador e representadas por imagens do tipo gif.

  Macaquiz versão alfa 0.0.4 - 24/05/2022
  Criação da classe Questao, substituindo funções da classe GeradorDeQuestao, a qual não mais existe no projeto.
  Os painéis de interface adicionados na versão 0.0.3 foram excluídos, pois foi decidido criar apenas um painel de interface inicial do quiz e um painel de pergunta que pode mostrar qualquer pergunta.
  Criação dos painéis de interface que aparecem caso o usuário perca todas as vidas e caso este chegue ao final do quiz, com pontuação final e patente.
  Criação da pasta "Banco de dados" que contém o script que deve ser usado para a criação do banco de dados necessário ao funcionamento do jogo.

  Macaquiz versão alfa 0.0.5 - 25/05/2022
  Inserção de todas as 15 questões do jogo no banco de dados, tornando o quiz realmente funcional.
  Criação do painel de interface Alterar Jogador que pode ser acessado por um administrador, possibilitando a alteração da pontuação e da patente de qualquer jogador.
  
  Macaquiz versão alfa 0.0.6 - 29/05/2022
  Criação do painel de Conquistas, que pode ser acessado através do menu e contém uma conquista para cada patente acima da inicial. As conquistas são mostradas de acordo com a patente do jogador.
  
  Macaquiz versão alfa 0.0.7 - 02/02/2022
  A partir desta versão, além da possibilidade de alterar seu apelido, o jogador também pode alterar sua senha por meio do mesmo painel de perfil.
