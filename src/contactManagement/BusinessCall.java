package contactManagement;

public class BusinessCall extends Contact{
    private String company;

    public BusinessCall(String name, String callNum, String company){
        super(name, callNum);
        this.company = company;
    }
    public String getCompany(){
        return company;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("회사명 = " + getCompany());
        System.out.println("------------------------------");

    }
}
