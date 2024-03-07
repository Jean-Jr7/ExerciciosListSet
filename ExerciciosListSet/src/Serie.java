import java.util.Objects;

public class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer Tempo;

    public Serie(String nome, String genero, Integer tempo) {
        this.nome = nome;
        this.genero = genero;
        Tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempo() {
        return Tempo;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", Tempo=" + Tempo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(Tempo, serie.Tempo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, Tempo);
    }


    @Override
    public int compareTo(Serie serie) {
        int tempoSerie = Integer.compare(this.getTempo(), serie.getTempo());
        if (tempoSerie != 0) return tempoSerie;
        return this.getGenero().compareTo(serie.getGenero());

    }
}
