package homework01;

class Exponentiation {

    static int square(int number) {
        return number * number;
    }

    static int cube(int number) {
        return number * number * number;
    }

    static double powMethod(int baseNumber, int powerNumber) {
        double result = 1;
        if (powerNumber > 0) {
            for (int i = powerNumber; i > 0; i--) {
                result *= baseNumber;
            }
        } else if (powerNumber < 0) {
            for (int i = powerNumber; i < 0; i++) {
                result /= baseNumber;
            }
        }
        return result;
    }
}

