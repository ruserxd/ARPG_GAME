package org.core;

import org.entity.Player;

/**
 *  遊戲主程式
 * */
public class Game {
    public static void main(String[] args) {
        System.out.println("Let the games begin!!");

        Player player = new Player();
        player.setName("ruserxd");
        System.out.printf("Auto creating a %s user\n", player.getName());
        player.showWelcomeMessage();
    }
}
