package interf;

import builder.FeignClientFactory;
import org.junit.Test;

import java.util.Arrays;

public class ParamClientTest {

    @Test
    public void testParam1() {
        ParamClient client = FeignClientFactory.create(ParamClient.class);
        String ret = client.param1(new String[]{"aaa", "bbb", "ccc"});
        System.out.println(ret);
    }

    @Test
    public void testParam2() {
        ParamClient client = FeignClientFactory.create(ParamClient.class);
        String ret = client.param2(Arrays.asList("aaa", "bbb", "ccc"));
        System.out.println(ret);
    }

    @Test
    public void testParam3() {
        ParamClient client = FeignClientFactory.create(ParamClient.class);
        String ret = client.param3("/?zhangsan/");
        System.out.println(ret);
    }

}
