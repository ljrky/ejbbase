package ejbbase.example;

import javax.ejb.Local;

/**
 * Local interface for this bean.
 */
@Local
public interface HelloUser {

    public String sayHello(String name);

}
