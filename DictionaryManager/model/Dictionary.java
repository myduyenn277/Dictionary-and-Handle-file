package DictionaryManager.model;

public class Dictionary {
    private String E;
    private String V;

    public Dictionary() {
    }

    public Dictionary(String E, String V) {
        this.E = E;
        this.V = V;
    }

    public String getEng() {
        return E;
    }

    public void setEng(String E) {
        this.E = E;
    }

    public String getViet() {
        return V;
    }

    public void setViet(String V) {
        this.V = V;
    }

    @Override
    public String toString() {
        return "Dictionary{" + "E=" + E + ", V=" + V + '}';
    }
    
}
