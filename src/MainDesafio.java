import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainDesafio {

    // Um método que recebe uma lista de inteiros e retorna o ÚNICO valor não repetido.
    // - OBS: A lista vai conter apenas um Único valor não repetido.

    // [1, 2, 3, 1, 3] = 2
    // [1, 1, 2, 3, 3]

    // https://leetcode.com/problems/two-sum/description/

    public Integer unicoNaoRepetido(List<Integer> numeros) {
        return 0;
    }

    // 2 - Crie um metodo que deve receber uma lista de inteiros
    // e dizer se essa lista contem duplicados

    public static Boolean cotemDuplicadosFor(List<Integer> numeros) {
        // [1, 2, 3, 4, 7, 5, 5] - 15x
        //i             ^
        //k                ^

        for(int i = 0; i < numeros.size(); i++) {
            for (int k = i+1; k < numeros.size(); k++) {
                if(numeros.get(i) == numeros.get(k)) {
                    return true;
                }
            }
        }

        return false;
    }

    public Boolean cotemDuplicadosSet(List<Integer> numeros) {
        // SET {1, 2, 3, 4, 7, 5}

        // [1, 2, 3, 4, 7, 5, 5]
        //                    ^
        Set<Integer> numerosSet = new HashSet<>();

        for(int i = 0; i < numeros.size(); i++) {
            if(numerosSet.contains(numeros.get(i))) {
                return true;
            }

            numerosSet.add(numeros.get(i));
        }

        return false;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(cotemDuplicadosFor(nums));
    }
}
