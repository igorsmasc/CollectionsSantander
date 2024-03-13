package part1;

import java.util.*;

public class Main {

    // Iterable - habilita o uso do for each
    // Collections - List<String> -> ["a", "ab", "abc"]
    // List         |  Set      | Map
    // ArrayList    |  HashSet  | HashMap

    public static void main(String[] args) {
//        GenericList<Integer> myGenericList = new GenericList<>();
//
//        myGenericList.add(1);
//        myGenericList.add(2);
//        myGenericList.add(3);

//        for (int i = 0; i < myGenericList.getSize(); i++) {
//            System.out.println(myGenericList.get(i));
//        }

//        for(Integer num: myGenericList) {
//            System.out.println(num);
//        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        List<String> nomes = new LinkedList<>();
        nomes.add("Lucas");
        nomes.add("Gabriel");
        nomes.add("Joao");
        nomes.add("Tiago");

//        for (String nome: nomes) {
//            System.out.println(nome);
//        }

        HashSet<String> setNomes = new HashSet<>();
        setNomes.add("Pedro");
        setNomes.add("Joao");
        setNomes.add("Joao");

        setNomes.contains("Joao");

//        for (String nome: setNomes
//             ) {
//            System.out.println(nome);
//        }


        Map<Integer, String> matriculaNome = new HashMap<>();
        matriculaNome.put(1, "Pedro");
        matriculaNome.put(2, "Alexandre");
        matriculaNome.put(2, "Joao");

        System.out.println(matriculaNome.getOrDefault(2, "Lucas"));
    }
}
