package com.tiduswr.tad.graph;

import java.util.ArrayList;
import java.util.List;

public class GrafoComMatrizAdjacencias implements Grafo{

    private boolean isDirected;
    private int numVertices;
    private int[][] adjacencyMatrix;

    public GrafoComMatrizAdjacencias(boolean isDirected, int numVertices) {
        this.isDirected = isDirected;
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void insereAresta(char o, char d) {
        int indexO = o - 'A';
        int indexD = d - 'A';
        adjacencyMatrix[indexO][indexD]++;
        if (!isDirected) {
            adjacencyMatrix[indexD][indexO]++;
        }
    }

    public void removeAresta(char o, char d) {
        int indexO = o - 'A';
        int indexD = d - 'A';
        adjacencyMatrix[indexO][indexD] = removerAresta(adjacencyMatrix[indexO][indexD]);
        if (!isDirected) {
            adjacencyMatrix[indexD][indexO] = removerAresta(adjacencyMatrix[indexD][indexO]);
        }
    }

    private int removerAresta(int currentValue){
        return currentValue >= 0 ? currentValue - 1 : 0;
    }

    public void temAresta(char o, char d) {
        int indexO = o - 'A';
        int indexD = d - 'A';
        if (adjacencyMatrix[indexO][indexD] >= 1) {
            System.out.println("Existe uma aresta entre " + o + " e " + d);
        } else {
            System.out.println("Não existe uma aresta entre " + o + " e " + d);
        }
    }

    public void imprimeArestas() {
        System.out.println("Matriz de adjacências:");
        System.out.print("  ");
        for (int i = 0; i < numVertices; i++) {
            System.out.print((char) ('A' + i) + " ");
        }
        System.out.println();
        for (int i = 0; i < numVertices; i++) {
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public int getNumVertices() {
        return this.numVertices;
    }

    @Override
    public List<Character> getAdjacentVertices(char currVertex) {
        List<Character> adjacentVertices = new ArrayList<>();
        int currIndex = currVertex - 'A';
        
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[currIndex][i] == 1) {
                char adjacentVertex = (char) ('A' + i);
                adjacentVertices.add(adjacentVertex);
            }
        }
        
        return adjacentVertices;
    }

}
