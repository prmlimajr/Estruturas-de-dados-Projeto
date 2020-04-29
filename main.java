public class main {

	public static void main(String[] args) {

		System.out.println("QUESTÃO 01");
		System.out.println();
		
		Data d = new Data(28,04,2019);
		Data e = new Data (28,04,2020);
		
		System.out.println("data 1 - toString(): " + d);
		System.out.println("data 2 - toString(): " + e);
		System.out.println("Diferença entre datas 1 e 2: " + d.diasEntreDatas(e));
		System.out.println("Data 1 é ano bissexto? " + d.bissexto(d.getAAAA()));
		System.out.println("Data 2 é ano bissexto? " + e.bissexto(e.getAAAA()));
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		
		System.out.println("QUESTÃO 02");
		System.out.println();
		
		System.out.println("Lista_vetor");
		System.out.println();
		Lista_vetor l = new Lista_vetor();
		
		l.add(0, 1);
		l.add(1, 2);
		l.add(2, 3);
		l.add(3, 4);
		l.add(4, 5);
		
		System.out.println("Método toString: " + l);
		System.out.println("Método Média: " + l.media());
		System.out.println("Método get na posição 2: " + l.get(2));
		System.out.println("Método remove na posição 2. Valor removido: " + l.remove(2));
		System.out.println("Método toString após o remove: " + l);
		System.out.println("Método set na posição 2. Valor que sofreu alteração: " + l.set(2, 8));
		System.out.println("Método toString após o set: " + l);
		
		System.out.println();
		
		System.out.println("Lista_dinamica");
		System.out.println();
		Lista_dinamica ld = new Lista_dinamica();
		
		ld.add(0, 1);
		ld.add(1, 2);
		ld.add(2, 3);
		ld.add(3, 4);
		ld.add(4, 5);
		
		System.out.println("Método toString: " + ld);
		System.out.println("Método Média: " + ld.media());
		System.out.println("Método get na posição 2: " + ld.get(2)); 		// CONSERTAR O GET 
		System.out.println("Método remove na posição 2. Valor removido: " + ld.remove(2)); 		// ESTÁ RETORNANDO O VALOR CORRETO MAS ESTÁ REMOVENDO O ÚLTIMO ÍNDICE
		System.out.println("Método toString após o remove: " + ld);
		System.out.println("Método set na posição 2. Valor que sofreu alteração: " + ld.set(2, 8));
		System.out.println("Método toString após o set: " + ld);
	}

}
