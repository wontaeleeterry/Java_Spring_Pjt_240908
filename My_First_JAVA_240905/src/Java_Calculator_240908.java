import java.util.Scanner;

public class Java_Calculator_240908 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("메뉴를 선택하세요");
            System.out.println("1. 더하기");
            System.out.println("2. 빼기");
            System.out.println("3. 곱하기");
            System.out.println("4. 나누기");
            System.out.println("0. 끝내기");

            int num = sc.nextInt();

            if (num == 0)
            {
                break;
            }
            else
            {
                if (num > 4)
                {
                    System.out.println("메뉴를 잘못 선택했습니다.");
                    continue;
                }

                // 더하기, 빼기, 곱하기, 나누기 실행 : 이 부분에 연산 코드 추가
                System.out.println("첫번째 숫자:");
                int num1 = sc.nextInt();

                System.out.println("두번째 숫자:");
                int num2 = sc.nextInt();

                if (num == 1)
                {
                    int result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                }

                else if (num == 2)
                {
                    int result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                }

                else if (num == 3)
                {
                    int result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                }

                else if (num == 4)
                {
                    int result1 = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result1);

                    int result2 = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + result2);
                }
            }
        }
        System.out.println("계산기를 종료합니다.");
    }
}
