package interf;

import org.junit.Test;

import builder.FeignClientFactory;


public class ReqLineClientTest {

    @Test
    public void testReqLine1() {
        ReqLineClient client = FeignClientFactory.create(ReqLineClient.class);
        String ret = client.reqLine1("zhangsan");
        System.out.println(ret);
    }

}
