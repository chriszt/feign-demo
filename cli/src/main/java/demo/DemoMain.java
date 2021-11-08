package demo;

import feign.Feign;

public class DemoMain {

    public static void main(String[] args) {
        DemoClient client = Feign.builder().target(DemoClient.class, "http://srv1:8080");
        String ret = client.getIndex("zhangsan");
        System.out.println(ret);
    }

}
