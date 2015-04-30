package ejbbase.example;

import org.jboss.arquillian.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

/**
 * Created by kerua on 4/30/2015.
 */

@RunWith(Arquillian.class)
public class HelloWorldBeanTest {

    @EJB
    private HelloWorld helloWorld;

    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(JavaArchive.class, "foo.jar")
                .addClasses(HelloWorldBean.class);
    }

    @Test
    public void testSayHelloWorld() {
        String helloWorldMessage = helloWorld.sayHelloWorld();
        Assert.assertEquals("Message did not match.", "Hello World!", helloWorldMessage);
    }
}