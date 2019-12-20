import java.util.HashMap;
;
import java.util.Scanner;

public class Myclass {
    public static void main(String []args){


        HashMap<String, String> CapitalCities = new HashMap<String, String>();

        //initiating HashMap

            CapitalCities.put("RWANDA", " Kigali");
            CapitalCities.put("UGANDA", " Kampala");
            CapitalCities.put("BURUNDI", " Bujumbura");
            CapitalCities.put("TANZANIA", " Dodoma");
            CapitalCities.put("KENYA"," Nairobi");
            
            
            //in case you to print and see if our hashmap is already set go ahead and uncomment the following line
            //System.out.println(CapitalCities+"\n");


            //adding data to the existing list

            CapitalCities.put("CONGO", " Kinshasa");

           //in case you want to print to see the results you can uncomment the following line
           //System.out.println("New output: "+CapitalCities+"\n");

            //using foreach loop to print results, u can also uncomment the following loop to see how foreach lopp works
           /* for  (String i : CapitalCities.keySet()){
                System.out.println(" "+CapitalCities.get(i));*/

            
            System.out.println("\n\n Tricky!! tricky"+"\n Write down any country in East African " +
                    "countries the program will give you it's capital city" );

            Scanner tempInput = new Scanner(System.in);

            String tempCity = tempInput.nextLine();


           //turning the input into uppercase letter in case the user entered lower case letters
            String nameHolder = tempCity.toUpperCase();

        try {
            //comparing the string, remember to compare String we use .equals()
            if  (CapitalCities.get(nameHolder).equals(CapitalCities.get(nameHolder)))
                System.out.println("The capital city of "+tempCity+" is"+CapitalCities.get(nameHolder));


        }

        //if the above statement is not correct it will print this catch
        catch (Exception e){
            System.out.println("The country you have entered is not in east African countries ");
        }

       finally {

            System.out.println("\n Tricky Trick ended Here\n"+"So that i have taught you more Now it's your Turn ");
        }

        
    }

}
