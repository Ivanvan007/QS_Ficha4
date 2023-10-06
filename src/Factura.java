public class Factura
{
    public static int tempId = 0;
    private int id;
    private String conceito;
    private int tempo;
    private int valor;

    public Factura()
    {
        id = tempId;
        tempId++;

    }

    public Factura(String conceito, int tempo, int valor) {
        this.id = tempId;
        this.conceito = conceito;
        this.tempo = tempo;
        this.valor = valor;
        tempId++;
    }

    public int getId() {
        return id;
    }

    public String getConceito() {
        return conceito;
    }

    public void setConcepto(String concepto) {
        this.conceito = concepto;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString()
    {
        return "Factura{" +
                "id=" + id +
                ", conceito='" + conceito + '\'' +
                ", tempo=" + tempo +
                ", valor=" + valor +
                '}';
    }
}
