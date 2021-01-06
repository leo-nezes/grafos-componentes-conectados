package com.componentes.conectados;


import com.listas.adjacentes.*;

public class ComponentesConectados {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();
		DFS dfs = new DFS();
		
		Vertice a = grafo.addVertice("A");
	    Vertice b = grafo.addVertice("B");
	    Vertice c = grafo.addVertice("C");
	    Vertice d = grafo.addVertice("D");
	    Vertice e = grafo.addVertice("E");
	    
	    Aresta ab = grafo.addAresta(a, b);
	    Aresta ac = grafo.addAresta(a, c);
	    Aresta ba = grafo.addAresta(b, a);
	    Aresta bc = grafo.addAresta(b, c);
	    Aresta ca = grafo.addAresta(c, a);
	    Aresta cb = grafo.addAresta(c, b);
	    
	    Aresta de = grafo.addAresta(d, e);
	    Aresta ed = grafo.addAresta(e, d);
	    
	    grafo.getVertices().forEach(vertice -> {
	    	if(!vertice.isMarcado()) {
	    		dfs.buscaDFS(vertice);
	    		dfs.setCont(dfs.getCont() + 1);
	    	}
	    	
	    });
	    
	    System.out.println(dfs);
	}

}
