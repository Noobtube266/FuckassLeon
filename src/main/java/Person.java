public class Person {
    private final long id = 18;
    private String name;

    public Person(long id, String name) {
        this.name = name;
    }
    public Person(){
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}