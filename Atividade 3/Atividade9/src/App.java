
class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void imprimir() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class Retangulo {
    private int largura;
    private int altura;
    private Ponto pontoInicial;

    public Retangulo(int largura, int altura, Ponto pontoInicial) {
        this.largura = largura;
        this.altura = altura;
        this.pontoInicial = pontoInicial;
    }

    public Ponto encontrarCentro() {
        int centroX = pontoInicial.getX() + largura / 2;
        int centroY = pontoInicial.getY() + altura / 2;
        return new Ponto(centroX, centroY);
    }

    public Ponto getPontoInicial() {
        return pontoInicial;
    }

    public void setPontoInicial(Ponto pontoInicial) {
        this.pontoInicial = pontoInicial;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}

class Main {
    public static void main(String[] args) {
        Ponto pontoInicial = new Ponto(0, 0);
        Retangulo retangulo = new Retangulo(10, 5, pontoInicial);

        System.out.println("Valores iniciais do retângulo:");
        System.out.println("Ponto Inicial: ");
        pontoInicial.imprimir();
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());

        Ponto novoPontoInicial = new Ponto(2, 2);
        int novaLargura = 8;
        int novaAltura = 6;

        retangulo.setPontoInicial(novoPontoInicial);
        retangulo.setLargura(novaLargura);
        retangulo.setAltura(novaAltura);

        System.out.println("\nNovos valores do retângulo:");
        System.out.println("Ponto Inicial: ");
        novoPontoInicial.imprimir();
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());

        Ponto centro = retangulo.encontrarCentro();
        System.out.println("\nCentro do retângulo:");
        centro.imprimir();
    }
}
