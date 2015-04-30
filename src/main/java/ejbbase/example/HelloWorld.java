package ejbbase.example;

import javax.ejb.Local;

/**
 * Created by kerua on 4/30/2015.
 */

@Local
public interface HelloWorld {

    public String sayHelloWorld();
}
