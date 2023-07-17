import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @Author：chuhelan
 * @Package：PACKAGE_NAME
 * @Project：jdk17
 * @name：HttpClient
 * @Date：7/17/2023 2:35 PM
 * @Filename：HttpClient
 */
public class HttpApi {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        var client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder(new URI("https://www.chuhelan.com"))
                .GET().version(HttpClient.Version.HTTP_2)
                .build();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
