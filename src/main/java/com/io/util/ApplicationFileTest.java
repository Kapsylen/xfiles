package com.io.util;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;

public class ApplicationFileTest {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Sebastian\\dest");

        FileHandler fileHandlerTest = new FileHandlerTest();

        FileWatcher fileWatcher = new FileWatcher(path, fileHandlerTest,false, StandardWatchEventKinds.ENTRY_CREATE); //For non-recursive polling

        fileWatcher.run();
    }

}
