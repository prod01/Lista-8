public class BombaCombustivel {


    private String tipoCombustivel;
    private float valorLitro;
    private float quantidadeCombustivel;


    
    public BombaCombustivel (String tipoCombustivel, float valorLitro, float quantidadeCombustivel){

        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;

    }


    public double abastecerPorValor (float valortotal ){

        double litrosAbastecidos = valorLitro * valortotal;

        return litrosAbastecidos;

    }

    public double  abastecerPorLitro (float litrosAbastecidos){

        double valortotal = valorLitro * litrosAbastecidos;

        return valortotal;

    }

    public void alterarValor (float valorLitro){
            
        this.valorLitro = valorLitro;

    }

    public void alterarCombustivel (String tipoCombustivel){

        this.tipoCombustivel = tipoCombustivel;
    }

    public String retornaCombustivel(){

        return this.tipoCombustivel ;
        
    }

    public void alterarQuantidadeCombustivel (float quantidadeCombustivel){
                
        this.quantidadeCombustivel = quantidadeCombustivel;
  
    }

    public static void main(String[] args){

            BombaCombustivel a1 = new BombaCombustivel("Gasolina", 5, 500);
            System.out.println(a1.abastecerPorValor(150));
            System.out.println(a1.quantidadeCombustivel);
            a1.alterarCombustivel("Alcol");
            System.out.println(a1.retornaCombustivel());
            System.out.println(a1.quantidadeCombustivel);
            System.out.println(a1.abastecerPorLitro(30));
            System.out.println(a1.quantidadeCombustivel);
    }

    




}
