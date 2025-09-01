import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Caja<String> c1 = new Caja<>();
        Caja<Integer> c2 = new Caja<>();

        c1.setValor("STRING");
        c2.setValor(123);

        System.out.println("Genérico con String: " + c1.getValor());
        System.out.println("Genérico con Integer: " + c2.getValor());

        //Las colecicones sin genéricos pueden almacenar cualquier tipo de valor pero traen consigo problemas de seguridad
        //y problemas en tiempo de ejecución

        List lista = new ArrayList();

        lista.add("hola");
        lista.add(123);
        lista.add(true);

        System.out.println(lista);
    }
}
