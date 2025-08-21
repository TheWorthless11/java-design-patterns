// lab/Grade.java
package lab;

public class Grade {

    // Returns letter grade based on score (0-100)
    public String letterFor(int score) {
        if (score < 0 || score > 100) throw new IllegalArgumentException("score out of range");
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }

    // Pass/Fail
    public boolean isPass(int score) {
        return score >= 60;
    }
}
