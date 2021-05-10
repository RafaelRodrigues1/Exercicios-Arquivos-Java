package arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Program para abrir arquivos de texto simples, navegador pelas pastas(like cmd)
 * @author RafaelRodrigues1
 */
public class ProgramArquivo {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = "C:\\";
        Matcher matcher;
        do{
            File file = new File(path);
            Pattern pattern = Pattern.compile("[\\d\\D]*\\.txt");
            matcher = pattern.matcher(path);
            if(matcher.find()){
                try(BufferedReader br = new BufferedReader(new FileReader(path))){
                    String str;
                    while((str = br.readLine())!=null){
                        System.out.println(str);
                    }
                    break;
                }catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            }else{
                String[] nav = file.list();
                for(String s: nav){
                    System.out.println(s);
                }
                System.out.println("Digite o nome da pasta ou arquivo para navegar: ");
                path += in.nextLine().trim() + "\\";
            }
        }while(!matcher.find());        
    }
}
