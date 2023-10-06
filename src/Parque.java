import java.util.ArrayList;

public class Parque
{
    private static float precoMinStatic = 0.15f; //preço por cada 15 minutos
    private static int lugaresEstacionamento = 500;
    private float precoMinutos;//preço por cada 15 minutos
    private int numeroLugares;//lugares totais do estacionamento
    private int lugaresDisponiveis;
    private ArrayList<Aluno>alunosEstacionados;
    private int estacionados;

    public Parque()
    {
        precoMinutos = precoMinStatic;
        numeroLugares = lugaresEstacionamento;

    }

    public static float getPrecoMinStatic() {
        return precoMinStatic;
    }

    public static void setPrecoMinStatic(float precoMinStatic) {
        Parque.precoMinStatic = precoMinStatic;
    }

    public static int getLugaresEstacionamento() {
        return lugaresEstacionamento;
    }

    public static void setLugaresEstacionamento(int lugaresEstacionamento) {
        Parque.lugaresEstacionamento = lugaresEstacionamento;
    }

    public float getPrecoMinutos() {
        return precoMinutos;
    }

    public void setPrecoMinutos(float precoMinutos) {
        this.precoMinutos = precoMinutos;
    }

    public int getNumeroLugares() {
        return numeroLugares;
    }

    public void setNumeroLugares(int numeroLugares) {
        this.numeroLugares = numeroLugares;
    }

    public int getLugaresDisponiveis() {
        return lugaresDisponiveis;
    }

    public void setLugaresDisponiveis(int lugaresDisponiveis) {
        this.lugaresDisponiveis = lugaresDisponiveis;
    }

    public ArrayList<Aluno> getAlunosEstacionados() {
        return alunosEstacionados;
    }

    public void setAlunosEstacionados(ArrayList<Aluno> alunosEstacionados) {
        this.alunosEstacionados = alunosEstacionados;
    }

    public int getEstacionados() {
        return estacionados;
    }

    public void setEstacionados(int estacionados) {
        this.estacionados = estacionados;
    }

    @Override
    public String toString() {
        return "Parque{" +
                "precoMinutos=" + precoMinutos +
                ", numeroLugares=" + numeroLugares +
                ", lugaresDisponiveis=" + lugaresDisponiveis +
                ", alunosEstacionados=" + alunosEstacionados +
                ", estacionados=" + estacionados +
                '}';
    }
}
