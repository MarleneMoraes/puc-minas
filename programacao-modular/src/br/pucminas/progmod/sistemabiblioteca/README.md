# Minimundo: Sistema de Gestão de Biblioteca

## Descrição
Imagine uma pequena cidade chamada Livropolis, onde os habitantes são ávidos leitores. No centro da cidade, há uma biblioteca renomada, chamada Bibliopolis. Os cidadãos de Livropolis frequentam regularmente a Bibliopolis para emprestar livros, participar de clubes de leitura e assistir a palestras de autores. A gestão da biblioteca é uma tarefa complexa e, para facilitar o processo, é necessário um sistema robusto que possa lidar com todos os aspectos dessa gestão.

## Requisitos do Sistema
- Livros
  - Cada livro tem informações como título, autor, ISBN, categoria e status (disponível, emprestado ou em manutenção)
  - Livros podem ser reservados se estiverem atualmente emprestados. O próximo na fila de reserva é notificado quando o livro é devolvido.

- Usuários
  - Os cidadãos de Livropolis, quando se cadastram na biblioteca, tornam-se usuários com informações como ID, nome e endereço.
  - Os usuários têm uma lista de livros que atualmente emprestaram, uma lista de histórico de empréstimos e uma lista de reservas.
   
- Funcionários
  - Os funcionários de Bibliopolis, como bibliotecários e administradores, têm informações como ID, nome e cargo.
  - Diferentes funcionários têm diferentes níveis de acesso ao sistema. Por exemplo, um bibliotecário pode gerenciar livros e empréstimos, enquanto um administrador pode gerenciar contas de funcionários.
   
- Endereço
  - Tanto Bibliopolis quanto os cidadãos de Livropolis têm endereços com informações como rua, número, complemento, cidade, estado e CEP.

- Categoria de Livros
  - Livros em Bibliopolis são classificados em várias categorias, como ficção, ciências, artes, etc. Cada categoria tem um nome e uma breve descrição.

- Histórico de Empréstimos:
  - Cada vez que um livro é emprestado ou devolvido, essa transação é registrada. O histórico inclui data de empréstimo, data de devolução e o usuário que fez o empréstimo.

- Penalidades:
  - Se um cidadão não devolver um livro a tempo, ele recebe uma penalidade e fica impedido de emprestar novos livros por um período determinado.

## Interface Gráfica (terminal)
- A interface é dividida em seções para gerenciamento de livros, usuários, histórico e funcionários.
- Existem recursos de busca avançada, permitindo aos funcionários procurar livros ou usuários por vários critérios.

## Instruções
1. Comece modelando cada entidade do minimundo como uma classe em Java.
2. Considere as relações entre as entidades. Por exemplo, um Usuário tem uma lista de Livros emprestados.
3. Implemente a lógica necessária para cada ação descrita no minimundo, como emprestar um livro, reservar um livro ou registrar um novo usuário.
4. Mantenha o foco na coesão e no acoplamento ao projetar suas classes.
5. Use técnicas de encapsulamento para proteger os dados e exponha apenas o necessário através de métodos públicos.

### Avaliação dessa atividade que poderia cobrar, mas que não será cobrado
1. Quão bem o sistema modela o minimundo descrito.
2. Coesão e acoplamento das classes.
3. Implementação correta das relações e associações entre entidades.
4. Uso eficaz dos princípios de programação orientada a objetos.
5. Funcionalidade e robustez da interface gráfica.