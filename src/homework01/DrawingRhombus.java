package homework01;

class DrawingRhombus {

    static void drawRhombus(int sizeOfTheRhombus) {
        if (sizeOfTheRhombus % 2 == 0) {
            System.out.println("Please enter an odd number");
        } else {
            int leftRange = sizeOfTheRhombus / 2;
            int rightRange = sizeOfTheRhombus / 2;

            for (int i = 0; i < sizeOfTheRhombus; i++) {
                for (int j = 0; j < sizeOfTheRhombus; j++) {
                    if (i + j >= leftRange && i + j <= rightRange) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                if (i < sizeOfTheRhombus / 2) {
                    rightRange += 2;
                } else {
                    leftRange += 2;
                }
                System.out.println();
            }
        }
    }
}
