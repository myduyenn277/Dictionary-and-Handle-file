package DictionaryManager.common;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Validation {
     static Scanner sc = new Scanner(System.in);
    public int getIntLimit(String mess, int n, int m) {
        int result;
        while (true) {
            System.out.println(mess + ": ");
            try {
                result = Integer.parseInt(sc.nextLine());
                if (result < n && result > m) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a number between " + n + " and " + m);
            }
        }
    }
    
    public  String getInputString(String mess){
        String result;
        while(true){
            System.out.println(mess + ": ");
            result = sc.nextLine().trim();
            if(!result.isEmpty()){
                return result;
            }
            System.out.println("Please, enter again(not empty)");
        }
    }
    
    public boolean checkKeyExist(HashMap<String, String> dhm, String eng){
        Set<String> keyset = dhm.keySet();
        for (String o : keyset) {
            if (eng.equalsIgnoreCase(o)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean checkInputYN() {
        while (true) {
            String result = getInputString("Do you want to replace(Y/N)?");
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
}