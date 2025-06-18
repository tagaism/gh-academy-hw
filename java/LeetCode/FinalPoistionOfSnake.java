package LeetCode;

import java.util.List;

public class FinalPoistionOfSnake {
    public static void main(String[] args) {
        System.out.println(solution(3, new List<String>() {
            "DOWN","RIGHT","UP"
        }));
    }

    private static int solution(int n, List<String> commands) {
        int cell = 0;
        for(String com : commands) {
            switch (com) {
                case "RIGHT":
                    cell++;
                    break;
                case "LEFT":
                    cell--;
                    break;
                case "UP":
                    cell -= n;
                    break;
                case "DOWN":
                    cell += n;
                    break;
                default:
                    break;
            }
        }
        return cell;
    }
}
