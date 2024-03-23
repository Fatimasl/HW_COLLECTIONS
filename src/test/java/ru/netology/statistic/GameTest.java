package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class GameTest {

    Player player1 = new Player("01", "Olya", 50);
    Player player2 = new Player("02", "Kolya", 150);
    Player player3 = new Player("03", "Tolya", 250);
    Player player4 = new Player("04", "Yulya", 70);
    Player player5 = new Player("05", "Anya", 40);
    Player player6 = new Player("06", "Petya", 80);
    Player player7 = new Player("07", "Vasya", 150);
    Game game = new Game();

    @Test
    public void testForExeptionByName1() throws Exception {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        game.register(player6);
        game.register(player7);

        Assertions.assertThrows(NotFoundedNameExeption.class, () -> {
            game.round("Sofiya", "Petya");
        });
    }

    @Test
    public void testForExeptionByName2() throws Exception {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        game.register(player6);
        game.register(player7);

        Assertions.assertThrows(NotFoundedNameExeption.class, () -> {
            game.round("Petya", "Petyaaa");
        });
    }

    @Test
    public void shouldReturn0() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        game.register(player6);
        game.register(player7);

        int actual = game.round("Kolya", "Vasya");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        game.register(player6);
        game.register(player7);

        int actual = game.round("Kolya", "Petya");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn2() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        game.register(player6);
        game.register(player7);

        int actual = game.round("Olya", "Yulya");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}
