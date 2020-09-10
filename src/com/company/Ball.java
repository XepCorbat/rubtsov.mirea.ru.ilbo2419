package com.company;

import java.lang.*;

public class Ball {
    private String game;
    private int size;
    public Ball(String n, int a){
        game = n;
        size = a;
    }
    public Ball(String n){
        game = n;
        size = 0;

    }
    public Ball(){
        game = "rainbow six siege";
        size = 0;
    }
    public void setsize(int size) {
        this.size = size;
    }
    public void setgame(String game) {
        this.game = game;
    }
    public String getgame(String game){
        return game;
    }
    public int getSize() {
        return size;
    }
    public String toString(){
        return "game : "+this.game+" size : "+this.size;
    }
}
