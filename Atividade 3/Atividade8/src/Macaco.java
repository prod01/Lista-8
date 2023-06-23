import java.util.ArrayList;
import java.util.ArrayList;


public class Macaco {
    

private String nome;
private ArrayList<Object> estomago = new ArrayList();

    public Macaco(String nome) {
        this.nome = nome;
    }

    public String pegaNome() {
        return nome;
    }
    
    

    public void comer(Object ob) {
        estomago.add(ob);
    }

    public void verEstomago() {
        for(Object i : estomago)
        System.out.println("estomago: " + i.toString());
    }

    public void digerir() {
        if (!estomago.isEmpty())
        estomago.remove(estomago.size()-1);
    }

    public static void main(String[] args) {
        Macaco chita = new Macaco("chita");
        Macaco kong = new Macaco("kong");
        chita.comer("Maçã");
        kong.pegaNome();
        chita.pegaNome();
        chita.verEstomago();
        chita.comer("Banana");
        chita.verEstomago();
        chita.comer("Abacaxi");
        chita.verEstomago();
        chita.digerir();
        chita.verEstomago();
        kong.comer("Maça");
        kong.comer("Banana");
        kong.verEstomago();
}


}
