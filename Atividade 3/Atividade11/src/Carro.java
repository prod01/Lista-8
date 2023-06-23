
class Carro {

  private double  consumoMedio;
  private double  combustivelTanque;

  public Carro (double  consumoMedio){

    this.consumoMedio = consumoMedio;
    combustivelTanque = 0;
    
  }

  public void andar(double distancia){

   double trip = this.consumoMedio / distancia;

      if (trip <= this.combustivelTanque) {
            this.combustivelTanque -= trip;
            System.out.println("O veículo percorreu " + distancia + " km.");
        } else {
            System.out.println("O veículo não possui combustível suficiente");
            System.out.println("Pessa ajuda");
        }
    
  }



  public  double  nivelCombustiovel(){

    return this.combustivelTanque;
      
  }

  public void abastecer(double litrosAbastecidos){

      this.combustivelTanque = litrosAbastecidos + this.combustivelTanque;
    
  }


  
    public static void main(String[] args) {
          Carro Goleta = new Carro(15); 
          Goleta.abastecer(20);
          Goleta.andar(100);
          System.out.println("Combustível restante: " + Goleta.nivelCombustiovel()+ "    litros.");


   }


  
}

