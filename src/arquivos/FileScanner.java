package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author RafaelRodrigues1
 */
public class FileScanner {

    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\RAFAEL\\Documents\\NetBeansProjects\\Arquivos\\FileScanner.txt");
        try {
            Scanner in = new Scanner(file);
            while(in.hasNext()){ // verifica se o arquivo tem mais linhas. Quando o arquivo está no fim, retorna false
                System.out.println(in.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }   
}
