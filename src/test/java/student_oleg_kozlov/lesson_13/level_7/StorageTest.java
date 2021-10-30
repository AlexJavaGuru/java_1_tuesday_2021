package student_oleg_kozlov.lesson_13.level_7;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

// Task_34
public class StorageTest {
    Storage storage;
    Directory base;

    @Before
    public void setUp() {
        storage = new Storage();
        base = storage.rootDirectory();
    }

    @Test
    public void shouldReturnBaseDirectory() {
        assertEquals(new Directory("/"), base);
    }

    @Test
    public void shouldAddNewDirectory() {
        base.add(new Directory("music"));
        assertTrue(base.getContent().contains(new Directory("music")));
    }

    @Test
    public void shouldAddNewFile() {
        base.add(new File("root.sys", 1));
        assertTrue(base.getContent().contains(new File("root.sys", 1)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionIfAddDuplicatedResource() {
        base.add(new File("root.sys", 1));
        base.add(new File("root.sys", 1));
    }

    @Test
    public void shouldDeleteDirectory() {
        base.add(new Directory("music"));
        base.delete(new Directory("music"));
        assertFalse(base.getContent().contains(new Directory("music")));
    }

    @Test
    public void shouldDeleteFile() {
        base.add(new File("root.sys", 1));
        base.delete(new File("root.sys", 1));
        assertFalse(base.getContent().contains(new File("root.sys", 1)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionIfDeletedResourceDoesNotExist() {
        base.delete(new File("root.sys", 1));
    }

    @Test
    public void shouldReturnStorageSize() {
        populateStorage();
        assertEquals(48, storage.totalSize());
    }

    @Test
    public void shouldReturnMP3FilesQuantity() {
        populateStorage();
        assertEquals(7, storage.totalMP3());
    }

    @Test
    public void shouldReturnDirectoryByName() {
        populateStorage();
        Directory dir = storage.getDirectoryByName("music");
        assertEquals(new Directory("music"), dir);
    }

    @Test
    public void shouldReturnNullSearchingNonExistentDirectoryByName() {
        populateStorage();
        assertNull(storage.getDirectoryByName("music1"));
    }

    @Test
    public void shouldReturnAllFilesInStorage() {
        populateStorage();
        List<Resource> files = storage.getAllFiles(null, base);
        assertEquals(10, files.size());
        assertTrue(files.contains(new File("root.sys", 1)));
        assertTrue(files.contains(new File("relax1.mp3", 2)));
        assertTrue(files.contains(new File("relax2.mp3", 3)));
        assertTrue(files.contains(new File("heavy1.mp3", 2)));
        assertTrue(files.contains(new File("heavy2.mp3", 3)));
        assertTrue(files.contains(new File("heavy3.mp3", 4)));
        assertTrue(files.contains(new File("pop1.mp3", 1)));
        assertTrue(files.contains(new File("pop2.mp3", 2)));
        assertTrue(files.contains(new File("doc1.txt", 20)));
        assertTrue(files.contains(new File("doc2.pdf", 10)));
    }

    private void populateStorage() {
        Directory music = new Directory("music");
        Directory documents = new Directory("documents");
        base.add(music);
        base.add(documents);
        base.add(new File("root.sys", 1));
        Directory heavyMusic = new Directory("heavy music");
        Directory popMusic = new Directory("pop music");
        music.add(heavyMusic);
        music.add(popMusic);
        music.add(new File("relax1.mp3", 2));
        music.add(new File("relax2.mp3", 3));
        heavyMusic.add(new File("heavy1.mp3", 2));
        heavyMusic.add(new File("heavy2.mp3", 3));
        heavyMusic.add(new File("heavy3.mp3", 4));
        popMusic.add(new File("pop1.mp3", 1));
        popMusic.add(new File("pop2.mp3", 2));
        documents.add(new File("doc1.txt", 20));
        documents.add(new File("doc2.pdf", 10));
    }
}