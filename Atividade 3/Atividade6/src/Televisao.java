public class Televisao {

    private int volume;
    private int canal;

    public Televisao(int volume, int canal){

        this.volume = volume;
        this.canal = canal;

        
    }

    public void mudarCanal(int canal) {
        if ((canal > 0 ) && (canal <= 100))
        this.canal = canal;
    }

    public void aumentarVolume() {
        if (volume < 100)
        this.volume++;
    }

    public void diminuirVolume() {
        if (volume > 0)
        this.volume--;
    }


    @Override
    public String toString() {
        return "Tv [volume=" + volume + ", canal=" + canal + "]";
    }

    public static void main(String[] args) {

        Televisao televisao = new Televisao(23 , 12);
        System.out.println(televisao.toString());
        televisao.mudarCanal(07);
        System.out.println(televisao.toString());
        televisao.aumentarVolume();
        System.out.println(televisao.toString());
        televisao.diminuirVolume();
        System.out.println(televisao.toString());
    }






}

