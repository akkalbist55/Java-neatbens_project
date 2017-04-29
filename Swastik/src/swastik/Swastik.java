package swastik;


public class Swastik {

    private final int id;
    private final String name;
    private final String email;
    private final String address;
    
    public Swastik (int pid, String pname, String pemail, String paddress) {
        this.id = pid;
        this.name = pname;
        this.email = pemail;
        this.address = paddress;
    }
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress() {
        return address;
    }
        
}
