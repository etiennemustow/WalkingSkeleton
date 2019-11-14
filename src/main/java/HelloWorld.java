import org.apache.log4j.BasicConfigurator;
import spark.Spark;

import static spark.Spark.get;

public class HelloWorld {

    public static final int DEFAULT_PORT = 4567;

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Spark.port(getPort());
        get("/hello", (req, res) -> "Hello World");
    }

    private static int getPort() {
        String port = System.getenv("PORT");
        if (port != null)
            return Integer.parseInt(port);
        return DEFAULT_PORT;
    }

}