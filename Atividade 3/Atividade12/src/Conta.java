public class Conta {

            private int numeroConta;
            private String nome;
            protected float saldoConta;

    public Conta(int numeroConta, String nome, float saldoConta){

                this.numeroConta = numeroConta;
                this.nome = nome;
                this.saldoConta = saldoConta;
    }

    public Conta(int numeroConta, String nome){

    this.numeroConta = numeroConta;
    this.nome = nome;
    this.saldoConta = 0.0f;

    }

    public void mudaNome(String nome) {
        this.nome = nome;
    }

    public void deposito(float valor) {
        this.saldoConta += valor;

    }

    public void saque(float valor) {

        if (this.saldoConta >= valor) {
        this.saldoConta -= valor;
        }
    }


    public String conveString() {

        return "numero=" + numeroConta + ", nome=" + nome + ", saldo=" + saldoConta;

        }

        public class ContaInvestimento extends Conta{

        private float taxaJuros;

        public ContaInvestimento(int numeroConta, String nome, float saldoConta, float taxaJuros){

            super(numeroConta, nome, saldoConta);
            this.taxaJuros = taxaJuros;

        }

        public void adicioneJuros() {

            this.saldoConta += (this.saldoConta * this.taxaJuros/100);

        }


        public String conveString() {

            return "ContaInvestimento [taxaJuros=" + taxaJuros + ", saldo=" + saldoConta + "]";

        }
    
    


    }

    public static void main(String[] args){

        Conta poupanca = new Conta(123, "Jose", 1000);
        Conta.ContaInvestimento  contaInvestimento = poupanca.new ContaInvestimento(123, "Jose", 1000, 10);

        System.out.println(contaInvestimento.conveString());
        contaInvestimento.adicioneJuros();
        contaInvestimento.adicioneJuros();
        contaInvestimento.adicioneJuros();
        contaInvestimento.adicioneJuros();
        contaInvestimento.adicioneJuros();
        System.out.println(contaInvestimento.conveString());
    }



    



}

