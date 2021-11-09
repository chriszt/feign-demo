package interf;

import org.junit.Test;

import builder.FeignClientFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class ReqLineClientTest {

    @Test
    public void testReqLine1() {
        ReqLineClient client = FeignClientFactory.create(ReqLineClient.class);
        String ret = client.reqLine1("zhangsan");
        System.out.println(ret);
    }

    @Test
    public void testReqLine2() {
        ReqLineClient client = FeignClientFactory.create(ReqLineClient.class);
        String ret = client.reqLine2("zhangsan");
        System.out.println(ret);
    }

    @Test
    public void testReqLine3() {
        Map<String, Object> params = new HashMap<>();
        params.put("name", "zhangsan");
        params.put("age", 18);
        params.put("courses", Arrays.asList("Chinese", "Math", "English"));

        ReqLineClient client = FeignClientFactory.create(ReqLineClient.class);
        String ret = client.reqLine3(params);
        System.out.println(ret);
    }

    @Test
    public void testReqLine4() {
        ReqLineClient client = FeignClientFactory.create(ReqLineClient.class);
        String ret = client.reqLine4("zhangsan");
        System.out.println(ret);
    }

    @Test
    public void testReqLine5() {
        ReqLineClient client = FeignClientFactory.create(ReqLineClient.class);
        String ret = client.reqLine5("zhangsan");
        System.out.println(ret);
    }

//    @Test
//    public void testReqLine6() {
//        ReqLineClient client = FeignClientFactory.create(ReqLineClient.class);
//        String ret = client.reqLine6("zhangsan", 18);
//        System.out.println(ret);
//    }

//    @Test
//    public void testReqLine7() {
//        ReqLineClient client = FeignClientFactory.create(ReqLineClient.class);
//        String ret = client.reqLine7("zhangsan", 18);
//        System.out.println(ret);
//    }

    @Test
    public void testReqLine8() {
        ReqLineClient client = FeignClientFactory.create(ReqLineClient.class);
        String ret = client.reqLine8("zhangsan", 18);
        System.out.println(ret);
    }

    @Test
    public void testReqLine9() {
        ReqLineClient client = FeignClientFactory.create(ReqLineClient.class);
        String ret = client.reqLine9("zhangsan", 18);
        System.out.println(ret);
    }

}
