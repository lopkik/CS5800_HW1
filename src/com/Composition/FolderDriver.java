package com.Composition;

import com.Composition.File.File;
import com.Composition.Folder.Folder;

public class FolderDriver {
    public static void main(String[] args) {
        // Step 1
        Folder sourceFiles = new Folder("Source Files");
        sourceFiles.addSubfolder(new Folder(".phalcon"));

        Folder app = new Folder("app");
        app.addSubfolder(new Folder("config"));
        app.addSubfolder(new Folder("controllers"));
        app.addSubfolder(new Folder("library"));
        app.addSubfolder(new Folder("migrations"));
        app.addSubfolder(new Folder("models"));
        app.addSubfolder(new Folder("views"));
        sourceFiles.addSubfolder(app);

        sourceFiles.addSubfolder(new Folder("cache"));
        sourceFiles.addSubfolder(new Folder("public"));
        sourceFiles.addFile(new File(".htaccess"));
        sourceFiles.addFile(new File(".htrouter.php"));
        sourceFiles.addFile(new File("index.html"));

        Folder phpDemo = new Folder("php_demo1");
        phpDemo.addSubfolder(sourceFiles);
        phpDemo.addSubfolder(new Folder("Include Path"));
        phpDemo.addSubfolder(new Folder("Remote Files"));

        System.out.println("Step 1:");
        phpDemo.printFolder(1);

        // Step 2
        sourceFiles.deleteSubfolder("app");
        System.out.println("\nStep 2:");
        phpDemo.printFolder(1);

        // Step 3
        sourceFiles.deleteSubfolder("public");
        System.out.println("\nStep 3:");
        phpDemo.printFolder(1);
    }
}
