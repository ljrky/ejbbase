package ejbbase.example;

import javax.ejb.Stateless;

/**
 * Created by kerua on 4/30/2015.
 */

@Stateless
public class HelloWorldBean implements HelloWorld {

    /**
     * Returns a hello message to the caller
     *
     * @return String
     */
    @Override
    public String sayHelloWorld() {

        return "Hello World!";
    }
}
