package com.example.student.omnitrix;

import java.util.Random;

public class Predictions {

    private static Predictions predictions;
    private String[] answers;
    private Random random = new Random();
    private int rnd;

    private Predictions() {
        answers = new String[] {
                "White t-shirt with Black shirt black jeans and boots",
                "Black T-shirt with red and black flannel with blue jeans and black converse",
                "Black and white flannel with khakis and black vans",
                "Jean jacket white shirt black jeans and Black converse",
                "Go naked."

        };
    }

    public static Predictions get() {
        if(predictions == null) {
            predictions = new Predictions();
        }
        return predictions;
    }

    public String getPrediction() {
        rnd  = random.nextInt(answers.length);
        return answers[rnd];
    }
}