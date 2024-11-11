package cheolmun;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 초기자본금
        // 주식의 구매 가격
        // 구매할 주식의 수
        // 판매할 때의 주식 가격을 입력 받기

        System.out.print("초기 자본금을 입력하세요: ");
        double InitialCapitalStock = sc.nextDouble();

        System.out.print("주식 가격을 입력하세요: ");
        double PurchasePrice = sc.nextDouble();

        System.out.print("구매할 주식 수를 입력하세요: ");
        int StockNumber = sc.nextInt();

        System.out.print("판매할 때의 주식 가격을 입력하세요: ");
        double StockPriceTime = sc.nextDouble();

        // 주식 구매 비용 계산하기
        double StockPurchaseCost = PurchasePrice * StockNumber;

        // 남은 자본금 계산하기
        double RemainCapital = InitialCapitalStock - StockPurchaseCost;

        // 총 판매 금액 계산하기
        double SaleProfitExpectation = StockPriceTime * StockNumber;

        // 예상 이익 또는 손실 계산하기
        double profitOrLoss = SaleProfitExpectation - StockPurchaseCost;

        // 결과 출력
        System.out.println("구매 후 남은 자본금: " + String.format("%.2f", RemainCapital));
        if (profitOrLoss > 0) {
            System.out.println("예상 이익: " + String.format("%.2f", profitOrLoss));
            System.out.println("예상되는 이익입니다.");
        } else {
            System.out.println("예상 이익: " + String.format("%.2f", profitOrLoss));
            System.out.println("예상되는 손실입니다. ");
        }


    }



}

