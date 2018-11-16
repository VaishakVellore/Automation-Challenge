import java.io.IOException;

public class Challenge {

    public static void main(String[] args) {
        String url_open ="http://hpa.services/automation-challenge/";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
