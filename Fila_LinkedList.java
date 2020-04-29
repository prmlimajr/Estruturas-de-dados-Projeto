
import java.util.LinkedList;

public class Fila_LinkedList {
	
	private int max;
	LinkedList<Integer> Fila = new LinkedList<Integer>();
	
	public Fila_LinkedList() {
		max = 1000;
	}
	
	public Fila_LinkedList(int max) {
		this.max = max;
	}
	
	public void entraFila(int e) {
		if(Fila.size() < max) {
			Fila.addLast(e);
		} else {
			System.out.println("A fila está cheia!");		
		}
	}
	
	public int saiFila() {
		if(Fila.size() != 0) {
			return Fila.removeFirst();
		} else {
			System.out.println("A fila está vazia!");
			return 0;
		}
	}
	
	public int primeiroFila() {
		if(Fila.size() != 0) {
			return Fila.getFirst();
		} else {
			System.out.println("A fila está vazia!");
			return 0;
		}
	}
	
	public String toString() {
		String fila = "";
		
		fila += "< ";
		for(int i = 0; i < Fila.size(); i++) {
			fila += Fila.get(i) + " ";
		}
		fila += "<";
		return fila;
	}
	
	public boolean overflow() {
		return Fila.size() >= max;

	}	
	public boolean underflow() {
		return Fila.size() == 0;
	}
}
