import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Challenge {

    public static void main(String[] args) {
        String url_open ="http://hpa.services/automation-challenge/";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Document doc = Jsoup.connect(url_open).get();
            //doc.select("p").forEach(System.out::println);
            Element pag = doc.getElementById("BoxParagraph1");
            pag.actions.mouseMove(pag).mouseMove(pag).click().perform();
            System.out.println(pag);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
