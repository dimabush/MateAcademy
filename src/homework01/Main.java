package homework01;

class Main {
    public static void main(String[] args) {

        //Task 1.1 Betting Calculator
        System.out.println(BettingCalculator.matchResult(0, 0, 4,4));
        System.out.println(BettingCalculator.matchResult(1, 2, 1,2));
        System.out.println(BettingCalculator.matchResult(1, 2, 2,2));


        //Task 1.2 drawing a rhombus
        DrawingRhombus.drawRhombus(11);

        //Task 1.3 Exponentiation
        System.out.println("12 ^ 2 = " + Exponentiation.square(12));
        System.out.println("3 ^ 3 = " + Exponentiation.cube(3));
        System.out.println("2 ^ 8 = " + Exponentiation.powMethod(2,8));
        System.out.println("2 ^ -4 = " + Exponentiation.powMethod(2,-4));

    }
}
