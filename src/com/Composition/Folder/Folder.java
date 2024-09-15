package com.Composition.Folder;

import com.Composition.File.File;

import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<Folder> subfolders;
    private ArrayList<File> files;

    public Folder(String name) {
        this.name = name;
        this.subfolders = new ArrayList<Folder>();
        this.files = new ArrayList<File>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSubfolder(Folder newFolder) {
        for (Folder subfolder : this.subfolders) {
            if (subfolder.name.equals(newFolder.name)) return;
        }
        this.subfolders.add(newFolder);
    }

    public void deleteSubfolder(String deletedName) {
        this.subfolders.removeIf(subfolder -> subfolder.name.equals(deletedName));
    }

    public void addFile(File newFile) {
        for (File file : this.files) {
            if (file.getName().equals(newFile.getName())) return;
        }
        this.files.add(newFile);
    }

    public void deleteFile(String deletedName) {
        this.files.removeIf(file -> file.getName().equals(deletedName));
    }

    public void printFolder(int tabCount) {
        System.out.println("Folder: " + this.name);
        for (Folder subfolder : this.subfolders) {
            System.out.print("  ".repeat(tabCount));
            subfolder.printFolder(tabCount + 1);
        }
        for (File file : this.files) {
            System.out.print("  ".repeat(tabCount));
            file.printFile();
        }
    }
}
