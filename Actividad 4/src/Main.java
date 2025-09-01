import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Lista de enteros
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(10);
        listaEnteros.add(20);
        listaEnteros.add(30);

        // Lista de cadenas
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Hola");
        listaCadenas.add("Mundo");
        listaCadenas.add("Genéricos");


        System.out.println("Lista de enteros:");
        Generico.imprimirLista(listaEnteros);

        System.out.println("Lista de cadenas:");
        Generico.imprimirLista(listaCadenas);
    }
}
