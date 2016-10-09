import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;

/**
 * Created by Zuzanna on 29/04/2016.
 */
public class PanKleks {

    public static void main(String[] args) throws Exception {
        final String urlStart = "http://lektury-on-line.strefa.pl/lektury3/akademia_pana_kleksa/";
        final String urlEnd = ".htm";
        String url, text;
        Document doc;
        File file = new File("Jan Brzechwa - Akademia Pana Kleksa.txt");
        Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), "UTF-8"));

        for (int i = 1; i < 12; i++) {
            url = urlStart + i + urlEnd;
            doc = Jsoup.connect(url).get();
            text = doc.body().text();
            text = text.replaceAll("(JAN BRZECHWA( -)? Akademia Pana Kleksa Powr.t )?Wybierz rozdzia. ([0-9]([0-9])?..)*", "");
            try {
                writer.append(text);
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return;

    }
}
