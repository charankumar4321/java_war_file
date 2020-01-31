import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld1 implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld1().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hello World1");
	}
}
