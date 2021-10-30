package student_oleg_kozlov.lesson_13.level_7;

import java.util.ArrayList;
import java.util.List;

// Task_34
class StorageDemo {
    StorageUI ui;
    Storage storage;
    Directory base;
    List<String> path;

    public static void main(String[] args) {
        StorageDemo storageDemo = new StorageDemo();
        storageDemo.run();
    }

    private void run() {
        initWorkItems();
        int choice;

        while (true) {
            ui.showLocation(path);
            choice = ui.getProvidedMenuChoice();
            if (choice == 1) {
                break;
            }
            processChoice(choice);
        }
    }

    private void initWorkItems() {
        ui = new StorageUI();
        storage = new Storage();
        base = storage.rootDirectory();
        path = new ArrayList<>();
        path.add(base.getName());
    }

    private void processChoice(int choice) {
        Directory currentDir;
        switch (choice) {
            case 0:
                path.clear();
                path.add(base.getName());
                break;
            case 2:
                if (path.size() < 2) {
                    break;
                }
                path.remove(path.size() - 1);
                currentDir = getCurrentDirectory();
                ui.showDirectoryContent(currentDir.getContent());
                break;
            case 3:
                currentDir = getCurrentDirectory();
                try {
                    currentDir.add(getResourceFromUser());
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
                ui.showDirectoryContent(currentDir.getContent());
                break;
            case 4:
                String nextDirName = ui.getProvidedName();
                if (!isLegalNextDirectory(nextDirName)) {
                    ui.showMessageNotLegalNextDirectory();
                    break;
                }
                path.add(nextDirName);
                currentDir = getCurrentDirectory();
                ui.showDirectoryContent(currentDir.getContent());
                break;
            case 5:
                currentDir = getCurrentDirectory();
                try {
                    currentDir.delete(getResourceFromUser());
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
                ui.showDirectoryContent(currentDir.getContent());
                break;
            case 6:
                currentDir = getCurrentDirectory();
                ui.showDirectoryContent(currentDir.getContent());
                break;
            case 7:
                ui.showStorageSize(storage.totalSize());
                break;
            case 8:
                ui.showAllFilesInStorage(storage.getAllFiles(null, base));
                break;
            case 9:
                ui.showMP3FilesQuantity(storage.totalMP3());
                break;
            default:
        }
    }

    private Resource getResourceFromUser() {
        String name = ui.getProvidedName();
        if (!isFile(name)) {
            return new Directory(name);
        }
        int size = ui.getProvidedSize();
        return new File(name, size);
    }
    private Directory getCurrentDirectory() {
        String currentDirName = path.get(path.size() - 1);
        return storage.getDirectoryByName(currentDirName);
    }
    private boolean isFile(String name) {
        return name.contains(".");
    }
    private boolean isLegalNextDirectory(String name) {
        Directory currentDir = getCurrentDirectory();
        Directory nextDir = storage.getDirectoryByName(name);
        return currentDir.getContent().contains(nextDir);
    }
}
