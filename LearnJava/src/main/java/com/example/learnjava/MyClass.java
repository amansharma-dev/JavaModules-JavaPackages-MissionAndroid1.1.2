package com.example.learnjava;

public class MyClass {

    public static void main(String[] args) {


        //calling return method
        int finalNum = addNums(4,5) + 10;
        System.out.println("This is a return int method: "+ finalNum);

        System.out.println("This is a return string method: "+fullName("Wiz","Khalifa"));



        //calling multiply method
        multiply(16,5);

        //calling custom method
        product("iPhoneCover",25,"Limited edition only for football lovers");
        customMethod("hello this is a  parameter from main method");


        //For loops

        for(int i=0;i<10;i++){
            if(i%2==0){
                System.out.println("divisible by 2:"+i);
            }
//            System.out.println(i);
        }


        //Logical operators
        // AND--> &&

        int maleAge = 28;
        int femaleAge = 26;
        if(maleAge>=femaleAge && maleAge<=femaleAge+3){
            System.out.println("It's a match");
        }
        else{
            System.out.println("Try again");
        }



        //Control Flow - Intro
        //if statements

        int x  = 9;
        int y =29;
        boolean isGreater =true;

        if(!isGreater){
            System.out.println("Indeed!");
        }
        else{
            System.out.println("Not true");
        }

        int signupAge = 18;
        int userAge = 19;

        if(userAge>=signupAge){
            System.out.println("You can SignUp");
        }else{
            System.out.println("Sorry you are too young");
        }




        //Basic Operations for add, sub, multi, div
        float a = 13;
        float b = 3;
        float add = a+b;
        float sub = a-b;
        float multi = a*b;
        float div = a/b;

        System.out.println("Add: " +add);
        System.out.println("Sub: " +sub);
        System.out.println("Multi: " +multi);
        System.out.println("Div: " +div);
        //Remainder %
        float remainder = a%b;
        System.out.println("Remainder is: "+remainder);


        //Variables
        String firstName= "William";
        String lastName = "James";
        int age = 27;
        long pubgRank = 125463874;
        float killRate = 1.6f;
        double deathRate = 3.89; //bigger with more precision like currency and calculator.
        byte minSeason8Rank =127; //bye max size is 127
        short maxSeason8Rank = 224; //2x byte
        char selectChar= 'W';

        //boolean
        boolean isTrue;
        isTrue = true;


        System.out.println("First Name: "+ firstName +" , "+ "Last Name: "+lastName);
        System.out.println("My age is: "+age);
        System.out.println("Rank: "+pubgRank);
        System.out.println("Kill Rate: "+killRate);
        System.out.println("Death Rate: "+ deathRate);
        System.out.println("Minimum Season8 Rank: "+minSeason8Rank);
        System.out.println("Maximum Season8 Rank: "+maxSeason8Rank);
        System.out.println("Selected User With: "+selectChar);

        System.out.println("Selected User With: "+ isTrue);

    }

    //creating our own method & string passing parameters
    public static void customMethod(String passStringParameter){
        System.out.println("This is a custom method & parameter passed is: " +passStringParameter);
    }

    public static void product(String productName,double productPrice, String productDescription){
        System.out.println("Everything about a product:" +productName+" , $"+ productPrice+" , "+productDescription);
    }

    public static void multiply(int a, int b){
        int z = a*b;
        System.out.println("Multiply Result of "+a+" & "+b+" is: "  + z );
    }



    //return statement
    public static int addNums(int a,int b){
        int add;
        add = a+b;
        return add;
    }

    public static String fullName(String firstName, String lastName){
        return firstName + " " +lastName;
    }
}
