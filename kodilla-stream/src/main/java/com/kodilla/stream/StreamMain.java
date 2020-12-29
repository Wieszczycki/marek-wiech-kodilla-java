package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {

        /* ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        */


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("koza", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Kapibara", String::toUpperCase);
        poemBeautifier.beautify("KOZA", String::toLowerCase);
        poemBeautifier.beautify("koza", text -> "1. " + text + " 2. " + text + " 3. " + text);
        poemBeautifier.beautify("Kapibara", text -> text + text.length());
    }
}
