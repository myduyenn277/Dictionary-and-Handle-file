package DictionaryManager.repository;

import DictionaryManager.dataAccess.DictionaryDao;

public class DictonaryRepository implements IDictionaryRepository{

    @Override
    public void addWord() {
        if(DictionaryDao.Instance().addWord()){
            System.out.println("Successful");
        }else{
            System.out.println("Unsuccessful");
        }
    }

    @Override
    public void removeWord() {
        if(DictionaryDao.Instance().removeWord()){
            System.out.println("Successful");
        }else{
            System.out.println("Unsuccessful");
        }
    }

    @Override
    public void translate() {
        DictionaryDao.Instance().translate();
    }
    
}
