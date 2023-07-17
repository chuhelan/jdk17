import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @Author：chuhelan
 * @Package：PACKAGE_NAME
 * @Project：jdk17
 * @name：GetHttpPic
 * @Date：7/17/2023 2:47 PM
 * @Filename：GetHttpPic
 */
public class GetHttpPic {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        for (int i = 0; i < 10; i++) {
            HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://pic.netbian.com/tupian/" + (29327 + i) + ".html")).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String html = response.body();

            String prefix = "<a href=\"\" id=\"img\"><img src=\"";//先找好我们要截取的前面一段，作为前缀去匹配位置
            String suffix = "\" data-pic=";//再找好我们需要截取的屁股后面紧接着的位置
            //直接定位，然后前后截取，得到最终的图片地址
            html = html.substring(html.indexOf(prefix) + prefix.length());
            html = html.substring(0, html.indexOf(suffix));
            System.out.println(html);//最终的图片地址就有了

            //创建请求，把图片取到
            HttpRequest imageRequest = HttpRequest.newBuilder().uri(new URI("https://pic.netbian.com" + html)).build();
            //这里以输入流的方式获取，不过貌似可以直接下载文件
            HttpResponse<InputStream> imageResponse = client.send(imageRequest, HttpResponse.BodyHandlers.ofInputStream());
            //拿到输入流和文件输出流
            InputStream imageInput = imageResponse.body();
            FileOutputStream stream = new FileOutputStream("images/" + i + ".jpg");//一会儿要保存的格式
            try (stream; imageInput) {//直接把要close的变量放进来就行，简介一些
                int size;
                byte[] data = new byte[1024];
                while ((size = imageInput.read(data)) > 0) {
                    stream.write(data, 0, size);
                }
            }
        }
    }
}
