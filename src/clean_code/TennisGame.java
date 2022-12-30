package clean_code;

import java.util.Scanner;

public class TennisGame {
    public static String getScore( int Score1, int Score2) {
        String score = "";
        int tempScore=0;
        if (Score1==Score2)
        {
            switch (Score1)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
            }
        }
        else if (Score1>=4 || Score2>=4)
        {
            int minusResult = Score1-Score2;
            if (minusResult==1){
                 score ="Advantage player1";
            }
            else if (minusResult ==-1){
                 score ="Advantage player2";
            }
             else if (minusResult>=2) {
                 score = "Win for player1";
            }
            else {
                score ="Win for player2";
            }
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) {
                    tempScore = Score1;
                }
                else {
                    score += "-";
                    tempScore = Score2;
                }
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score1,score2;
        do {
            System.out.println("Nhap diem 1");
             score1 = scanner.nextInt();
            System.out.println("Nhap diem 2");
             score2 = scanner.nextInt();
        } while (score1 < 0 || score2 < 0);
        System.out.println(getScore(score1, score2));
    }
}
