public final class Rectangle extends Shape {
    int length, height;

    Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    @Override
    String draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
//                if(i == 1 && j > 0 && i != height - 1 && j!= height - 1){
//                    System.out.print(" ");
//                }
//                else
//                    System.out.print("*");
//                if (i == 0 || j == 0 || j == length - 1) {
                if (j == 0 || i == 0 || i == height - 1 || j == length - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return "";
    }
}
