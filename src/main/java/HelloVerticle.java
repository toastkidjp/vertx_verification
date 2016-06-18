import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

/**
 * Hello world powered by Vert.x ver 3.
 * @author Toast kid
 * @see <a href="http://vertx.io/blog/my-first-vert-x-3-application/#let-s-code-">LetÅfs code !</a>
 */
public class HelloVerticle extends AbstractVerticle {

    @Override
    public void start(final Future<Void> future) {
        vertx
            .createHttpServer()
            .requestHandler(r -> 
                r.response().end("<h1>Hello from my first Vert.x 3 application</h1>")
                )
            .listen(8940, result -> {
                if (result.succeeded()) {
                    future.complete();
                } else {
                    future.fail(result.cause());
                }
            });
    }
}
