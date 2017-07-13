package threads.runable;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class OpenUrlThread implements Runnable {
    @Override
    public void run() {
        Desktop desktop = Desktop.getDesktop();
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            openUrl("www.google.lt", desktop);
            openUrl("www.facebook.com", desktop);
        }
    }

    private void openUrl(String url, Desktop desktop) {

        try {
            desktop.browse(new URI(url));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}