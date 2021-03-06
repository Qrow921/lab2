package com.company;

public class Main
{


    public static void main(String[] args)
    {

        MyVector vector1 = new MyVector(10);
        for (int i = 0; i<vector1.GetSize();i++)
        {
            vector1.SetElement(i,i);
        }
        System.out.println(vector1);
        System.out.println("element #5: " + vector1.GetElement(4));
        System.out.println("Max element: " + vector1.GetMaximalElement() + "\nMin element: " + vector1.GetMinimalElement());


        vector1.DescendingSort();
        System.out.println("Vector sorted sorted descending: " + vector1 + "\n");

        double euclidean = vector1.EuclideanNorm();
        System.out.println("Euclidean norm: " + euclidean + "\n");

        vector1.MultiplicationByNumber(5);
        System.out.println("Vector multiplied by 5: " + vector1 + "\n");


        MyVector vector2 = new MyVector(10);
        for (int i = 0; i<vector1.GetSize();i++)
        {
            vector1.SetElement(i,i+5);
            vector2.SetElement(i,i);
        }
        System.out.println("both vectors: \n" + vector1 + "\n" + vector2);
        System.out.println("sum of vectors: " + vector1.SumOfVectors(vector2)+ "\n");

        for (int i = 0; i<vector1.GetSize();i++)
        {
            vector1.SetElement(i,i);
            vector2.SetElement(i,i);
        }
        System.out.println("both vectors: \n" + vector1 + "\n" + vector2);
        System.out.println("multiplication of vectors: " + vector1.ScaleMultiply(vector2));
    }
}