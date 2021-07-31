package com.jwd04;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {

    private static final Logger log = Logger.getLogger(Calculator.class.getName());

    public static void main(String[] args) {
        log.info("\nThis app is simple calculator\n" +
                "You can use it to solve problems with signs ['+','-','*','/']\n" +
                "For more information enter 'help'\n" +
                "If you want left the app, please, enter 'exit'\n");
        Scanner scanner = new Scanner(System.in);
        Action enterLine = new Action();
        enterLine.add(scanner.nextLine());
        while(!enterLine.isExit()){
            switch (enterLine.element()) {
                case "+" -> Action.plusCase();
                case "-" -> Action.minusCase();
                case "*" -> Action.multiplicationCase();
                case "/" -> Action.divisionCase();
                case "help" -> Action.helpCase();
                default -> Action.defaultCase();
            }
            log.info("If you want left the app, please, enter 'exit'\n" +
                    "For more information enter 'help'\n" +
                    "You can use this app to solve problems with signs ['+','-','*','/']\n");
            enterLine.add(scanner.nextLine());
        }
    }

}
