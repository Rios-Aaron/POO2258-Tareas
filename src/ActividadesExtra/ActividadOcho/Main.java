package ActividadesExtra.ActividadOcho;

import ActividadesExtra.ActividadOcho.Controlador.ControladorLibro;
import ActividadesExtra.ActividadOcho.Modelo.Libro;
import persistencia.DemoLibroDB;
import org.example.persistencia.LibroDAO;
import org.example.vista.VentanaLibro;

public class Main {
    public static void main(String[] args) {
        VentanaLibro view = new VentanaLibro("MVC y JDBC");
        ControladorLibro controller = new ControladorLibro(view);


        // LibroDAO ldao = new LibroDAO();









        /*try {
           Libro res = (Libro) ldao.buscarPorId("1");
            System.out.println(res);
            System.out.println("-----------------------------------");
            for (Object lib: ldao.obtenerTodo()){
                System.out.println((Libro)lib);
            }
        }catch (SQLException sqle){
            System.out.println("Error ");
            System.out.println(sqle.getMessage());
        }*/



    }

}