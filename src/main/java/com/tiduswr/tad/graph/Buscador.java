package com.tiduswr.tad.graph;

import java.util.*;

public class Buscador {
    private Grafo graph;

    public Buscador(Grafo graph) {
        this.graph = graph;
    }

    public void imprimeArestasBFS(char startVertex) {
        System.out.print("Busca em Largura: " + startVertex + " ");

        boolean[] visited = new boolean[graph.getNumVertices()];
        Queue<Character> queue = new LinkedList<>();
        visited[startVertex - 'A'] = true;
        queue.offer(startVertex);

        while (!queue.isEmpty()) {
            char currVertex = queue.poll();
            List<Character> neighbors = graph.getAdjacentVertices(currVertex);
            for (char neighbor : neighbors) {
                if (!visited[neighbor - 'A']) {
                    System.out.print(neighbor + " ");
                    visited[neighbor - 'A'] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public void imprimeArestasDFS(char startVertex) {
        System.out.print("Busca em Profundidade: " + startVertex + " ");

        boolean[] visited = new boolean[graph.getNumVertices()];
        dfs(startVertex, visited);
    }

    private void dfs(char currVertex, boolean[] visited) {
        visited[currVertex - 'A'] = true;
        List<Character> neighbors = graph.getAdjacentVertices(currVertex);
        for (char neighbor : neighbors) {
            if (!visited[neighbor - 'A']) {
                System.out.print(neighbor + " ");
                dfs(neighbor, visited);
            }
        }
    }

}
