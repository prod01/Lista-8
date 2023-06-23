
public class Pessoa {


private String nome ;
private int idade; 
private float peso;
private float altura;


    public Pessoa(String nome, int idade, float peso, float altura){

        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;

    }

    public void envelhecer( int anos){
        
       this.idade  += anos;
            if(this.idade < 21){
                    crescer(0.5f);

            }

    }

    public void engordar(float peso){
        
       this.peso += peso;

    }

    public void emagrecer(float peso){
        
      this.peso -= peso;

    }

    public void crescer(float altura){
        
        this.altura += altura;

    }

    

    public String convertToStrint(){
        return "nome:" + nome + ", idade:" + idade + ", peso:" + peso + ", altura:" +
        altura ;



    }
    public static void main(String[] args) {
            Pessoa a = new Pessoa("Ana", 26, 50, 160);
            System.out.println(a.convertToStrint());
            a.engordar(5);
            System.out.println(a.convertToStrint());
            a.emagrecer(10);
            System.out.println(a.convertToStrint());
            a.crescer(3);
            System.out.println(a.convertToStrint());
            a.envelhecer(1);
            System.out.println(a.convertToStrint());







    }
}
