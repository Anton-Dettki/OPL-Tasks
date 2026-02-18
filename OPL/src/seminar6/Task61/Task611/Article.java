package seminar6.Task61.Task611;

public class Article {
    protected static int counter = 0;
    protected String id;
    protected String name;

    public Article(String id, String name) {
        this.id = id;
        this.name = name;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
