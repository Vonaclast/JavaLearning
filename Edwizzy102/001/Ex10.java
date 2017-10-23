package com.Vonclast;

public class Ex10 {


    public static void main(String[] args) {

        int health = 100;
        int xp = 0;
        boolean isAlive = true;

        while (isAlive) {
            if (Alive(health)) {
                isAlive = false;
                continue;
            }
            Attack();
            xp += 12;
            health -= 1;
        }

        System.out.println("You are Dead. You gained " + xp + " experience");

    }

    public static boolean Alive(int health) {
        return health == 0;
    }

    public static void Attack() {
        System.out.printf("Player attacks monster. He defeats it! Xp Gain: %d HP Loss: %d%n",12, 1);

    }
}
