package co.demo.greeterserver.nl;

import co.demo.greeterserver.GreeterServer;
import java.util.List;

public class NlGreeterServer implements GreeterServer {

    private static final List<String> greets = List.of(
            "Hallo",
            "Hoe gaat het met jou?",
            "Vriendelijke groeten en de beste wensen aan jou",
            "Dierbare groeten voor u allen",
            "hoe gaat het?",
            "Welkom",
            "wat fijn je weer te zien",
            "wat is er nieuw?",
            "Hey maatje!",
            "tijd zonder je te zien, hoe goed je weer te zien",
            "Ik ben blij je te zien, ik nodig je uit om een biertje te komen drinken"
    );

    @Override
    public String getGreet() {
        return greets.get(getRandomIndex(greets.size(), 0));
    }

    @Override
    public String language() {
        return "Netherlands";
    }

    private int getRandomIndex(int maximum, int minimum){ 
        return ((int) (Math.random() * (maximum - minimum))) + minimum; 
    }
}
