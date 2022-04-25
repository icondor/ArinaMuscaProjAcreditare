package homeSweetHome;

import java.io.*;

public class IVIstoriiInteresante {
    //public static void main(String[ ] args) {
    static void istorii(){
        File file = new File("C:\\Users\\User\\Desktop\\CURS JAVA\\proiectulMeuFinalBun\\directorPDFuriIstorii");
        File[] files = file.listFiles();
        assert files != null;
        for (File f : files) {
            System.out.println(f.getName());
        }
        try {
            if ((new File("c:\\Users\\User\\Desktop\\CURS JAVA\\proiectulMeuFinalBun\\proiectulMeuFinalBun\\BBK-Biography-Website.pdf")).exists()) {

                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler c:\\Users\\User\\Desktop\\CURS JAVA\\proiectulMeuFinalBun\\proiectulMeuFinalBun\\BBK-Biography-Website.pdf");
                p.waitFor();
                if ((new File("c:\\Users\\User\\Desktop\\CURS JAVA\\proiectulMeuFinalBun\\proiectulMeuFinalBun\\Davis with Troupe-The Autobiography.pdf")).exists()) {

                    Process p2 = Runtime
                            .getRuntime()
                            .exec("rundll32 url.dll,FileProtocolHandler c:\\Users\\User\\Desktop\\CURS JAVA\\proiectulMeuFinalBun\\proiectulMeuFinalBun\\Davis with Troupe-The Autobiography.pdf");
                    p2.waitFor();
                    if ((new File("c:\\Users\\User\\Desktop\\CURS JAVA\\proiectulMeuFinalBun\\proiectulMeuFinalBun\\pdfslide.net_bb-king-blues-master-i-bookpdf.pdf")).exists()) {

                        Process p3 = Runtime
                                .getRuntime()
                                .exec("rundll32 url.dll,FileProtocolHandler c:\\Users\\User\\Desktop\\CURS JAVA\\proiectulMeuFinalBun\\proiectulMeuFinalBun\\pdfslide.net_bb-king-blues-master-i-bookpdf.pdf");
                        p3.waitFor();
                    } else {

                        System.out.println("File is not exists");
                    }
                    System.out.println("Done");
                }
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }}

