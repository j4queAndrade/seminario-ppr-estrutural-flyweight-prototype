public class CorFlyweight {
    
    private String cor; 

    public CorFlyweight(String cor) {
        this.cor = cor;
    }
    
    public void desenhar(int x, int y) {
        System.out.println("Desenhando uma forma na cor " + cor + " na posição (" + x + ", " + y + ")");
    }
}

