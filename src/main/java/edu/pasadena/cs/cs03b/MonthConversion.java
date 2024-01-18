package edu.pasadena.cs.cs03b;

public class MonthConversion {

    public static void main(String[] args) {
        int month = 0;
        month = Integer.parseInt(args[0]);
        String strMonth = MonthConversion.convertMonth(month);
        System.out.println("The month is " + strMonth);
    }

    public static String convertMonth(int nMonth) {
        
        String monthString = "No Such Month";
        switch (nMonth) {
            case 1:
                monthString = "January";
                break;
            case 2: 
                monthString = "February";
                break; 
            case 3:  
                monthString = "March";
                break;
            case 4:  
                monthString = "April";
                break;
            case 5: 
                monthString = "May";
                break;
            case 6:  
                monthString = "June";
                break;
            case 7:  
                monthString = "July";
                break;
            case 8:  
                monthString = "August";
                break;
            case 9:  
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "No Such Month";
                break;
        }
        
        return monthString;
    }
}
