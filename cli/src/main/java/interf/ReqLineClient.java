package interf;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface ReqLineClient {

    @RequestLine("GET /demo1?name={name}")
    @Headers({"Accept: */*", "Accept-Language: zh-cn"})
    public String reqLine1(@Param("name") String name);

    @RequestLine("GET     /demo1?name={name}")
    public String reqLine2(@Param("name") String name);

}
