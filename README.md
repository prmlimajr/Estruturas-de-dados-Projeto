# Estruturas-de-dados-Projeto
Repositório para os códigos utilizados no projeto de avaliação da primeira nota da disciplina de Estruturas de Dados
<hr>
<h1>Projeto - Unidade 1</h1>
<p>
  <strong>
  1 - Elaborar uma implementação para um tipo abstrato de dados que represente uma DATA (dia, mês e ano- DD/MM/AAAA). Garantir que as informações da data estejam coerentes, válidas. Implementar os seguintes operações:
  </strong>
</p>
<ol>
  <li>Construtor (DD, MM, AAAA)</li>
  <li>toString() – retornando na forma de “DD/MM/AAAA” </li>
  <li>diasEntreDatas( Data outra): int </li>
</ol>
<hr>
<p>
  <strong>
  Complete as implementações de LISTA (vetor e dinâmica) vistas em aula. Implementar (em Lista_vetor e Lista_dinamica)  os seguintes métodos: 
  </strong>
</p>
<ul>
  <li> double  - get(int i)</li>
  <li> double  - remove(int i)</li>
  <li> double  - set(int i, double v) - Retorna o valor que estava na posição antes de ser alterado.</li>
  <li> double  - media() - Retorna a média dos valores da Lista.</li>              
  <li> String  - toString() - Retorna uma String com a Lista. Seus elementos serão separados por espaço, colocando os caracteres “[“ no início e “]” no fim. Ex: [ 12 34 22 42 ]</li>
</ul>

<hr>

<p>
  <strong>
    3 - Com base nas implementações de Listas, implemente (usando vetor, ponteiro e LinkedList - ver relação abaixo) uma pilha de caractere (char) com as operações de Pilha:
  </strong>
</p>

<ul>
  <li>Push</li>
  <li>Pop</li>
  <li>Top</li>
  <li>Underflow – Pilha vazia</li>
  <li>Overflow – Pilha cheia </li>
</ul>
<hr>

<p>
  <strong>
    4 - Usando as implementações do exercício anterior, faça: Um programa para ler uma expressão aritmética na forma de uma cadeia de caractere ( Ex: “(a+b*(2/3)-((2*3)+5))” ). Verificar de os parênteses dessa expressão estão corretos, ou seja se para cada ‘(’ teremos uma ‘)’. Usar uma pilha para colocar ‘(’ toda vez que encontrar um ‘(’ na expressão e remover da pilha o elemento do topo toda vez que encontrar um ‘)’  na expressão. Durante a análise não deve haver operação de POP em situação de UNDERFLOW. No final da análise a pilha deverá estar VAZIA. 
  </strong>
</p>

<hr>

<p>
  <strong>
    Baseado em alguns dos métodos disponíveis na classe LinkedList (ver relação abaixo) do JAVA (java.util), implemente, em JAVA, uma classe FILA com os 05 (cinco) métodos de uma estrutura de FILA. Implemente também o método toString() para essa classe FILA, esse método deve retornar uma String com as informações da FILA em ordem: 
  </strong>
</p>

<ul>
  <li>void - entraFila(int elem) - Coloca um número inteiro no fim da fila.</li>
  <li>int - saiFila() - Remove e retorna o elemento (número inteiro) do início da fila.</li>
  <li>int - primeiroFila() - Retorna, sem remover, o elemento (número inteiro) do início da fila.</li>
  <li>boolean - underflow() - Retorna true se a fila estiver vazia e false caso contrário.</li>
  <li>boolean - overflow() - Retorna true se a fila estiver cheia e false caso contrário.</li>
  <li>String - toString() - Retorna uma String com a fila. Seus elementos serão separados por espaço, colocando os caracteres “<“ no início e “<” no fim. Ex: < 12 34 22 42 < </li>
</ul>

<p>LinkedList - Method Summary</p>
<ul>
  <li>void - addFirst(E o) - Inserts the given element at the beginning of this list.</li>
  <li>void - addLast(E o) - Appends the given element to the end of this list.</li>
  <li>E - getFirst() - Returns the first element in this list.</li>
  <li>E - getLast() - Returns the last element in this list.</li>
  <li>E - removeFirst() - Removes and returns the first element from this list.</li>
  <li>E - removeLast() - Removes and returns the last element from this list.</li>
  <li>int - size() - Returns the number of elements in this list.</li>
  <li>E - get(int index) - Returns the element at the specified position in this list. </li>
</ul>

<p>
  OBS:  
</p>
<ul>
  <li>Use programas de teste para verificar o funcionamento das estruturas.</li>
  <li>Entregar em formato digital (código fonte).</li>
  <li>Trabalho em grupo de até 05 alunos ou individual.</li>
  <li>Na apresentação serão solicitadas algumas mudanças no exercício para avaliação do aprendizado, por um integrante do grupo indicado pelo professor.</li>
  <li>Todos os integrantes devem apresentar o trabalho.</li>
  <li>O trabalho deve ser ORIGINAL.</li>
</ul>
<p>
  Esse trabalho corresponde a 50% da avaliação da 1ª unidade.  ]
  <strong> Data de entrega e apresentação: Aula após a prova.</strong>
</p>


 

  
