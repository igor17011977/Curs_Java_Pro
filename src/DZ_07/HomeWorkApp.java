package DZ_07;
import  java.util.logging.Logger;

public class HomeWorkApp {
    private static final Logger logger = Logger.getLogger(HomeWorkApp.class.getName());
    String text;
    public void printThreeWords(){
        logger.info("Orange\nBanana\nApple");

    }
    public void checkSumSign(){
        int a=10;
        int b=20;
        text=(a+b>=0) ? "Sum is positiv":"Sum is negativ";
        logger.info(text);
    }
    public void printColor(){
        int value=-47;
        if (value<0){logger.info("Red");} else if (value>=0 && value<=100) {
            logger.info("Yllow");
        } else if (value>100) {
            logger.info("Green");
        }

    }
    public void compareNumbers() {
        int a=10;
        int b=15;
        text=(a>=b) ? "a<=b":"a<b";
        logger.info(text);
    }
    public String checkNumber(int first,int second){
        if ((first+second)>=10 && (first+second)<=20){
            return "true";
        }else return "false";
    }
    public void checkNumber2(int num){
        text=(num>=0) ? "A positive number":"Negative number";
        logger.info(text);
    }
    public String checkNumber3(int num){
        text=(num<0) ? "True":"False";
        return  text;
    }
    public void circle(String line,int num) {
        String line1=(line+"\n").repeat(num);
        logger.info(line1);

    }
    public void year(int y){
        if (((y%4==0)&& (y%100!=0))||(y%400==0)){
            logger.info("It is leap year");
        }else logger.info("It is not leap year");
    }
    public static void main (String[] args){
        HomeWorkApp homeWorkApp=new HomeWorkApp();
        homeWorkApp.printThreeWords();
        homeWorkApp.checkSumSign();
        homeWorkApp.printColor();
        homeWorkApp.compareNumbers();
        String check = homeWorkApp.checkNumber(2,5);
        logger.info(check);
        homeWorkApp.checkNumber2(6);
        String check2 = homeWorkApp.checkNumber3(5);
        logger.info(check2);
        homeWorkApp.circle("TEST LINE",6);
        homeWorkApp.year(2022);

    }

}
