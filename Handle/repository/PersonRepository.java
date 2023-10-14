package Handle.repository;

import Handle.dataAccess.PersonDao;

public class PersonRepository implements IPersonRepository{

    @Override
    public void findPersonInfo() {
        PersonDao.Instance().findPersonInfo();
    }

    @Override
    public void coppyNewFile() {
        PersonDao.Instance().coppyNewFile();
    }
    
}


