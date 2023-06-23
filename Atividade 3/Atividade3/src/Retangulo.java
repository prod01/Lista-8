import java.util.Scanner;

public class Retangulo {
    
    private float comprimento;
    private float largura;

    public Retangulo(float compriment, float largura){
             
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public void mudaComprimento(float comprimento){
        
       this.comprimento = comprimento;

    }

    public void mudaLargura(float largura){
        
       this.largura = largura;

    }
    public float returnComprimento(){
        
        return comprimento;

    }

    public float returnLargura(){
        
        return largura;

    }

    public float area(){
        
        return (returnComprimento() * returnLargura());

    }

    public float perimetro(){
        
        return (2 * returnComprimento() ) + (2 * returnLargura());

    }


     public static void main(String[] args){

        float comprimento;
        float largura;

        Scanner input = new Scanner(System.in);
        System.out.println("informe o valor do comprimento: ");
        comprimento =input.nextInt();

        System.out.println("informe o valor do comprimento: ");
        largura =input.nextInt();

        Retangulo retangulo = new Retangulo(comprimento,largura);

        System.out.println("A area e "+retangulo.area());
        System.out.println("O perimetro e" + retangulo.perimetro());

        
    }
}
