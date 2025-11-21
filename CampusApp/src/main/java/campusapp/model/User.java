package campusapp.model;

public class User {

    private String name;
    private String id850;   // must start with 850 and be 9 digits

    public User(String name, String id850) {
        this.name = name;
        this.id850 = id850;
    }

    public String getName() {
        return name;
    }

    public String getId850() {
        return id850;
    }

    public boolean matches(String name, String id) {
        return this.name.equalsIgnoreCase(name) &&
                this.id850.equals(id);
    }
}

