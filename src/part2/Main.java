package part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Thiago");
        nomes.add("Gabriel");
        nomes.add("Alexandre");

        System.out.println("Before sort");
        System.out.println(nomes);

        System.out.println("After sort");
        Collections.sort(nomes);
        System.out.println(nomes);

        System.out.println();

        Aluno a1 = new Aluno(2,"Joao");
        Aluno a2 = new Aluno(32,"Thiago");;
        Aluno a3 = new Aluno(4,"Gabriel");
        Aluno a4 = new Aluno(10,"Alexandre");

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);

        System.out.println("Alunos");
        System.out.println("Before sort");
        System.out.println(alunos);

        System.out.println("After sort");
        Collections.sort(alunos, new AlunoComparator());
        System.out.println(alunos);




    }
}
