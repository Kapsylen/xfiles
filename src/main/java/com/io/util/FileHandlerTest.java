package com.io.util;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.util.logging.Level;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import static junit.framework.TestCase.assertTrue;

public class FileHandlerTest implements FileHandler {

    @Override
    public void handle(File file, WatchEvent.Kind<?> fileEvent) throws InterruptedException {
       // LOGGER.log(Level.INFO,"Handler is triggered for file {0}",file.getPath());
        if(fileEvent == StandardWatchEventKinds.ENTRY_CREATE) {
            try {
                //Call SPAR and retrieve address by personId
                System.out.println(file.getName());
                 Files.deleteIfExists(Paths.get(file.getPath()));
                //boolean deleted = Files.deleteIfExists(Paths.get(file.getPath()));
                //assertTrue(deleted);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
