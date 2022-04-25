package ru.netology.sqr;

public class SquareNumbers {
    public int calculateSquareNumber(int border1, int border2) {

        int numberHits = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i > border1 && i * i < border2) {
                numberHits++;
            }
        }
        return numberHits;
    }
}


