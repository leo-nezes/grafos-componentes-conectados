package com.componentes.conectados;

import com.listas.adjacentes.*;

// Algoritmo de Cormen
public class DFS {
	private Integer cont;
	private String resultado;
	
	public DFS() {
		this.cont = 0;
		this.resultado = "";
	}
	
	public void buscaDFS(Vertice vertice){
		resultado += "---------------------------------\n";
		resultado += "DFS(" + vertice.getNome() + ")\n";
		
		vertice.setMarcado(true);
		vertice.setId(this.cont);
		
		resultado += "Marcado: " + vertice.isMarcado() + "\n";
		resultado += "Id: " + vertice.getId() + "\n";
		
		vertice.getAdjacencias().forEach(verticeAdj -> {
			if (!verticeAdj.getDestino().isMarcado()) {
				buscaDFS(verticeAdj.getDestino());
			}
		});
	}

	public String toString() {
		return resultado;
	}

	public Integer getCont() {
		return cont;
	}

	public void setCont(Integer cont) {
		this.cont = cont;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
}
