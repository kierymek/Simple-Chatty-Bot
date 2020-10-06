import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        while (x == y) {
            x = y;
            y = scanner.nextInt();
        }
        if (x < y) {
            while(true) {
                x = y;
                y = scanner.nextInt();
                if(y == 0) {
                    break;
                } else if (x > y) {
                    check = false;
                    break;
                }
            }
        } else {
            while(true) {
                x = y;
                y = scanner.nextInt();
                if(y == 0) {
                    break;
                } else if (x < y) {
                    check = false;
                    break;
                }
            }
        }
        System.out.print(check);
    }
}
