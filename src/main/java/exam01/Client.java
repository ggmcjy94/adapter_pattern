package exam01;

public class Client {

    public static void main(String[] args) {

        // 리눅스
        LinuxCalculator linuxCalculator = new LinuxCalculator();
        double result = linuxCalculator.execute(1, 2);

        //window
        WindowCalculator windowCalculator = new WindowCalculator();
        double result2 = windowCalculator.execute(3, 4);

        // linux 환경에서 window 계산기를 쓰고싶어 어뎁터를 이용해서 변경
        LinuxCalculator calculatorAdapter = new CalculatorAdapter(windowCalculator);
        double result3 = calculatorAdapter.execute(5, 6);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);


    }
}
