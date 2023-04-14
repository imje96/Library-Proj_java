package save;

import domain.repository.*;
import presentation.*;
import service.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserController userController = new UserController(new UserService());
        BookController bookController = new BookController(new BookService());

        boolean isExit = false;
        while (!isExit) {
            System.out.println("기능을 선택해주세요. 1. 회원관리 2. 도서관리 3. 종료");
            int target = scanner.nextInt();

            if (target == 1) {
                userController.printMenu();
            } else if (target == 2) {
                bookController.printMenu();
            } else if (target == 3) {
                System.exit(0);
            } else {
                System.out.println("다시 입력하세요");
            }
        }
    }

}
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        UserController userController = new UserController(
//                new UserService());
//        
//        BookController bookController = new BookController(
//                new BookService());
//        
//        boolean isExit = false;
//        while (!isExit) {
//            System.out.println("기능을 선택해주세요. 1. 회원관리 2. 도서관리 3. 종료");
//            int target = scanner.nextInt();
//            
//            if (target == 1) {
//                userController.printMenu();
//            } else if (target == 2) {
//                bookController.printMenu();
//            } else if (target == 3) {
//                System.exit(0);
//            } else {
//                System.out.println("다시 입력하세요");
//            }
//        }
//    }
//
//}