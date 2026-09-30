package org.mdigital;

import java.util.Arrays;

public class FootballScore {
    public static String[] generateSeasonScores() {
        String[] seasonScores = new String[38];

        for (int i = 0; i < 38; i++) {
            int homeScore = (int)(Math.random() * 5);
            int awayScore = (int)(Math.random() * 5);

            seasonScores[i] = homeScore + ":" + awayScore;
        }
        return seasonScores;
    }

    public static int calculatePoints(String[] scores) {
        int totalPoints = 0;

        for (String match : scores) {

            String[] goals = match.split(":");
            int home = Integer.parseInt(goals[0]);
            int away = Integer.parseInt(goals[1]);

            if (home > away) {
                totalPoints += 3;
            } else if (home == away) {
                totalPoints += 1;
            } else if (home < away) {
                totalPoints += 0;
            }
        }

        return totalPoints;
    }

    public static void main() {
        String[] thisSeason = generateSeasonScores();

        int finalPoints = calculatePoints(thisSeason);

        System.out.println("Season Record: " + Arrays.toString(thisSeason));
        System.out.println("Total Points Obtained: " + finalPoints);
    }
}
