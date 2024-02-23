package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSkillsExercice {
    private static Map<String, List<String>> peopleSkillsMap;
    public static void main(String[] args) {

        //declaro objeto de caracteres de Lucia
        List<String> luciaSkills = new ArrayList<>();
        luciaSkills.add("Java");
        luciaSkills.add("Php");
        luciaSkills.add("Python");

        //declaro objeto de caracteres de Carmen
        List<String> carmenSkills = new ArrayList<>();
        carmenSkills.add("C#");
        carmenSkills.add("JavaScript");
        carmenSkills.add("Kotlin");
        carmenSkills.add("Scala");

        peopleSkillsMap = new HashMap<>();

        //añado a la lista de los objetos
        peopleSkillsMap.put("Lucia",luciaSkills);
        peopleSkillsMap.put("Carmen",carmenSkills);

        System.out.println(peopleSkillsMap);
        var people = filterCandidates("Java");
        System.out.println(people);
    }

    public static List<String> filterCandidates(String skill){

        // 0 crear una lista auxiliar para guardar las personas
        // 1 tenemos que recorrer el map de personas y skills y
        // 2 para cada persona consultar sus skills
        // 3 si los skills de la persona contiene el skill pasado con parametro
        // 4 incluye a la persona en la lista que se devuelve
        // 5 devuelve en el return la lista generada en bucle

            // 0
        List<String> successfulCandidates = new ArrayList<>();

            // 1
        for (var currentPerson: peopleSkillsMap.keySet()) {
            System.out.println(currentPerson);
            //2
           List<String> personSkills = peopleSkillsMap.get(currentPerson);
            System.out.println(personSkills);
            //3
            if (personSkills.contains(skill))
            //4
            successfulCandidates.add(currentPerson);
        }
            //5
        return successfulCandidates;
    }

}
