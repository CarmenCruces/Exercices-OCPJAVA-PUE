package Collection;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Map;

//Crea un HashMapObjeto llamado capitalCities
//que almacenará String claves y String valores :
public class HashMapCollection {
    public static void main(String[] args) {


    Map<String, String> capitalCities = new HashMap<>();

    //La HashMapclase tiene muchos métodos útiles.
    //Por ejemplo, para agregarle elementos, use el put()método:

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Spain", "Madrid");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    capitalCities.putIfAbsent("USA", "Washington Nuevo");
    System.out.println(capitalCities);

    //Para acceder a un valor en HashMap, utilice el get()método y consulte su clave:

    System.out.println(capitalCities.get("Norway"));
    System.out.println(capitalCities.get("USA"));

    //Para eliminar un elemento, utilice el remove() método y consulte la clave:
    //capitalCities.remove("England");

    //Para eliminar todos los elementos, utilice el clear()método:
        // capitalCities.clear();
    //Para saber cuántos elementos hay, utilice el size()método:
        System.out.println(capitalCities.size());

    // Utilice el keySet()método si solo desea las claves
    // y utilice el values()método si solo desea los valores:

        System.out.println("Las keys: ");
    // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        System.out.println("Los valores: ");
    // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        System.out.println("Las keys y los valores son : ");

    // Print keys and values
    for (String i : capitalCities.keySet()) {
        System.out.println("key: " + i + " value: " + capitalCities.get(i));
    }

        // Create a HashMap object called people
        var people = new HashMap<String, Integer>();
        for (var values: people.values()){
            //var list = values.get();
        }

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);
        people.put("Carmen", 50);
        people.put("Nando", 15);
        people.put("María", 94);

        System.out.println("HashMap people : ");

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }

    }
}
