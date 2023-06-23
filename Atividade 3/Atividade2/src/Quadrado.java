public class Quadrado {
    
    private float lado;
 

    public Quadrado(float lado){

        super();
        this.lado = lado;
    }

    public void mudaLado(float lado){
        
       this.lado = lado;

    }

    public float pegaLado(){
        
        return lado;

    }

    public float area(){
        
        return this.lado* this.lado;

    }


     public static void main(String[] args){

        Quadrado q = new Quadrado(8);
        System.out.println(q.pegaLado());
        System.out.println(q.area());
        q.mudaLado(4);
        System.out.println(q.pegaLado());
        System.out.println(q.area());
        
    
        
    }
}
