package org.entity;

/**
 * 遊戲角色*/
public class Player {
    String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*歡迎使用者的加入*/
    public void showWelcomeMessage() {
        System.out.println("Welcome " + this.name + " to this ARPG World");
    }
}
