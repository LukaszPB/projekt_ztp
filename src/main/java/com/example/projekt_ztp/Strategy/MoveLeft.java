package com.example.projekt_ztp.Strategy;

public class MoveLeft implements MoveStrategy{
    @Override
    public void move(Enemy enemy) {
        enemy.xPos -= 1;
    }
}
