public class Tamagushi   {
  
    private String nome;
    private int fome;
    private int saude; 
    private int idade;
 
    
    public Tamagushi(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }


    public String pegaNome() {
        return nome;
    }

    public void TrocaNome(String nome) {
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
        return "nome=" + nome + ", fome=" + fome + ", saude=" + saude + ", idade=" + idade ;
    }


    public static void main(String[] args) {
        Tamagushi andy = new Tamagushi("andy", 9,100, 6);
        System.out.println(andy.humor());
        andy.alimenta(30);
        System.out.println(andy.humor());
        andy.brincar(20);
        System.out.println(andy.humor());
        System.out.println(andy.str());
    }





}
