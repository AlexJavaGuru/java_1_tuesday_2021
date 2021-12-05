package student_oleg_kozlov.lesson_13.level_7;

import java.util.List;
import java.util.Scanner;

// Task_34
class StorageUI {
    Scanner sc = new Scanner(System.in);

    public void showLocation(List<String> path) {
        String strPath = "";
        if (path.size() == 1) {
            strPath = path.get(0);
        } else {
            for (String s : path) {
                if (strPath.endsWith("/")) {
                    strPath += (s + "/");
                } else {
                    strPath += ("/");
                }

            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Location->" + strPath);
    }
    public void showDirectoryContent(List<Resource> list) {
        for (Resource resource : list) {
            System.out.println(resource);
        }
    }
    public int getProvidedMenuChoice() {
        showMainMenu();
        int choice;
        while (true) {
            System.out.print("Choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= 0 && choice <= 9) {
                    break;
                }
            } catch (NumberFormatException e) {}
            System.out.println("Invalid choice! Please try again.");
        }
        return choice;
    }
    public String getProvidedName() {
        System.out.println("-------------------------------------------------------");
        String name;
        while (true) {
            System.out.print("Name: ");
            try {
                name = sc.nextLine();
                if (!name.isBlank()) {
                    break;
                }
            } catch (Exception e) {}
            System.out.println("Invalid name! Please try again.");
        }
        return name;
    }
    public int getProvidedSize() {
        int size;
        while (true) {
            System.out.print("Size: ");
            try {
                size = Integer.parseInt(sc.nextLine());
                if (size >= 0) {
                    break;
                }
            } catch (NumberFormatException e) {}
            System.out.println("Invalid size! Please try again.");
        }
        return size;
    }
    public void showStorageSize(int size) {
        System.out.println("-------------------------------------------------------");
        System.out.println("Storage size: " + size);
    }
    public void showAllFilesInStorage(List<Resource> files) {
        System.out.println("-------------------------------------------------------");
        for (Resource file : files) {
            System.out.println(file);
        }
    }
    public void showMP3FilesQuantity(int quantity) {
        System.out.println("-------------------------------------------------------");
        System.out.println("MP3 files: " + quantity);
    }
    public void showMessageNotLegalNextDirectory() {
        System.out.println("Rejected! Not legal next directory.");
    }
    private void showMainMenu() {
        System.out.println("-------------------------------------------------------");
        System.out.println("0 - Root directory              1 - Exit");
        System.out.println("2 - Previous directory          3 - Add");
        System.out.println("4 - Next directory              5 - Delete");
        System.out.println("6 - Show directory content      7 - Storage size");
        System.out.println("8 - All files in the storage    9 - MP3 files quantity ");
        System.out.println("-------------------------------------------------------");
    }

}
