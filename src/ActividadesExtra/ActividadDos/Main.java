package ActividadesExtra.ActividadDos;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LeerArchivos lectura = new LeerArchivos();
        lectura.leer("datos.txt");

        System.out.println("-----pilaDeLlamadas-----");
        try {
            lectura.metodoUno("datos.txt");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}