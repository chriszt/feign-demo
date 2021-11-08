package interf;

import feign.Param;
import feign.RequestLine;

public interface ReqLineClient {

    @RequestLine("GET /demo1?name={name}")
    public String reqLine1(@Param("name") String name);

}
