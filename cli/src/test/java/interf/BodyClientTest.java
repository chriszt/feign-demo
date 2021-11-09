package interf;

import builder.FeignClientFactory;
import model.Person;
import org.junit.Test;

public class BodyClientTest {

    @Test
    public void testBody1() {
        BodyClient client = FeignClientFactory.create(BodyClient.class);
        String ret = client.body1();
        System.out.println(ret);
    }

    @Test
    public void testBody2() {
        BodyClient client = FeignClientFactory.create(BodyClient.class);
        String ret = client.body2("zhangsan");
        System.out.println(ret);
    }

    @Test
    public void testBody3() {
        BodyClient client = FeignClientFactory.create(BodyClient.class);
        String ret = client.body3(new Person());
        System.out.println(ret);
    }

}
