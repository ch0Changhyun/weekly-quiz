package contactManagement;

public class Contact {
    private String name;
    private String callNum;

    public Contact(String name, String callNum){
        this.name = name;
        this.callNum = callNum;
    }
    public String getName(){
        return name;
    }
    public String getCallNum(){
        return callNum;
    }
    public void display(){
        System.out.println("이름 = " + getName() + ";\n연락처 = " + getCallNum() +";");
    }
}
