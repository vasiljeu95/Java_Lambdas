//import java.util.Scanner;

public class HW_Task1 {
    public static void main(String args[]) {
        //Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(args[0]);

        switch (test) {
            case 30:
                System.out.println("наше число = " + 30);
                break;
            case 20:
                System.out.println(20);
                break;
            default:
                System.out.println("not valid");
                break;
        }

		/*
		int test = Integer.valueOf(args[0]);

		if (test == 7) {
			System.out.println(7);
		} else {
			System.out.println("not equal to 7");
		}
		*/




		/*
		int num = sc.nextInt();

		if (num > 10 && num < 50 ) {
			System.out.println("15 < " + num + " < 50");
		}
		*/
    }
}