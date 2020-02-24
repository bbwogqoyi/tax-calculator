import io.javalin.Javalin;

public class server {
  public static void main(String[] args) {
    Javalin app = Javalin.create(
      config -> config.addStaticFiles("/public")
    ).start(8080);


  }
}
