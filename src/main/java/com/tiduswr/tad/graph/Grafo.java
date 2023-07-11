package com.tiduswr.tad.graph;

import java.util.List;

public interface Grafo{

    void insereAresta(char o, char d);
    void removeAresta(char o, char d);
    void temAresta(char o, char d);
    void imprimeArestas();
    int getNumVertices();
    List<Character> getAdjacentVertices(char currVertex);

}
