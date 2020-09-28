package co.demo.greeterserver.en;

import co.demo.greeterserver.GreeterServer;

import java.util.List;


public class EnGreeterServer implements GreeterServer {
    
    private static final List<String> greets = List.of(
            "Hello",
            "How are you?",
            "Hey buddy!",
            "Hey my little dog",
            "What's up?",
            "How is everything?",
            "Welcome",
            "Cheers",
            "Nice to see you",
            "How’s it going?"
    );

    @Override
    public String getGreet() {
        return greets.get(getRandomIndex(greets.size(), 0));
    }

    @Override
    public String language() {
        return "English";
    }

    private int getRandomIndex(int maximum, int minimum){ 
        return ((int) (Math.random() * (maximum - minimum))) + minimum; 
    }

}
