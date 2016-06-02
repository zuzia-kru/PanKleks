import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Zuzanna on 29/04/2016.
 */
public class main {

    public void main(String[] Args) throws Exception{
        String urlStart = "http://lektury-on-line.strefa.pl/lektury3/akademia_pana_kleksa/";
        String urlEnd = ".htm";
        String urlstr;
        URL url;
        URLConnection uc;
        Document doc;

        for (int i = 1; i<12;i++) {
            urlstr = urlStart + i + urlEnd;
            doc = Jsoup.connect(urlstr).get();
            System.out.println(doc.title());

        }

    }
}
