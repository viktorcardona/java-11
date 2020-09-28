package script;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptTest {

    public static void main(String[] args) throws ScriptException {
        // JavaSript Engine Nashorn:
        // Nashorn engine is planned to be removed from a future JDK release

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("print('Hello from script!')");

        // Java is becoming like a scripting since now we are able to run a Java class doing just:
        // java StringTest.java

    }
}
