package interf;

import feign.Body;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import model.Person;

public interface BodyClient {

    @RequestLine("POST /demo3")
    @Body("{\"name\":\"zhangsan\"}")
    String body1();

    @RequestLine("POST /demo3")
    @Body("{body}")
    String body2(@Param("body") String body);

    @RequestLine("POST /demo3")
    @Body("{person}")
    String body3(@Param("person") Person person);

}
