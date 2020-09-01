package by.learn.boot.boot.action;

import by.learn.boot.boot.service.CalcService;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class CalcAction {
    private final CalcService calcService;
    private Scanner scanner = new Scanner(System.in);

    public CalcAction(CalcService calcService) {
        this.calcService = calcService;
    }

    public void execute() {
        System.out.println("Enter operation: 1 - +, 2 - (-), 3 - *, 4 - /");
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                System.out.println("Enter num 1");
                int num1 = scanner.nextInt();
                System.out.println("Enter num 2");
                int num2 = scanner.nextInt();
                System.out.println(calcService.calc(num1, num2, "sum"));
                break;
            case 2:
                System.out.println("Enter num 1");
                int num3 = scanner.nextInt();
                System.out.println("Enter num 2");
                int num4 = scanner.nextInt();
                System.out.println(calcService.calc(num3, num4, "sub"));
                break;
            case 3:
                System.out.println("Enter num 1");
                int num5 = scanner.nextInt();
                System.out.println("Enter num 2");
                int num6 = scanner.nextInt();
                System.out.println(calcService.calc(num5, num6, "mul"));
                break;
            case 4:
                System.out.println("Enter num 1");
                int num7 = scanner.nextInt();
                System.out.println("Enter num 2");
                int num8 = scanner.nextInt();
                System.out.println(calcService.calc(num7, num8, "div"));
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
