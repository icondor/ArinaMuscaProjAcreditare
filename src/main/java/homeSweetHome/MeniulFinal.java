package homeSweetHome;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static homeSweetHome.IIIConcerteMemorabile.concerte;
import static homeSweetHome.IRadiouri.radiouri;
import static homeSweetHome.IVIstoriiInteresante.istorii;
import static homeSweetHome.IstoriiFinal.istoriiInteresante;
import static homeSweetHome.VFestivaluri.festivaluri;



public class MeniulFinal {
    private static ExecutorService executorService = Executors.newFixedThreadPool(2);
    public static void main(String[] args) {
        int o;

        do{
            System.out.println("1 Radiouri");
            System.out.println("2 Playlisturi");
            System.out.println("3 Concerte Memorabile");
            System.out.println("4 Istorii Interesante");
            System.out.println("5 Linkuri festivaluri viitoare");
            System.out.println("6 Stop playlist ");
            System.out.println("7 Exit ");
            o=new Scanner(System.in).nextInt();
            new MeniulFinal().metodaMeniu(o);
        }
        while (o !=10);
    }
    void metodaMeniu (int m) {

        switch (m){ case 1:System.out.println("I Radiouri");
            radiouri();  break;//aici, inainte de break tb sa inserez alt meniu cu referire la clasa
            //  corespunzatoare (cu aducerea metodei)?
            case 2: System.out.println("II Playlisturi");

                executorService= Executors.newSingleThreadExecutor();

                PlaylisturiFinal task = new PlaylisturiFinal();

                Future future = executorService.submit(task);
                break;

            case 3: System.out.println("III Concerte Memorabile");
                concerte(); break;
            case 4: System.out.println("IV Istorii Interesante");
                istoriiInteresante(); break;
            case 5: System.out.println ("V Linkuri festivaluri viitoare");
                festivaluri();break;
            case 6: System.out.println("Stop the playlist command"); // stop music de unde apelez pt acel obiect metoda interrupt …
                executorService.shutdown();
                try {
                    if (!executorService.awaitTermination(80, TimeUnit.MILLISECONDS)) {
                        System.out.println("stop doar la finalul unei melodii");
                        executorService.shutdownNow();
                    }
                } catch (InterruptedException e) {
                    executorService.shutdownNow();
                }; break;
            //case 7: System.out.println("IES LA PLIMBARE!"); break;
            default: System.out.println("IES LA PLIMBARE!"); break;


        }
    }

}


