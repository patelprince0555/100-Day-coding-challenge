

public class Leap_year {
    public static void leapYear(int n){
        if(n%400==0){
            System.out.println("it is aleap year");
        } else if(n%4==0&& n%100!=0){
            System.out.println("it is a leap year");
        }else{
            System.out.println("it is not leap year");
        }
    }
    public static void main(String[] args) {
        int n=2004;
        leapYear(n);
        
    }
}
