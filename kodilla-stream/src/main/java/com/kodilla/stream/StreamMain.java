package com.kodilla.stream;

import com.kodilla.stream.com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        Processor processor = new Processor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        PoemBeautifier poemBeautifier1 = new PoemBeautifier();
        poemBeautifier1.beautify("Pierwszy tekst", text -> "ABC" + text + "ABC");
        poemBeautifier1.beautify("Pierwszy tekst", text -> text.toUpperCase());
        poemBeautifier1.beautify("Pierwszy tekst", text -> text.replaceAll("tekst", "text"));
        poemBeautifier1.beautify("Pierwszy tekst", text -> text.replaceAll("\\s", "*"));

        PoemBeautifier poemBeautifier2 = new PoemBeautifier();
        poemBeautifier2.beautify("Drugi tekst", text -> "ABC" + text + "ABC");
        poemBeautifier2.beautify("Drugi tekst", text -> text.toUpperCase());
        poemBeautifier2.beautify("Drugi tekst", text -> text.replaceAll("tekst", "text"));
        poemBeautifier2.beautify("Drugi tekst", text -> text.replaceAll("\\s", "*"));

        PoemBeautifier poemBeautifier3 = new PoemBeautifier();
        poemBeautifier3.beautify("Trzeci tekst", text -> "ABC" + text + "ABC");
        poemBeautifier3.beautify("Trzeci tekst", text -> text.toUpperCase());
        poemBeautifier3.beautify("Trzeci tekst", text -> text.replaceAll("tekst", "text"));
        poemBeautifier3.beautify("Trzeci tekst", text -> text.replaceAll("\\s", "*"));
    }
}

