import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Challenge {

    public static void main(String[] args) {
        String blogUrl = "http://hpa.services/automation-challenge/";
        try {
            Document doc = Jsoup.connect(blogUrl).get();
            doc.select("p").forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
