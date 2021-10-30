package student_oleg_kozlov.lesson_13.level_7;

import java.util.ArrayList;
import java.util.List;

// Task_34
class Storage {
    private final Directory base;

    public Storage() {
        this.base = new Directory("/");
    }

    public Directory rootDirectory() {
        return this.base;
    }

    public int totalSize() {
        List<Resource> files = getAllFiles(null, base);
        int result = 0;
        for (Resource file : files) {
            result += ((File)file).getSize();
        }
        return result;
    }

    public int totalMP3() {
        List<Resource> files = getAllFiles(null, base);
        int result = 0;
        for (Resource file : files) {
            if (file.getName().endsWith(".mp3")) {
                result++;
            }
        }
        return result;
    }

    public List<Resource> getAllFiles(List<Resource> found, Resource resource)
    {
        if (found == null) {
            found = new ArrayList<>();
        }
        if (resource.getClass() == File.class)
        {
            found.add(resource);
        } else {
            for (Resource res : ((Directory)resource).getContent()) {
                getAllFiles(found, res);
            }
        }
        return found;
    }

    public Directory getDirectoryByName(String name)
    {
        List<Resource> list = deriveDirectoryByName(null, name, base);
        if (list.size() > 0) {
            return (Directory)list.get(0);
        }
        return null;
    }

    private List<Resource> deriveDirectoryByName(List<Resource> found, String name, Resource resource)
    {
        if (found == null) {
            found = new ArrayList<>();
        }
        if (resource.getClass() == Directory.class) {
            if (resource.getName().equals(name)) {
                found.add(resource);
            }
            for (Resource res : ((Directory)resource).getContent()) {
                deriveDirectoryByName(found, name, res);
            }
        }
        return found;
    }



}
