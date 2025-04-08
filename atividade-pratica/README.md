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

---

### 3. Merge de Filas Ordenadas com Lista Encadeada
**Arquivo:** `MergeEncadeada.java`

- Exemplo de entrada:
  ```java
  A: 1 3 5
  B: 2 4 6
  Resultado esperado: 1 2 3 4 5 6
  ```

---

## 🧪 Validação

Todos os exemplos executados nos métodos `main` de cada classe demonstram o funcionamento correto:

- Inserção e remoção com manutenção da ordem correta.
- Estrutura de pilha (LIFO) e fila (FIFO) funcionando conforme esperado.
- Merge de duas filas ordenadas criando uma terceira fila ordenada.

