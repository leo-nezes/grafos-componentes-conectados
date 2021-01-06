package com.listas.adjacentes;

import java.util.ArrayList;
import java.util.List;


public class Vertice {
    private String nome;
    private List<Aresta> adjacencias;
    
    private boolean marcado;
    private int id;

    Vertice(String nome) {
        this.nome = nome;
        this.adjacencias = new ArrayList<Aresta>();
        this.marcado = false;
        this.id = 0;
    }

    void addAdjacencia(Aresta e) {
    	adjacencias.add(e);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aresta> getAdjacencias() {
		return adjacencias;
	}

	public void setAdjacencias(List<Aresta> adjacencias) {
		this.adjacencias = adjacencias;
	}

	public boolean isMarcado() {
		return marcado;
	}

	public void setMarcado(boolean marcado) {
		this.marcado = marcado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
