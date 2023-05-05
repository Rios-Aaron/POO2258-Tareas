package ActividadesExtra.ActividadDos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivos {
    public void leer(String ruta){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String line=" ";
            while ((line= reader.readLine()) !=null){
                System.out.println("info: "+line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public  void metodoUno(String ruta) throws IOException{
        this.metodoDos(ruta);

    }
    public void metodoDos(String ruta)throws IOException{
        this.leer(ruta);

    }
}