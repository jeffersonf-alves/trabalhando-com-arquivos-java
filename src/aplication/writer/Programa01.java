package aplication.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa01 {

	public static void main(String[] args) {
		
		
		String[] lines = new String[] {"Good Evening!", "Good Afternoon"};
		
		String path = "C:\\Users\\jalves22\\Documents\\projetos\\work-with-files\\arquivos\\arquivo.txt";
		
		
		// FileWriter vai criar o arquivo caso não exista
		// Se caso existir ele vai substituir
		// Caso queira que não seja substituido é só passar true ex: (path, true)
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.getStackTrace();
		}

	}

}
