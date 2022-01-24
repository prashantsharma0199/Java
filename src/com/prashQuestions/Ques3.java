package com.prashQuestions;

public class Ques3 {
    public static void main(String[] args) {
        int[][] arr = { { 2, 4, 3, 9 },
                { 4, 6, 5, 11 },
                { 3, 5, 4, 10},
                { 9, 11, 10, 16 } };

        int N = 4, X = 16;

        // Function Call
        System.out.print(countSubsquare(arr, N, X) + "\n");

    }

    static int countSubsquare(int matrix[][], int N, int sum){
        int count=0;
        int [][]dp = new int[N + 1][N + 1];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++){
                dp[i + 1][j + 1] = matrix[i][j];
            }
        }

        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= N; j++){
                dp[i][j]+= dp[i - 1][j]+dp[i][j - 1]-dp[i - 1][j - 1];
            }
        }


        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= N; j++){
                int lo = 1;

                int hi = Math.min(N - i, N - j) + 1;

                boolean found = false;

                while (lo <= hi) {
                    int mid = (lo + hi) / 2;
                    int index_i = i + mid - 1;
                    int index_j = j + mid - 1;

                    int mat_sum = dp[index_i][index_j]-dp[index_i][j - 1]-dp[i - 1][index_j]+dp[i - 1][j - 1];
                    if(mat_sum >= sum) {
                        if(mat_sum == sum){
                            found = true;
                        }
                        hi = mid - 1;
                    }
                    else{
                        lo = mid + 1;
                    }
                }
                if(found){
                    count+=1;
                }
            }
        }
        return count;
    }
}
