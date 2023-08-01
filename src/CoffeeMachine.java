import java.util.Scanner;

public class CoffeeMachine {

    Coffee[] coffee = new Coffee[3];
    Scanner scanner = new Scanner(System.in);

    void run() {
        boolean isRun = true;
        while(isRun) {
            System.out.println("-------------------------------------");
            System.out.println(" 어서오세요*^^* ~ 메뉴를 선택해 주세요!");
            System.out.println("-------------------------------------");
            System.out.println("1. 구매하기 | 2. 채우기 | 3. 가져가기 | 4. 나가기");
            System.out.println("번호 입력하기 >>>");
            break;
        }

        int selectedNumber = Integer.parseInt(scanner.nextLine());
        if (selectedNumber == 1) {
            buycoffee();
        } else if (selectedNumber == 2) {
            fill();
        } else if (selectedNumber == 3) {
            take();
        } else if (selectedNumber == 4) {
            isRun = false;
            System.out.println("안녕히 가세요 *^^*");
        }

    }

    private void buycoffee() {
        System.out.println("-----------");
        System.out.println("커피 구매하기");
        System.out.println("------------");
        System.out.println("주문하실 메뉴를 선택하세요");
        System.out.println("*******Menu******");
        System.out.println("1. 에스프레소 : 4000원");
        System.out.println("2. 라떼 : 7000원");
        System.out.println("3. 카푸치노 : 6000원");
        int menuNo = scanner.nextInt();

        System.out.println();

        String coffeeStr = "";
        int money = 0;

        switch(menuNo) {
            case 1 :
                coffeeStr = "에스프레소";
                money = 4000;
                break;

            case 2 :
                coffeeStr = "라떼";
                money = 7000;
                break;

            case 3 :
                coffeeStr = "카푸치노";
                money = 6000;
                break;

            default :
                System.out.println("없는 메뉴입니다.");

        }

        System.out.println("커피가 제조되었습니다. 맛있게 드세요!");
        System.out.println("현재 재료 및 금액 상태");


    }

    private void fill() {
    }
    private void take() {
    }


    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.run();
    }



}
