public class Student {
    // Private fields
    private String id;
    private String name;
    private String email;
    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'id'
    public void setId(String id) {
        this.id = id;
    }

    // Getter method for 'id'
    public String getId() {
        return id;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello Pelin");
        Student s = new Student();
        s.setId("1");
        s.setName("Amritya Ranga");
        s.setEmail("RajrangaAmrity@gmail.com");
        System.out.println("ID: " + s.getId() + ", Name: " + s.getName() + ", Email: " + s.getEmail());

    }
}

