# Java Data Structures and Sorting Algorithms

Este projeto contém implementações em Java de estruturas de dados e algoritmos de classificação. Ele inclui implementações das seguintes estruturas de dados:

- Pilha (Stack)
- Fila (Queue)
- Lista Encadeada (Linked List)
- Árvore Binária (Binary Tree)

Além disso, inclui algoritmos de classificação populares implementados para classificar arrays genéricos:

- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort

## Requisitos

- Java JDK 8 ou superior

## Como usar

1. Faça o clone deste repositório para sua máquina local.

2. Abra o projeto em sua IDE de preferência.

3. Navegue até o arquivo `Main.java` localizado no pacote `com.tiduswr`.

4. No método `main`, descomente a chamada para o método de teste que você deseja executar. Por exemplo, se você deseja testar o Merge Sort, descomente a linha `mergeSortTest();`.

5. Execute o arquivo `Main.java` para ver os resultados do teste.

Os testes estão configurados para demonstrar o uso de cada estrutura de dados ou algoritmo de classificação. Você pode comentar ou descomentar as chamadas dos métodos de teste de acordo com o que deseja testar.

## Exemplos

### Merge Sort

```java
private static void mergeSortTest() {
    Sorter<Integer> sorter = new Sorter<>();
    Integer[] arr = new Integer[]{3, 5, 1, 8, 7};
    Integer[] sorted = sorter.mergeSort(arr);

    System.out.print("Original: ");
    for (int i : arr) {
        System.out.print(i + " ");
    }

    System.out.println();

    System.out.print("Sorted: ");
    for (int i : sorted) {
        System.out.print(i + " ");
    }
}
```

Saída:

```
Original: 3 5 1 8 7
Sorted: 1 3 5 7 8
```

## Contribuição

Sinta-se à vontade para contribuir com melhorias, correções de bugs ou adição de novas estruturas de dados e algoritmos de classificação. Abra uma issue para discutir suas ideias ou envie um pull request com suas alterações.
