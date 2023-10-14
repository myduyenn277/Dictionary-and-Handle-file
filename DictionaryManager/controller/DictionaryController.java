package DictionaryManager.controller;

import DictionaryManager.repository.DictonaryRepository;
import DictionaryManager.repository.IDictionaryRepository;
import DictionaryManager.view.Menu;

    public class DictionaryController extends Menu<String> {
    
    static String[] mc = {"Add new word", "Delete word", "Search word", "Exit"};
    private final IDictionaryRepository dictionaryRepository;

    public DictionaryController() {
        super("DictionaryController", mc);
        dictionaryRepository = new DictonaryRepository();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                dictionaryRepository.addWord();
                break;
            }
            case 2: {
                dictionaryRepository.removeWord();
                break;
            }
            case 3: {
                dictionaryRepository.translate();
                break;
            }
            case 4:
                System.exit(0);
        }
    
    
}
}
