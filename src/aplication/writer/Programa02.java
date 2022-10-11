package aplication.writer;

import java.io.File;
import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o caminho Path: ");
		String strPath = sc.next();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS");
		for(File folder: folders) {
			System.out.println(folder);
		}
		
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for(File file: files) {
			System.out.println(file);
		}
		
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Diret�rio criado: "+ success);
		sc.close();

	}

}
