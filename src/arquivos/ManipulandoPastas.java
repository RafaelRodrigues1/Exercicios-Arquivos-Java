package arquivos;

import java.io.File;

/**
 * @author RafaelRodrigues1
 */
public class ManipulandoPastas {
    
    public static void main(String[] args) {
        
        File path = new File("C:\\Users\\RAFAEL\\Documents\\NetBeansProjects\\Arquivos");
        File folders[] = path.listFiles(File::isDirectory);//Método retorna um vetor contendo as pastas dentro do endereço.
        System.out.println("Pastas: ");
        for(File folder: folders){
            System.out.println(folder);
        }
        
        File files[] = path.listFiles(File::isFile);//Método retorna um vetor contendo as os arquivos dentro do endereço.
        System.out.println("Arquivos: ");
        for(File file: files){
            System.out.println(file.getName()); //getName retorna só o nome do arquivo ou pasta, sem o caminho.
        }                                       //getParent retorna só o caminho, sem o arquivo ou pasta final.
                    
        if(new File("C:\\Users\\RAFAEL\\Documents\\NetBeansProjects\\Arquivos" + "\\subPasta").mkdir()){
            System.out.println("Sucesso ao criar a pasta");                 //Método cria a pasta no endereço passado
        }else{
            System.out.println("Pasta não criada");
        }
    }
}
