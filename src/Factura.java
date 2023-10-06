public class Factura
{
    public static int tempId = 0;
    private int id;
    private String concepto;
    private int tempo;
    private int valor;

    public Factura()
    {
        id = tempId;
        tempId++;

    }

    public Factura(String concepto, int tempo, int valor) {
        this.id = tempId;
        this.concepto = concepto;
        this.tempo = tempo;
        this.valor = valor;
        tempId++;
    }

    public int getId() {
        return id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
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
}
