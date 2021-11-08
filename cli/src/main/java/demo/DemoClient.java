package demo;

import feign.Param;
import feign.RequestLine;

public interface DemoClient {

    @RequestLine("GET /index?name={name}")
    public String getIndex(@Param("name") String name);

}
