package ru.netology.sqr;
public class SqrService {
    public int calculate(int x, int y) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= x) {
                if (sqr <= y) {
                    count++;
                }
            }
        }
        return count;
    }
}
