package me.home.day12;

public class Grade extends Student {
    private int score;

    public Grade(String firstName, String lastName, int phone, int score) {
        super(firstName, lastName, phone);
        this.score = score;
    }

    public String calculate() {
        if (score < 40) return "D";
        else if (score >= 40 && score < 60) return "B";
        else if (score >= 60 && score < 75) return "A";
        else if (score >= 75 && score < 90) return "E";
        else return "O";
    }
}
