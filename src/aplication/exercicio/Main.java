package aplication.exercicio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Produto produto[] = new Produto[3];
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\Users\\jalves22\\Documents\\projetos\\work-with-files\\arquivos";
		
		for (int i = 1; i < produto.length; i++) {
			produto[i] = new Produto();
			
			System.out.println("Digite o nome do produto: ");
			produto[i].nome = sc.next();

			System.out.println("Digite o valor: ");
			produto[i].preco = sc.nextDouble();
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path+"\\arquivo.csv"))) {
			for(Produto prod : produto) {
				bw.write(prod.nome);
			}
		
			
		} catch(IOException e) {
			e.getStackTrace();
		}
		
		
		sc.close();
	}

}
