public class Passenger {

    private String name;
    private int ID;
    private int contactInfo;

    Passenger(String name, int ID, int contactInfo){
        this.name = name;
        this.ID = ID;
        this.contactInfo = contactInfo;
    }
//    getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(int contactInfo) {
        this.contactInfo = contactInfo;
    }

}
