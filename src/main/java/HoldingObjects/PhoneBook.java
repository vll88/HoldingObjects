package HoldingObjects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
/**
 * Created by vilenalivinsky on 5/16/17.
 */
public class PhoneBook {



    HashMap<String, Entry> entries = new HashMap<String, Entry>();

    public boolean addEntryToEntries(String name, String number){

        Entry newEntry = new Entry(name, number);
        entries.put(name, newEntry);
        return this.entries.containsValue(newEntry);
    }

    public ArrayList<String> lookUp(String name){


        Entry returnedEntry  = entries.get(name);
        return returnedEntry.getPhoneNumber();


//        for(Thing thing : Whatever whever) //use this iteration when you want to iterate through a structure without indicies
//         for(int i =) //use this iteration for index based iteration
    }


    public String printAllEntires(){

        return  this.entries.toString();
    }

//
//    HashMap<String, ArrayList<String>> phones = new HashMap<String, ArrayList<String>>();








    /*
    String phoneNum;
    String name;

    public PhoneBook(String name, String phoneNum){
        this.name = name;
        this.phoneNum = phoneNum;
    }

    //setter
    public void addEntry(String name, String phoneNum){}


    public String lookup(String name){
        return phoneNum;
    }

    //getter
    public String listEntries(){
        return name+phoneNum;
    }

    /////////////////////
    Enumeration name;
    String phoneNum;

    Hashtable<String, String> hashtable = new Hashtable<String, String>();

    hashtable.put("(001) 4444", "John");

    name = hashtable.key();
    while(name.hasMoreElements()){
        phoneNum = (String) name.nextElement();
        System.out.println("entry:"+name+phoneNum+hashtable.get(key);
    }

    */

}
