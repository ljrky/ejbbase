package ejbbase.example;

import javax.ejb.Stateless;

/**
 * HelloUserBean
 * @author keyu
 */
@Stateless
public class HelloUserBean implements HelloUser {

    /**
     * Returns a hello message to the caller
     * @param name - name
     * @return String
     */
    public String sayHello(String name) {
        return "Hello " + name + " welcome to EJB!";
    }

}

