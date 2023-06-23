import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Fazenda {
  
    private String nome;
    private int fome;
    private int saude; 
    private int idade;
 
    
    public Fazenda(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }


    public String nomAnimal() {
        return nome;
    }

    public void mudarNome(String nome) {
        this.nome = nome;
    }

    public int retornaFome() {
        return fome;
    }

    public void mudaFome(int fome) {
        this.fome = fome;
    }

    public int pegaSaude() {
        return saude;
    }

    public void mudaSaude(int saude) {
        this.saude = saude;
    }

    public int pegaIdade() {
        return idade;
    }

    public void mudaIdade(int idade) {
        this.idade = idade;
    
    }

    public float humor() {
        return retornaFome() * pegaSaude();
    }

    
    public void alimenta(float quantidade) {

        this.fome = (int) (this.fome - (this.fome * (quantidade/100.0f)));

    }
    public void brincar(int quantidade) {

        

        this.saude += this.saude * (quantidade/100.0f);

    }


    public String str() {
        return "Animal da Fazenda : nome=" + nome + ", fome=" + fome + ", saude=" + saude + ", idade=" + idade ;
    }



public static void main(String[] args){

        Random aleatorio = new Random();

        Fazenda Cachorro = new Fazenda("Cachorro", aleatorio.nextInt(10),

        aleatorio.nextInt(10), 5);

        Fazenda Vaca = new Fazenda("Vaca", aleatorio.nextInt(10),

        aleatorio.nextInt(10), 5);

        Fazenda Galinha = new Fazenda("Galinha", aleatorio.nextInt(10),

        aleatorio.nextInt(10), 5);

        ArrayList<Fazenda> Fazenda = new ArrayList();

        Fazenda.add(Cachorro);
        Fazenda.add(Vaca);
        Fazenda.add(Galinha);

        Scanner input = new Scanner(System.in);
        int opcao;
     

                while(true){

                        
                        System.out.println("1. Para alimentar os bichos");
                        System.out.println("2. Para brincar com todos os bichos");
                        System.out.println("3. Para conhcer todos os bichos");
                        
                        opcao = input.nextInt();
                        if (opcao == 1){
                        System.out.println("Alimentar todos com: ");
                        int alimentcao = input.nextInt();
                        for(int i = 0; i<=2; i++)
                        Fazenda.get(i).alimenta(alimentcao);

                }

                else if(opcao ==2){
                        System.out.println("Brincar com todos com: ");
                        int brinquedo = input.nextInt();
                        for(int i = 0; i<=2; i++)
                        Fazenda.get(i).brincar(brinquedo);
                        
                }

                else if(opcao == 3){
                        for(int i = 0; i<=2; i++)
                        {
                        System.out.println(Fazenda.get(i).str());
                        System.out.println(Fazenda.get(i).nomAnimal() + ": "
                        + Fazenda.get(i).humor());
                        }
                }
                else{
                        System.out.println("Desconhecido ");
                        break;

                }
    }
}
}
