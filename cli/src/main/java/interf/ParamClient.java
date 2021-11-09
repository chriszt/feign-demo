package interf;

import feign.Param;
import feign.RequestLine;

import java.util.Collection;

public interface ParamClient {

    @RequestLine("GET /demo2?name={name}")
    String param1(@Param("name") String[] names);

    @RequestLine("GET /demo2?name={name}")
    String param2(@Param("name") Collection<String> names);

    @RequestLine("GET /demo2?name={name}")
    String param3(@Param("name") String name);

}
