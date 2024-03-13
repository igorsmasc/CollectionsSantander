package part1;

import java.util.Objects;

public class Carro {

    private String nome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro)) return false;
        Carro carro = (Carro) o;
        return Objects.equals(nome, carro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
