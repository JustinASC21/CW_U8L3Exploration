import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[][] testCase1 = {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}
        };
        int[][] testCase2 = {
                {-9,-9,-9,1,1,1},
                {0,-9,0,4,3,2},
                {-9,-9,-9,1,2,3},
                {0,0,8,6,6,0},
                {0,0,0,-2,0,0},
                {0,0,1,2,4,0}
        };

        System.out.println("Expected 19: Actual : " + hourglass(testCase1));
        System.out.println("Expected 28: Actual : " + hourglass(testCase2));

    }
    public static int hourglass(int[][] arr) {
        int maxSum = 0;
        for (int r = 0; r < arr.length - 2; r++) {
            for (int c = 1; c < arr[0].length - 1; c++) {
                int sumUpperRow = arr[r][c-1] + arr[r][c] + arr[r][c+1];
                int middleNum = arr[r+1][c];
                int bottomRow = arr[r+2][c-1] + arr[r+2][c] + arr[r+2][c+1];
                if ((sumUpperRow + middleNum + bottomRow) >= maxSum) {
                    maxSum = sumUpperRow + middleNum + bottomRow;
                }
            }
        }
        return maxSum;
    }
}
