package com.edu;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        List<lecture> lectures = new ArrayList<lecture>();
        System.out.print("Введите количество лекций: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= N; i++)
        {
            lecture Lecture = new lecture();
            System.out.print("Введите название лекции: ");
            Lecture.name = in.next();
            System.out.print("Введите начало лекции: ");
            Lecture.startTime = in.nextDouble();
            System.out.print("Введите конец лекции: ");
            Lecture.endTime = in.nextDouble();
            lectures.add(Lecture);
        }
        Collections.sort(lectures);
        for (lecture Lecture : lectures)
        {
            System.out.println(Lecture.toString());
        }
    }
}