package co.demo.greeterserver.es;

import co.demo.greeterserver.GreeterServer;
import java.util.List;

public class EsGreeterServer implements GreeterServer {

    private static final List<String> greets = List.of(
            "Hola",
            "Espero se encuentre muy bien",
            "Qué haces?",
            "Tonces",
            "Qué cuentas?",
            "Bienvenido",
            "Cómo va todo?",
            "Hey parcero",
            "Qué hay de nuevo?",
            "Qué alegría verte de nuevo",
            "Hola, te invito una cerveza",
            "Tiempo sin verte"
    );

    @Override
    public String getGreet() {
        return greets.get(getRandomIndex(greets.size(), 0));
    }

    @Override
    public String language() {
        return "Español";
    }

    private int getRandomIndex(int maximum, int minimum){ 
        return ((int) (Math.random() * (maximum - minimum))) + minimum; 
    }
}
