package Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class GptExerc {
        public static void main(String[] args) {

            // Creamos un mapa de personas y sus habilidades

            Map<String, List<String>> personasYSkills = new HashMap<>();
            personasYSkills.put("Juan", List.of("Java", "Python", "C++"));
            personasYSkills.put("María", List.of("Java", "JavaScript"));
            personasYSkills.put("Carlos", List.of("Python", "HTML"));

            // Llamamos a la función para filtrar personas por habilidad

            List<String> personasConHabilidadJava = filtrarPersonasPorHabilidad(personasYSkills, "Java");

            // Imprimimos el resultado

            System.out.println("Personas con habilidad Java: " + personasConHabilidadJava);
        }

        public static List<String> filtrarPersonasPorHabilidad(Map<String, List<String>> personasYSkills, String habilidad) {
            List<String> personasConHabilidad = new ArrayList<>();

            // Recorremos el mapa de personas y habilidades

            for (Map.Entry<String, List<String>> entry : personasYSkills.entrySet()) {
                String persona = entry.getKey();
                List<String> skills = entry.getValue();

                // Verificamos si las habilidades de la persona incluyen la habilidad deseada

                if (skills.contains(habilidad)) {

                    // Incluimos a la persona en la lista

                    personasConHabilidad.add(persona);
                }
            }

            // Devolvemos la lista de personas con la habilidad deseada

            return personasConHabilidad;
        }
}


