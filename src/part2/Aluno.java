package part2;

public class Aluno implements Comparable<Aluno> {
    private Integer matricula;
    private String nome;

    public Aluno(Integer matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Aluno o) {
        // -1 = menor
        // 0 = igual
        // +1 = maior
//        if(this.matricula < o.matricula) {
//            return -1;
//        }
//
//        if(this.matricula > o.matricula) {
//            return 1;
//        }
        return this.nome.compareTo(o.nome);
    }
}
