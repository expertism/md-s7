package org.mdigital;

import java.util.Arrays;

public class FootballScore {

    public static int generateScore() {
        String[] gameScore = new String[38];

        int homeScore = (int)(Math.random() * 4);
        int awayScore = (int)(Math.random() * 4);

    }


    public static void main() {
        System.out.println(generateScore());
    }

}
