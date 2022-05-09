package com.company;

import clasess.Prism;
import clasess.Prisms;
import clasess.Square;
import clasess.Squares;
import clasess.PrismList;
import clasess.SquareList;

public class Main {
    /**
     *
     * Создать класс квадрат, члены класса – длина стороны. Предусмотреть в классе методы
     * вычисления и вывода сведений о фигуре – диагональ, периметр, площадь. Создать производный класс
     * – правильная квадратная призма с высотой H, добавить в класс метод определения объема фигуры,
     * перегрузить методы расчета площади и вывода сведений о фигуре. Написать программу,
     * демонстрирующую работу с этими классами: дано N квадратов и M призм, найти квадрат с максимальной
     * площадью и призму с максимальной диагональю.
     *
     */
    public static final int N = 10;
    public static final int M = 10;

    public static void main(String[] args)
    {
        int side;
        /* final int N = 10;
        final int M = 10;
        Squares squares = new Squares(N);
        for (int i = 0; i < N; i++) {
            squares.add(new Square((int) (Math.random() * 70 + 1)));
        }
        System.out.println(squares);
        System.out.println("MaxSquare = " + squares.getMaxSquare());
        System.out.println("\n");
        Prisms prisms = new Prisms(M);
        for (int i = 0; i < M+2; i++) {
            prisms.add(new Prism((int) (Math.random() * 70 + 1), (int) (Math.random() * 70 + 1)));
        }
        System.out.println(prisms);
        System.out.println("MaxDiagonal: " + prisms.getMaxDiagonal());
         */
        SquareList squareList = new SquareList();
        for (int i = 0; i < N; i++) {
            squareList.add(new Square((int) (Math.random() * 70 + 1)));
        }
        System.out.println(squareList);
        System.out.println("MaxSquare = " + squareList.getMaxSquare());
        System.out.println("\n");
        PrismList prismList = new PrismList();
        for (int i = 0; i < M+2; i++) {
            prismList.add(new Prism((int) (Math.random() * 70 + 1), (int) (Math.random() * 70 + 1)));
        }
        System.out.println(prismList);
        System.out.println("MaxDiagonal: " + prismList.getMaxDiagonal());
    }
}
