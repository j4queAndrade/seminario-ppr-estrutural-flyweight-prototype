import java.util.HashMap;
import java.util.Map;

class CorFlyweightFactory {
    private Map<String, CorFlyweight> flyweights = new HashMap<>();

    public CorFlyweight getFlyweight(String cor) {
        if (!flyweights.containsKey(cor)) {
            System.out.println("Criando um novo Flyweight para a cor: " + cor);
            flyweights.put(cor, new CorFlyweight(cor));
        } else {
            System.out.println("Reutilizando Flyweight existente para a cor: " + cor);
        }
        return flyweights.get(cor);
    }
}

