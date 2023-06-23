public class Funcionario {


    private String nomeFuncionario;
    private double salario;

    public Funcionario (String nomeFuncionario,double salario ){

        this.nomeFuncionario = nomeFuncionario;
        this.salario = salario;

    }

    public String pegaNome() {
        return nomeFuncionario;
    }

    public double pegaSalario() {
        return salario;
    }
    
    public static void main(String[] args){

        Funcionario Func = new Funcionario("Pedro", 10000);
        System.out.println("Nome: " + Func.pegaNome() + ", Salário: " +Func.pegaSalario());

    }
}

    



