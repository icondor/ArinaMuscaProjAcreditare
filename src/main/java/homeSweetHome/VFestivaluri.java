package homeSweetHome;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class VFestivaluri {
    static void festivaluri() {

        try {
            Path p = Paths.get("C:\\Users\\User\\Desktop\\CURS JAVA\\proiectulMeuFinalBun\\proiectulMeuFinalBun\\src\\main\\java\\homeSweetHome\\listaFestivaluri.txt");
            List<String> lista = Files.readAllLines(p);
            for (String linkuriUtile : lista) {
                URL festivaluri = new URL(linkuriUtile);
                System.out.println(linkuriUtile);
            }

        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException exception){

        }
    }
}
