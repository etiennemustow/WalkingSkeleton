import org.junit.jupiter.api.AfterAll;
        import org.junit.jupiter.api.BeforeAll;
        import org.junit.jupiter.api.Test;
        import spark.route.Routes;

        import static org.junit.jupiter.api.Assertions.assertEquals;
        import static spark.Spark.awaitInitialization;
        import static spark.Spark.stop;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        String testUrl = "/hello";

        assertEquals("/hello", testUrl);
    }


}
