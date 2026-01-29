package Assignment_1SwitchStatement;

import java.time.LocalDate;

public class Assignment_1 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int day = today.getDayOfWeek().getValue();   
        int month = today.getMonthValue();          

        switch (day) {
        case 1:
            System.out.println("Today is Monday");
            break;
        case 2:
            System.out.println("Today is Tuesday");
            break;
        case 3:
            System.out.println("Today is Wednesday");
            break;
        case 4:
        	System.out.println("Today is Thursday");
            break;
        case 5:
            System.out.println("Today is Friday");
            break;
        case 6:
            System.out.println("Today is Saturday");
            break;
        case 7:
            System.out.println("Today is Sunday");
            break;
        default:
            System.out.println("Invalid Day");
            break;
        }

        switch (month) {
        case 1:
            System.out.println("Current month is January");
           break;
        case 2: 
        	System.out.println("Current month is February");
            break;
        case 3:
            System.out.println("Current month is March");
            break;
        case 4:
            System.out.println("Current month is April");
            break;
        case 5:
            System.out.println("Current month is May");
            break;
        case 6:
        	System.out.println("Current month is July");
            break;
        case 8:
            System.out.println("Current month is August");
            break;
        case 9:
            System.out.println("Current month is September");
            break;
        case 10:
            System.out.println("Current month is October");
            break;
        case 11:
            System.out.println("Current month is November");
            break;
        case 12:
            System.out.println("Current month is December");
            break;
        default:
            System.out.println("Invalid Month");
            break;
        }
    }
}