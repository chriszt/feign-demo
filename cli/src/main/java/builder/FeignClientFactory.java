package builder;

import feign.Feign;
import feign.Logger;
import feign.Retryer;

public abstract class FeignClientFactory {

    static public <T> T create(Class<T> clazz) {
        return Feign.builder()
                .logger(new Logger.ErrorLogger())
                .logLevel(Logger.Level.FULL)
                .retryer(Retryer.NEVER_RETRY)
                .decode404()
                .target(clazz, "http://srv1:8080");
    }

}
