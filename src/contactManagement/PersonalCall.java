package contactManagement;

public class PersonalCall extends Contact {
    private String relationship;

    public PersonalCall(String name, String callNum, String relationship) {
        super(name, callNum);
        this.relationship = relationship;
    }
    public String getRelationship(){
        return relationship;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("관계 = " + getRelationship());
        System.out.println("------------------------------");
    }
}
