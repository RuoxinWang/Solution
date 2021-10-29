package com.company;

public class Context {
    MathOperation operation;
    public Context(MathOperation operation) {
        this.operation = operation;
    }
    public int execute(int n1, int n2) {
        int res = operation.performOperation(n1, n2);
        return res;
    }
}
