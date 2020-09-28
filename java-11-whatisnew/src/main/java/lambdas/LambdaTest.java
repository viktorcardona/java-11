package lambdas;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class LambdaTest {

    public static void main(String[] args) {

        // now we can use the var keyword in the argument so we could set it annotations
        Consumer<BigDecimal> moneyConsumer = (@Deprecated var money) -> System.out.println("Money: " + money);


    }
}
