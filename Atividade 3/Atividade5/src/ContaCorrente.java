public class ContaCorrente {
    
    private String nome;
    private double saldo;
    private int numeroDaConta;
    
    
        public ContaCorrente(String nome,double saldo, int numeroDaConta){

                this.numeroDaConta = numeroDaConta;
                this.nome = nome;
                this.saldo = saldo;

        }

         public ContaCorrente(String nome, int numeroDaConta){

                this.numeroDaConta = numeroDaConta;
                this.nome = nome;
                this.saldo = 0.0f;

        }

        public void alterarNome(String nome){
                
                this.nome = nome;
                

        }

        public  void deposito(float valor){
                
                this.saldo += valor;
                

        }

        public  void saque(float valor){
                
                if (this.saldo>= valor){

                        this.saldo -= valor;
                }
                
        }

        @Override
        public String toString() {
                return "numero:" + numeroDaConta + ", nome:" + nome + ", saldo:" + saldo ;
        }

        public static void main(String[] args) {
                ContaCorrente teste = new ContaCorrente("José",100.0f, 010102 );
                System.out.println(teste.toString());
                teste.alterarNome("Ana");
                teste.deposito(200);
                System.out.println(teste.toString());
                teste.saque(114);
                System.out.println(teste.toString());
}
    
}
