import java.util.ArrayList;

public class Parque
{
    private static final double precoAlunosDefault = 0.10;
    private static final int numeroLugaresDefault = 500;
    private double precoAlunos; //preço por cada 15 minutos para os alunos
    private int numeroLugares;//lugares totais do estacionamento
    private int lugaresDisponiveis;
    private ArrayList<Aluno>alunosEstacionados;
    private int estacionados;

    public Parque()
    {
        precoAlunos = precoAlunosDefault;
        numeroLugares = numeroLugaresDefault;
        lugaresDisponiveis = numeroLugares;

    }
    public Parque(int precoAlunos, int numeroLugares)
    {
        this.precoAlunos= precoAlunos;
        this.numeroLugares = numeroLugares;
    }

    public double getPrecoAlunos() {
        return precoAlunos;
    }

    public void setPrecoAlunos(double precoAlunos) {
        this.precoAlunos = precoAlunos;
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
    public void estacionarAluno(Aluno a)
    {
        alunosEstacionados.add(a);
        estacionarVeiculo();
    }
    public void desestacionarAluno(Aluno a)
    {
        for (Aluno al : alunosEstacionados)
        {
            if(al.equals(a))
            {
                alunosEstacionados.remove(al);
                desestacionarVeiculo();
            }
            else
            {
                System.out.println("O aluno não foi encontrado \n");
            }
        }
    }
    public void desestacionarVeiculo()
    {
        estacionados --;
    }

    public void estacionarVeiculo()
    {
        estacionados ++;
    }

    public int calculaLugaresDisponiveis(){
        lugaresDisponiveis = estacionados;
        return lugaresDisponiveis;
    }

    @Override
    public String toString() {
        return "Parque{" +
                "precoAlunos=" + precoAlunos +
                ", numeroLugares=" + numeroLugares +
                ", lugaresDisponiveis=" + lugaresDisponiveis +
                ", alunosEstacionados=" + alunosEstacionados +
                ", estacionados=" + estacionados +
                '}';
    }
}
