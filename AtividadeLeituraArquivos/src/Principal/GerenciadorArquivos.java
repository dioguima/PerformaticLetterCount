package Principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GerenciadorArquivos {

public static String ler(String caminho){
		FileReader outputStream = null;
		StringBuilder stringBuilder = new StringBuilder();
		try {
			outputStream = new FileReader(caminho);
			BufferedReader lerArq = new BufferedReader(outputStream);
			String linha = lerArq.readLine();
			while (linha != null) {
				stringBuilder.append(linha.toLowerCase());
				linha = lerArq.readLine(); 
			}
			lerArq.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return stringBuilder.toString();
	}

	
}
