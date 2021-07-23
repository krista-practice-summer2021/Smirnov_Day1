import java.util.Scanner;

public class Calculate {

    private String primer;
    private int one, two;

    public static void main(String[] args) {
        Calculate my = new Calculate();
        my.Calculated_One();
        my.Calculated_Two();
    }

    public void Calculated_One() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый операнд");
        int one = in.nextInt();
        System.out.println("Введите операцию");
        String oper = in.next();
        System.out.println("Введите второй операнд");
        int two = in.nextInt();
        int result = 0;
        boolean isKnow = false;

        switch (oper) {
            case "+":
                isKnow = true;
                result = one + two;
                break;
            case "-":
                isKnow = true;
                result = one - two;
                break;
            case "*":
                isKnow = true;
                result = one * two;
                break;
            case "/":
                isKnow = true;
                try {
                    result = one / two;
                }
                catch (ArithmeticException e)
                {
                    System.out.println("Ошибка");
                    isKnow = false;
                }
                break;
            default: System.out.println("Операция введена не верно");

        }
        if (isKnow)
            System.out.println(one + " " + oper + " " + two + " = " + result) ;
    }

    public void consolePrimerInput() {
        System.out.println("Введите выражение");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        this.primer = str;
    }

    public void Calculated_Two() {

        consolePrimerInput();

        String[] strList = primer.split(" ");
        int result = 0;
        boolean isKnow = false;

        switch (strList[1]) {
            case "+":
                isKnow = true;
                result = Integer.parseInt(strList[0]) + Integer.parseInt(strList[2]);
                break;
            case "-":
                isKnow = true;
                result = Integer.parseInt(strList[0]) - Integer.parseInt(strList[2]);
                break;
            case "*":
                isKnow = true;
                result = Integer.parseInt(strList[0]) * Integer.parseInt(strList[2]);
                break;
            case "/":
                isKnow = true;
                try {
                    result = Integer.parseInt(strList[0]) / Integer.parseInt(strList[2]);
                }
                catch (ArithmeticException e)
                {
                    System.out.println("Ошибка");
                    isKnow = false;
                }
                break;
            default: System.out.println("Операция введена не верно");

        }
        if (isKnow)
            System.out.println(strList[0] + " " + strList[1] + " " + strList[2] + " = " + result) ;
    }
}
