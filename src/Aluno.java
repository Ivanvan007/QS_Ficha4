import java.util.ArrayList;

public class Aluno {
    private int numeroAluno;
    private String nomeAluno;
    private int idadeAluno;
    private double saldo;
    private String matricula;
    private ArrayList<Factura> listaFaturas;

    /**
     * Constructor
     * @param numeroAluno
     * @param nomeAluno
     * @param idadeAluno
     * @param saldo
     * @param matricula
     */

    public Aluno(int numeroAluno, String nomeAluno, int idadeAluno, double saldo, String matricula) {
        this.numeroAluno = numeroAluno;
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.saldo = saldo;
        this.matricula = matricula;
        listaFaturas = new ArrayList<>();
    }

    /**
     * getters and setters
     * @return
     */

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getMatricula() {
        return matricula;
    }

    public ArrayList<Factura> getListaFaturas() {
        return listaFaturas;
    }

    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setListaFaturas(ArrayList<Factura> listaFaturas) {
        this.listaFaturas = listaFaturas;
    }

    /**
     *  toString
     * @return
     */

    @Override
    public String toString() {
        return "Aluno{" +
                "numeroAluno=" + numeroAluno +
                ", nomeAluno='" + nomeAluno + '\'' +
                ", idadeAluno=" + idadeAluno +
                ", saldo=" + saldo +
                ", matricula='" + matricula + '\'' +
                ", listaFaturas=" + listaFaturas +
                '}';
    }

    /**
     * method to add invoices to the student account
     * @param invoice
     */

    public void addInvoice(Factura invoice){
        listaFaturas.add(invoice);
    }

}
