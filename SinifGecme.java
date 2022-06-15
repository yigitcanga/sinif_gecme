import java.util.*;

public class SinifGecme {
    public static void main(String[] args)
    {
        int phys, chem, tur, math, music, a=0, b=0, c=0, d=0, e=0, sum;
        double ort=0;
        boolean error_end=false;


        Scanner input = new Scanner(System.in);

        System.out.print("Physics grade: ");
        phys = input.nextInt();

        System.out.print("Chemistry grade: ");
        chem = input.nextInt();

        System.out.print("Turkish grade: ");
        tur = input.nextInt();

        System.out.print("Mathematics grade: ");
        math = input.nextInt();

        System.out.print("Music grade: ");
        music = input.nextInt();

        if (0 >= phys ||  phys >= 100 ) a=1;
        if (0 >= chem ||  chem >= 100 ) b=10;
        if (0 >= tur ||  tur >= 100 ) c=100;
        if (0 >= math ||  math >= 100 ) d=1000;
        if (0 >= music ||  music >= 100 ) e=10000;

        sum = a+b+c+d+e;

        if (sum == 0) ort = (phys + chem + tur + math + music ) / 5;
        if (sum == 1) ort = (chem + tur + math + music ) / 4;
        if (sum == 10) ort = (phys + tur + math + music ) / 4;
        if (sum == 100) ort = (chem + phys + math + music ) / 4;
        if (sum == 1000) ort = (chem + tur + phys + music ) / 4;
        if (sum == 10000) ort = (chem + tur + math + phys ) / 4;
        if (sum == 11) ort = (tur + math + music ) / 3;
        if (sum == 101) ort = (chem + math + music ) / 3;
        if (sum == 1001) ort = (chem + tur + music ) / 3;
        if (sum == 10001) ort = (chem + tur + math ) / 3;
        if (sum == 110) ort = (phys + math + music ) / 3;
        if (sum == 1010) ort = (phys + tur + music ) / 3;
        if (sum == 10010) ort = (phys + tur + math ) / 3;
        if (sum == 1100) ort = (phys + chem + music ) / 3;
        if (sum == 11000) ort = (phys + tur + chem ) / 3;
        if (sum == 11000) ort = (phys + tur + chem ) / 3;
        if (sum == 111) ort = (math + music ) / 2;
        if (sum == 1011) ort = (tur + music ) / 2;
        if (sum == 10011) ort = (math + tur ) / 2;
        if (sum == 1101) ort = (chem + music ) / 2;
        if (sum == 10101) ort = (chem + math ) / 2;
        if (sum == 11001) ort = (chem + tur ) / 2;
        if (sum == 1110) ort = (phys + music ) / 2;
        if (sum == 10110) ort = (phys + math ) / 2;
        if (sum == 11010) ort = (phys + tur ) / 2;
        if (sum == 11100) ort = (phys + chem ) / 2;
        if (sum == 11110) ort = phys;
        if (sum == 11101) ort = chem;
        if (sum == 11011) ort = tur;
        if (sum == 10111) ort = math;
        if (sum == 1111) ort = music;
        if (sum == 11111)
        {
            System.out.println("Error");
            error_end = true;
        }


        if (ort <= 55 || error_end)
        {
            System.out.print("You failed ");
            System.out.println("Cumulative Grade: " + ort);
        }
        else
        {
            System.out.print("You passed ");
            System.out.println("Cumulative Grade: " + ort);
        }
    }
}
