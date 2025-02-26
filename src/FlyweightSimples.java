public class FlyweightSimples {
   
    public static void main(String[] args) {
    
        CorFlyweightFactory factory = new CorFlyweightFactory();

        CorFlyweight vermelho = factory.getFlyweight("Vermelho");
        CorFlyweight azul = factory.getFlyweight("Azul");
        CorFlyweight vermelho2 = factory.getFlyweight("Vermelho"); 

        vermelho.desenhar(10, 20); 
        azul.desenhar(30, 40);    
        vermelho2.desenhar(50, 60); 
    }
}

