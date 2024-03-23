package ru.netology.statistic;

import java.util.ArrayList;

public class Game {
    ArrayList<Player> playersList = new ArrayList<>();

    public void register(Player player) {
        playersList.add(player);
    }

    public Player foundByName(String playerName) {
        for (Player player : playersList) {
            if (player.getName() == playerName) {
                return player;
            }
        }
        return null;
    }

    public int round(String playerName1, String playerName2) {
        Player foundedPlayer1 = foundByName(playerName1);
        Player foundedPlayer2 = foundByName(playerName2);

        if (foundedPlayer1 == null) {
            throw new NotFoundedNameExeption(
                    "Игрок с именем " + playerName1 + " не зарегистрирован!"
            );
        }

        if (foundedPlayer2 == null) {
            throw new NotFoundedNameExeption(
                    "Игрок с именем " + playerName2 + " не зарегистрирован!"
            );
        }

        int resultOfCompair = foundedPlayer1.compareTo(foundedPlayer2);
        if (resultOfCompair > 0) {
            return 1;
        } else if (resultOfCompair < 0) {
            return 2;
        } else {
            return 0;
        }

    }
}
