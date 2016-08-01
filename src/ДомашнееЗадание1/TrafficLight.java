package ДомашнееЗадание1;



import java.util.Scanner;

public class TrafficLight
{
    public static void main(String[] args)
    {
        System.out.println("Введите время");

        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        int res = time % 80;

        if (res >= 0 && res <30)
            System.out.println("красный");
        else if (res >= 30 && res <60)
            System.out.println("зеленый");
        else if (res >= 60 && res <70)
            System.out.println("мигает зеленый");
        else if (res >= 70 && res <80)
            System.out.println("мигает желтый");

    }

}
