package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author RafaelRodrigues1
 */
public class FileBufferedReader {
    
    public static void main(String[] args) {
        
        String path = "C:\\Users\\RAFAEL\\Documents\\NetBeansProjects\\Arquivos\\FileReader.txt\\";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String str = br.readLine(); //Lê a próxima linha do arquivo(no caso, a primeira linha)
            while(str != null){ //Quando o arquivo não tem mais linhas, vira nulo.
                System.out.println(str);
                str = br.readLine(); //Lê próxima linha
            }
        }catch(IOException ex){
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
