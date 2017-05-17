package HoldingObjects;

import java.util.ArrayList;

/**
 * Created by vilenalivinsky on 5/16/17.
 */
public class Entry {

    private String name;

    public Entry (String name, String defaultPhoneNumber){

        this.name = name;
        this.phonelist.add(defaultPhoneNumber);
    }

    ArrayList<String> phonelist = new ArrayList<String>();

    public void addPhoneNumber(String phoneNumber){

        phonelist.add(phoneNumber);

    }

    public void removePhoneNumber(String phoneNumber){

        phonelist.remove(phoneNumber);

    }



    public ArrayList<String> getPhoneNumber(){

            return  this.phonelist;

        //        String temporaryPhoneNumber = null;
//       for(int i = 0; i < phonelist.size(); i ++){
//           temporaryPhoneNumber = phonelist.get(i);
//           if(temporaryPhoneNumber.equalsIgnoreCase(phoneNumber)){
//               return temporaryPhoneNumber;
//           }
//       }
//       return null;
    }


    public String getName(){
        return this.name;

    }

    public String toString(){

        return  "Phone number" + " " + this.getPhoneNumber() + " name:" + " " + this.getName();
    }
}
