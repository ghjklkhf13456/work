package com.HJh.test;

class SolutionSmall {
    public int smallestNumber(int n, int t) {
        while (!check(n, t)) {
            n++;
        }
        return n;
    }

    private boolean check(int num, int t) {
        int product = 1;
        while (num > 0) {
            product *= num % 10;
            num /= 10;
            if (product == 0) {
                break;
            }
        }
        return product % t == 0;
    }

    public static void main(String[] args) {
        SolutionSmall solutionSmall = new SolutionSmall();
        System.out.println(solutionSmall.smallestNumber(15, 3));
    }
}
