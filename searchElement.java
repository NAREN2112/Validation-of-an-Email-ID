package email;

import java.util.ArrayList;

public class searchElement {

    public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("manojk@gmail.com");
        emailID.add("likethm@gmail.com");
       
        
   
        String searchElement = "likethm@gmail.com";
        
                for(int i=0; i<emailID.size(); i++) {
                    
                    System.out.println(emailID.get(i));
                    
                    if(searchElement==emailID.get(i)) {
                        
                        System.out.println("\n");
                        
                        System.out.println(" email ID- " + searchElement +   " found ");
                        
                        break;
                        
                    }
                }

    }

}