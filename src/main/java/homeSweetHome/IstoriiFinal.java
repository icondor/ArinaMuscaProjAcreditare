package homeSweetHome;

import java.awt.*;
import java.io.*;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class IstoriiFinal {

    static void istoriiInteresante() {
        File file = new File("C:\\Users\\User\\Desktop\\CURS JAVA\\proiectulMeuFinalBun\\directorPDFuriIstorii"); // folderul unde stasu pdf-urile
        File[] files = file.listFiles();
        assert files != null;
        int option = -2;
        do {

            for (int i = 0; i < files.length; i++) {
                System.out.println(i + " - " + files[i].getName());
            }
            System.out.println("Select a number, -1 to exit");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();

            try {
                if(option>=0 && option<files.length)
                    Desktop.getDesktop().open(files[option]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (option != -1);
    }
}
