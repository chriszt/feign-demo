package interf;

import feign.*;

import java.util.Map;

public interface ReqLineClient {

    @RequestLine("GET /demo1?name={name}")
    @Headers({"Accept: */*", "Accept-Language: zh-cn"})
    String reqLine1(@Param("name") String name);

    @RequestLine("GET     /demo1?name={name}")
    String reqLine2(@Param("name") String name);

    @RequestLine("GET /demo1")
    String reqLine3(@QueryMap Map<String, Object> params);

    @RequestLine("GET /demo1")
    String reqLine4(String name);

    @RequestLine("GET /demo1")
    @Body("{name}")
    String reqLine5(@Param("name") String name);

    // java.lang.IllegalStateException: Method has too many Body parameters:
//    @RequestLine("GET /demo1")
//    String reqLine6(String name, Integer age);

    // java.lang.IllegalStateException: Body parameters cannot be used with form parameters.
//    @RequestLine("GET /demo1")
//    @Body("{name}")
//    String reqLine7(@Param("name") String name, Integer age);

    @RequestLine("GET /demo1?name={name}")
    @Body("{age}")
    String reqLine8(@Param("name") String name, @Param("age") Integer age);

    // TODO: {"name":"zhangsan","age"}
    @RequestLine("GET /demo1")
    @Headers({"content-type: application/json"})
    @Body("{\"name\":\"zhangsan\",\"age\":18}")
    String reqLine9(@Param("name") String name, @Param("age") Integer age);

}
