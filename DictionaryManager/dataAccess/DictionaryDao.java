package DictionaryManager.dataAccess;

import java.util.HashMap;
import java.util.Set;

import DictionaryManager.common.Validation;

public class DictionaryDao {
    static DictionaryDao instance = null;

    public static DictionaryDao Instance() {
        if (instance == null) {
            synchronized (DictionaryDao.class) {
                if (instance == null) {
                    instance = new DictionaryDao();
                }
            }
        }
        return instance;
    }
    Validation va  = new Validation();
    HashMap<String, String> dhm = new HashMap<>();

    public boolean addWord() {
        System.out.println("------------- Add -------------");
        String eng = va.getInputString("Enter english");
        
        if (!va.checkKeyExist(dhm, eng)) {
           if(!va.checkInputYN()){
               return false;
           }
        }
        String viet = va.getInputString("Enter Vietnamese");
        dhm.put(viet, viet);
        return true;
    }
    
    public boolean removeWord(){
        System.out.println("------------ Delete ------------");
        if(dhm.isEmpty()){
            System.out.println("Database does not exist");
            return false;
        }
        String eng = va.getInputString("Enter english");
        dhm.remove(eng);
        return true;
    }
    
    public void translate(){
        System.out.println("----------- Translate -----------");
        if(dhm.isEmpty()){
            System.out.println("Database does not exist");
            return;
        }
        String eng = va.getInputString("Enter english");
        Set<String> key = dhm.keySet();
        for (String o : key) {
           if(eng.equalsIgnoreCase(o)){
               System.out.println("Vietnamese: "+ dhm.get(o));
               return;
           }
        }
        System.out.println("Not found in data");
    }
}