package com.tiduswr.tad.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrafoComListaAjdacencias implements Grafo {
    private boolean isDirected;
    private Map<Character, List<Character>> adjacencyList;

    public GrafoComListaAjdacencias(boolean isDirected) {
        this.isDirected = isDirected;
        adjacencyList = new HashMap<>();
    }

    public void insereAresta(char o, char d) {
        adjacencyList.computeIfAbsent(o, k -> new ArrayList<>()).add(d);
        if (!isDirected) {
            adjacencyList.computeIfAbsent(d, k -> new ArrayList<>()).add(o);
        }
    }

    public void removeAresta(char o, char d) {
        List<Character> oAdjacency = adjacencyList.get(o);
        List<Character> dAdjacency = adjacencyList.get(d);
        if (oAdjacency != null) {
            oAdjacency.remove(Character.valueOf(d));
        }
        if (!isDirected && dAdjacency != null) {
            dAdjacency.remove(Character.valueOf(o));
        }
    }

    public void temAresta(char o, char d) {
        List<Character> oAdjacency = adjacencyList.get(o);
        if (oAdjacency != null && oAdjacency.contains(d)) {
            System.out.println("Existe uma aresta entre " + o + " e " + d);
        } else {
            System.out.println("Não existe uma aresta entre " + o + " e " + d);
        }
    }

    public void imprimeArestas() {
        for (char vertex : adjacencyList.keySet()) {
            for (char neighbor : adjacencyList.get(vertex)) {
                System.out.println("Aresta: " + vertex + " -> " + neighbor);
            }
        }
    }

    @Override
    public int getNumVertices() {
        return adjacencyList.size();
    }

    @Override
    public List<Character> getAdjacentVertices(char currVertex) {
        return adjacencyList.get(currVertex);
    }

}

