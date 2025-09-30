package CodeChef.Problems.Difficulty500to1000;
/*
La Liga
Read problems statements in mandarin chinese, russian and vietnamese as well.
Today is the final round of La Liga, the most popular professional football league in the world. Real Madrid is playing against Malaga and Barcelona is playing against Eibar. These two matches will decide who wins the league title. Real Madrid is already 3 points ahead of Barcelona in the league standings. In fact, Real Madrid will win the league title, except for one scenario: If Real Madrid loses against Malaga, and Barcelona wins against Eibar, then the La Liga title will go to Barcelona. In any other combination of results, Real Madrid will win the title.

You will be given multiple scenarios for these two games, where in each one you will be given the number of goals each team scored in their respective match. A team wins a match if it scores more than the opponent. In case they score the same number of goals, it's a draw. Otherwise, the team loses the game. You are asked to tell the winner of the La Liga title in each scenario.

Input
The first line contains a single number T, the number of scenarios. Each scenario is described by four lines. Each line starts with a team name followed by the number of goals this team scored in its corresponding match. (Barcelona plays Eibar and Real Madrid plays Malaga). The names are given in any arbitrary order within a scenario.

Output
For each scenario, output a single line showing the title winner in case this scenario happens. It should be either "RealMadrid" or "Barcelona".

Constraints
1 ≤ T ≤ 500
0 ≤ number of goals scored by a team in a match ≤ 20

---Input---
2
Barcelona 2
Malaga 1
RealMadrid 1
Eibar 0
Malaga 3
RealMadrid 2
Barcelona 8
Eibar 6
---Output---
RealMadrid
Barcelona

--test case--
2
Barcelona 0
Eibar 3
RealMadrid 9
Malaga 6
Barcelona 0
Eibar 5
RealMadrid 4
Malaga 4
--test output--
RealMadrid
RealMadrid
**/


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LaLiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine().trim());

        while (T-- > 0) {
            // Store team goals
            Map<String, Integer> goals = new HashMap<>();

            for (int i = 0; i < 4; i++) {
                String[] parts = sc.nextLine().trim().split(" ");
                String team = parts[0];
                int score = Integer.parseInt(parts[1]);
                goals.put(team, score);
            }

            int real = goals.get("RealMadrid");
            int malaga = goals.get("Malaga");
            int barca = goals.get("Barcelona");
            int eibar = goals.get("Eibar");

            boolean realLose = real < malaga;
            boolean barcaWin = barca > eibar;

            if (realLose && barcaWin) {
                System.out.println("Barcelona");
            } else {
                System.out.println("RealMadrid");
            }
        }

        sc.close();
    }
}
