//package Java9;
//
//import java.io.File;
//import java.net.URI;
//import jdk.incubator.http.HttpClient;
//import jdk.incubator.http.HttpRequest;
//import jdk.incubator.http.HttpResponse;
//
//public class PostReqHttp2ClientUpload {
//
//    public static void main(String[] args) {
//
//        try {
//            File file = new File("src/data/a.txt");
//            HttpClient httpClient = HttpClient.newHttpClient();
//            HttpRequest httpRequest = HttpRequest.newBuilder()
//                    .uri(new URI("http://localhost:8080/myserver/api/demo/show"))
//                    .POST(HttpRequest.BodyProcessor.fromFile(file.toPath()))
//                    .build();
//            HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandler.asString());
//            System.out.println("Status Code: " + httpResponse.statusCode());
//            System.out.println("Content: " + httpResponse.body());
//        } catch (Exception e) {
//            System.err.println("Error: " + e.getMessage());
//        }
//
//    }
//}
