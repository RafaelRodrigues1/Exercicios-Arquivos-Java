package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author RafaelRodrigues1
 */
public class FileBufferedWriter {
    
    public static void main(String[] args) {
        
        String path = "C:\\Users\\RAFAEL\\Documents\\NetBeansProjects\\Arquivos\\FileWriter.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            bw.write("Funcionando bem");                //passando o parâmetro true, ele n recria o arquivo, só adiciona.
            bw.newLine();                               //Sem esse parâmetro, zera o arquivo e adiciona o que foi passado.
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
