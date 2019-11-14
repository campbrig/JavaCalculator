package edu.isu.cs2235;

import java.util.Stack;

public class Calculator {
    private Stack<Float> history = new Stack<Float>();

    public float add(float value) {
        float result = history.peek() + value;
        history.push(result);
        return result;
    }

    public float subtract(float value) {
        float result = history.peek() - value;
        history.push(result);
        return result;
    }

    public float multiply(float value) {
        float result = history.peek() * value;
        history.push(result);
        return result;
    }

    public float divide(float value) {
        float result = history.peek() / value;
        history.push(result);
        return result;
    }
}
