public class Bola {


    private String cor;
    private int circunferencia;
    private String material;


    public Bola( String cor, int circunferencia,String material){

        super();
        this.cor =cor;
        this.circunferencia = circunferencia ;
        this.material = material;
    }

    public void trocaCor( String cor){
        
        this.cor =cor;

    }


    public String mostraCor(){
        
        return this.cor;

    }
     public static void main(String[] args){

        Bola b = new Bola("amarela", 12,"borracha");
        System.out.println(b.mostraCor());
        b.trocaCor("vinho");
        
        System.out.println(b.mostraCor());
    }
}

 
    

