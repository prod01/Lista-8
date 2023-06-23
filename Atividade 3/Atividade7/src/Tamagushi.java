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

    public static void main(String[] args) {
        Tamagushi andy = new Tamagushi("andy", 0,100, 6);
        System.out.println(andy.humor());
        andy.mudaIdade(7);
        System.out.println(andy.pegaIdade());
        andy.TrocaNome("Jose");
        System.out.println(andy.pegaNome());
        andy.mudaFome(45);
        System.out.println(andy.retornaFome());
        andy.mudaSaude(90);
        System.out.println(andy.pegaSaude());
        System.out.println(andy.humor());
    }





}
