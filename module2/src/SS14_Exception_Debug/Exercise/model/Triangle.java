package SS14_Exception_Debug.Exercise.model;

import SS14_Exception_Debug.Exercise.exception.IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    private int edgeA;
    private int edgeB;
    private int edgeC;

    public Triangle() {
    }

    public Triangle(int edgeA, int edgeB, int edgeC) throws IllegalTriangleException {
        if (edgeA <= 0 || edgeB <= 0 || edgeC <= 0) {
            throw new IllegalTriangleException("Cạnh của tam giác phải > 0");
        } else if (edgeA + edgeB <= edgeC || edgeA + edgeC <= edgeB || edgeB + edgeC <= edgeA) {
            throw new IllegalTriangleException("Cạnh của tam giác phải thỏa mãn điều kiện a + b > c");
        } else {
            this.edgeA = edgeA;
            this.edgeB = edgeB;
            this.edgeC = edgeC;
        }
    }

    public int getEdgeA() {
        return edgeA;
    }

    public void setEdgeA(int edgeA) {
        this.edgeA = edgeA;
    }

    public int getEdgeB() {
        return edgeB;
    }

    public void setEdgeB(int edgeB) {
        this.edgeB = edgeB;
    }

    public int getEdgeC() {
        return edgeC;
    }

    public void setEdgeC(int edgeC) {
        this.edgeC = edgeC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "edgeA=" + edgeA +
                ", edgeB=" + edgeB +
                ", edgeC=" + edgeC +
                '}';
    }

}

