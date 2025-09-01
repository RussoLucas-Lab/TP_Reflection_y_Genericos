import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> clasePersona = Persona.class;
        Constructor<?>[] constructores = clasePersona.getDeclaredConstructors();
        System.out.println("Constructores de Persona:");
        for (Constructor<?> c : constructores) {
            System.out.println(c);
        }

        Constructor<?> constructor = clasePersona.getConstructor(String.class, int.class);
        Object personaObj = constructor.newInstance("Lucas", 25);

        Field campoNombre = clasePersona.getDeclaredField("nombre");

        campoNombre.setAccessible(true);
        campoNombre.set(personaObj, "Martín");


        Method metodoInfo = clasePersona.getMethod("mostrarInfo");
        metodoInfo.invoke(personaObj);


        Method metodoSaludar = clasePersona.getDeclaredMethod("Saludar");

        metodoSaludar.setAccessible(true);


        String saludo = (String) metodoSaludar.invoke(personaObj);
        System.out.println("Saludo invocado por reflection: " + saludo);


        System.out.println("Antes era: " + Modifier.toString(metodoSaludar.getModifiers()));
        System.out.println("Simulación: Saludar() cambiado a private.");
    }
}