import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Challenge {

    public static void main(String[] args) {
        String url_open ="http://hpa.services/automation-challenge/";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
            Document doc = Jsoup.connect("http://hpa.services/automation-challenge/").get();
            doc.select("p").forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
