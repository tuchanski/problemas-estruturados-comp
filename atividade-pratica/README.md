# Atividade Prática

Este repositório contém a implementação das estruturas de dados **Pilha** e **Fila**, utilizando tanto **listas encadeadas**. Além disso, foi implementado um algoritmo de **merge** de duas filas.

## ▶️ Como Executar

### Requisitos:
- JDK 8 ou superior
- IDE como IntelliJ, Eclipse ou uso de terminal com `javac`/`java`

### Passos:

1. Clone o repositório:
   ```bash
   git clone https://github.com/tuchanski/problemas-estruturados-comp
   cd problemas-estruturados-comp
   cd atividade-pratica
   cd src
   ```

2. Compile o arquivo desejado. Exemplo:
   ```bash
   javac PilhaEncadeada.java
   java PilhaEncadeada
   ```

3. Repita para os demais arquivos.

---

## ✅ Atividades Implementadas

### 1. Pilha com Lista Encadeada
**Arquivo:** `PilhaEncadeada.java`

- Métodos: `insere(int valor)`, `remove()`, `imprime()`
- Exemplo:
  ```java
  pilha.insere(10);
  pilha.insere(20);
  pilha.insere(30);
  pilha.imprime(); // Saída: Pilha: 30 20 10
  pilha.remove();  // Remove 30
  ```

**Lógica do insere(int valor)**:

- Cria um novo nó com o valor a ser inserido

- Faz o proximo do novo nó apontar para o atual topo da pilha

- Atualiza o topo para ser o novo nó

**Lógica do remove()**:

- Verifica se a pilha está vazia (topo == null)

- Se não estiver vazia:

- Salva o valor do topo atual

- Atualiza o topo para ser o próximo nó

- Retorna o valor salvo

**Lógica do imprime()**:

- Começa no topo da pilha

- Percorre cada nó até encontrar null

- Imprime os valores dos nós no caminho

---

### 2. Fila com Lista Encadeada
**Arquivo:** `FilaEncadeada.java`

- Métodos: `insere(int valor)`, `remove()`, `imprime()`
- Exemplo:
  ```java
  fila.insere(10);
  fila.insere(20);
  fila.insere(30);
  fila.imprime(); // Saída: Fila: 10 20 30
  fila.remove();  // Remove 10
  ```

**Lógica do insere(int valor)**:

- Cria um novo nó com o valor a ser inserido

- Se a fila estiver vazia (inicio == null):

- Tanto inicio quanto fim apontam para o novo nó

- Se a fila não estiver vazia:

- O último nó atual (fim) aponta para o novo nó

- Atualiza fim para ser o novo nó

**Lógica do remove()**:

- Verifica se a fila está vazia (inicio == null)

- Se não estiver vazia:

- Salva o valor do início atual

- Atualiza inicio para ser o próximo nó

- Se inicio ficar null (fila vazia), atualiza fim para null também

- Retorna o valor salvo

**Lógica do imprime()**:

- Começa no início da fila

- Percorre cada nó até encontrar null

- Imprime os valores dos nós no caminho

---

### 3. Merge de Filas Ordenadas com Lista Encadeada
**Arquivo:** `MergeEncadeada.java`

- Exemplo de entrada:
  ```java
  A: 1 3 5
  B: 2 4 6
  Resultado esperado: 1 2 3 4 5 6
  ```

**Funcionamento do merge(FilaEncadeada fila1, FilaEncadeada fila2)**:

- Inicializa uma nova fila vazia para armazenar o resultado do merge

- Enquanto as duas filas tiverem elementos:

- Compara os elementos da frente de cada fila

- Remove o menor elemento e insere na fila resultante

- Se forem iguais, remove da primeira fila

- Quando uma fila esvaziar, insere todos os elementos restantes da outra fila

- Parte-se do princípio que as filas estão ordenadas

---

## 🧪 Validação

Todos os exemplos executados nos métodos `main` de cada classe demonstram o funcionamento correto:

- Inserção e remoção com manutenção da ordem correta.
- Estrutura de pilha (LIFO) e fila (FIFO) funcionando conforme esperado.
- Merge de duas filas ordenadas criando uma terceira fila ordenada.

