package homeSweetHome;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlaylisturiFinal implements Runnable{

    Player playlistSunetePtExamen = null;
    Player playlistJazz = null;
    Player playlistBlues = null;
    Player playlistRock = null;
    Player playlistOldies = null;


    @Override
    public void run() {
        System.out.println("start was called, thread startedv"+Thread.currentThread().getName());
        Set<String> setOfNamesExamen = listFilesUsingFilesList("C:/Users/User/Desktop/CURS JAVA/proiectulMeuFinalBun/directorPlaylistSunetePtExamen");
        Set<String> setOfNames = listFilesUsingFilesList("C:/Users/User/Desktop/CURS JAVA/proiectulMeuFinalBun/directorPlaylistJazz");
        Set<String> setOfNames1 = listFilesUsingFilesList("C:/Users/User/Desktop/CURS JAVA/proiectulMeuFinalBun/directorPlaylistBlues");
        Set<String> setOfNames2 = listFilesUsingFilesList("C:/Users/User/Desktop/CURS JAVA/proiectulMeuFinalBun/directorPlaylistRock");
        Set<String> setOfNames3 = listFilesUsingFilesList("C:/Users/User/Desktop/CURS JAVA/proiectulMeuFinalBun/directorPlaylistOldies");

        System.out.println("nr of files:" + setOfNamesExamen.size());
        System.out.println("nr of files:" + setOfNames.size());
        System.out.println("nr of files:" + setOfNames1.size());
        System.out.println("nr of files:" + setOfNames2.size());
        System.out.println("nr of files:" + setOfNames3.size());

        try {
            for (String mp3Name : setOfNamesExamen) {
                {
                    FileInputStream fis = new FileInputStream(mp3Name);
                    BufferedInputStream b = new BufferedInputStream(fis);
                    // play that file
                    playlistSunetePtExamen = new Player(b);
                    System.out.println(mp3Name);
                    playlistSunetePtExamen.play();
                    Thread.sleep(3000);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }



        try {
            for (String mp3Name : setOfNames) {

                {
                    FileInputStream fis = new FileInputStream(mp3Name);
                    BufferedInputStream b = new BufferedInputStream(fis);
                    // play that file
                    playlistJazz = new Player(b);
                    System.out.println(mp3Name);
                    playlistJazz.play();
                    Thread.sleep(3000);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


        try {
            for (String mp3Name : setOfNames1) {

                {
                    FileInputStream fis = new FileInputStream(mp3Name);
                    BufferedInputStream b = new BufferedInputStream(fis);
                    // play that file
                    playlistBlues = new Player(b);
                    System.out.println(mp3Name);
                    playlistBlues.play();
                    Thread.sleep(3000);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


        try {
            for (String mp3Name : setOfNames2) {

                {
                    FileInputStream fis = new FileInputStream(mp3Name);
                    BufferedInputStream b = new BufferedInputStream(fis);
                    // play that file
                    playlistRock = new Player(b);
                    System.out.println(mp3Name);
                    playlistRock.play();
                    Thread.sleep(3000);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


        try {
            for (String mp3Name : setOfNames3) {

                {
                    FileInputStream fis = new FileInputStream(mp3Name);
                    BufferedInputStream b = new BufferedInputStream(fis);
                    // play that file
                    playlistOldies = new Player(b);
                    System.out.println(mp3Name);
                    playlistOldies.play();
                    Thread.sleep(3000);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static Set listFilesUsingFilesList(String dir) {
        try (Stream<Path> stream = Files.list(Paths.get(dir))) {
            return stream
                    .filter(file -> !Files.isDirectory(file))
                    .map(Path::toAbsolutePath)
                    .map(Path::toString)
                    .collect(Collectors.toSet());
        } catch (IOException exception) {
            exception.printStackTrace();
            return null;

        }
    }

    private  void runplaylistSunetePtExamen() {
    }
    private  void runPlayListJazz() {
    }
    private  void runPlayListBlues() {
    }
    private  void runPlayListRock() {
    }
    private  void runPlayListOldies() {
    }

}
