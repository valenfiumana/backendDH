package mesas;

public class User {
    private Integer id;
    private String type;

    public User(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
