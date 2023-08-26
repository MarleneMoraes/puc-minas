# Sistema de Controle de Estoque
Imagine que você está desenvolvendo um sistema de controle de estoque para uma loja. O sistema deve permitir o cadastro de produtos, registro de entradas e saídas de produtos, consulta de saldo em estoque e geração de relatórios. Além disso, você precisa lidar com informações sobre fornecedores. A seguir, apresentamos uma descrição do sistema com múltiplas classes, e sua tarefa é identificar as classes, métodos e atributos, e desenvolver um programa modular em Java para implementar esse sistema.

## Descrição do Sistema
O sistema de controle de estoque e fornecedores deve ser capaz de:

|| Classe Produto | 
|--|----------------|
| Atributos | codigo: int |
|| nome: String |
|| descricao: String |
|| precoUnitario: double |
|| quantidadeEmEstoque: int |
| Métodos |
|| getNome(): Retorna o nome do produto |
|| getQuantidadeEmEstoque(): Retorna a quantidade em estoque do produto |
|| registrarEntrada(int quantidade): Registra a entrada de produtos no estoque |
|| registrarSaida(int quantidade): Registra a saída de produtos do estoque |

|| Classe Fornecedor | 
|--|----------------|
| Atributos | codigo: int |
|| nome: String |
|| contato: String |
| Métodos |
|| getNome(): Retorna o nome do fornecedor |
|| getContato(): Retorna as informações de contato do fornecedor |

|| Classe ItemCompra | 
|--|----------------|
| Atributos | produto: Produto |
|| quantidade: int |
|| precoUnitario: double | 
| Métodos |
|| calcularTotal(): Calcula o total do item (quantidade * preço unitário) |

|| Classe Compra | 
|--|----------------|
| Atributos | fornecedor: Fornecedor |
|| itens: List<ItemCompra> |
| Métodos |
|| adicionarItem(Produto produto, int quantidade, double precoUnitario): Adiciona um item à compra |
|| calcularTotal(): Calcula o total da compra somando os totais de todos os itens |
|| gerarRelatorio(): Gera um relatório da compra, incluindo os itens, quantidades e totais |

## Tarefa
Identifique as classes, métodos e atributos necessários para implementar o sistema de controle de estoque e fornecedores, com foco nas classes Produto, Fornecedor, ItemCompra e Compra.

Desenvolva um programa modular em Java que implemente o sistema com base nas classes identificadas. Utilize métodos para realizar as operações descritas.

Teste o programa criando instâncias de produtos, fornecedores, itens de compra e realizando operações de registro, consulta e geração de relatórios.

### Dica
Organize seu código em diferentes arquivos .java para cada classe e utilize estruturas de dados adequadas para armazenar as informações dos produtos, fornecedores e itens de compra. Utilize métodos para realizar operações específicas em cada classe, como o cálculo do total de um item ou de uma compra.