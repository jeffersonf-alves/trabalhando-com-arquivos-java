package aplication.writer;

import java.io.File;
import java.util.Scanner;

public class Programa03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho: ");
		String strPath = sc.next();
		
		File path = new File(strPath);
		
		
		System.out.println("getName: "+ path.getName());
		System.out.println("getParent: "+ path.getParent());
		System.out.println("getPath: "+ path.getPath());
		sc.close();
	
	}

}
