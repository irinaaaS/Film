import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmsTest {


    @Test
    public void test1() {
        FilmsManager manager = new FilmsManager(12);
        manager.addingFilm("film1");
        manager.addingFilm("film2");
        manager.addingFilm("film3");
        manager.addingFilm("film4");
        manager.addingFilm("film5");
        manager.addingFilm("film6");
        manager.addingFilm("film7");
        manager.addingFilm("film8");
        manager.addingFilm("film9");
        manager.addingFilm("film10");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};

        assertArrayEquals(expected, actual);


    }

    @Test
    public void test2() {
        FilmsManager manager = new FilmsManager();
        manager.addingFilm("film1");
        manager.addingFilm("film2");
        manager.addingFilm("film3");
        manager.addingFilm("film4");
        manager.addingFilm("film5");
        manager.addingFilm("film6");
        manager.addingFilm("film7");
        manager.addingFilm("film8");
        manager.addingFilm("film9");
        manager.addingFilm("film10");

        String[] actual = manager.findLast();
        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};

        assertArrayEquals(expected, actual);


    }

    @Test
    public void test3() {
        FilmsManager manager = new FilmsManager();
        manager.addingFilm("film1");
        manager.addingFilm("film2");
        manager.addingFilm("film3");
        manager.addingFilm("film4");
        manager.addingFilm("film5");
        manager.addingFilm("film6");
        manager.addingFilm("film7");
        manager.addingFilm("film8");
        manager.addingFilm("film9");
        manager.addingFilm("film10");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};

        assertArrayEquals(expected, actual);


    }
}
