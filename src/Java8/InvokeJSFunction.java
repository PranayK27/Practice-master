package Java8;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class InvokeJSFunction {
    public static void main(String[] args) {

        try {
            ScriptEngine se = new ScriptEngineManager()
                    .getEngineByName("nashorn");

            se.eval(new FileReader("Practice-master\\src\\Java8\\LambdaExpression\\demotoJS.js"));

            Invocable i1 = (Invocable)se;

            i1.invokeFunction("fn1", "Kevin");

            Invocable i2 = (Invocable)se;

            i2.invokeFunction("fn2", 1, 2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
