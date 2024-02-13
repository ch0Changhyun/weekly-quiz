package contactManagement;

import java.util.*;
public class ContactManageMain {
    public static List<Contact> contacts = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            options();
            int sel = sc.nextInt();
            switch (sel){
                case 1:
                    addBusinessCall(sc);
                    break;
                case 2:
                    addPersonalCall(sc);
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.print("검색할 이름 입력 : ");
                    String name = sc.next();
                    searchCall(name);
                    break;
                case 5:
                    System.out.println("프로그램 종료!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("선택지가 없습니다. 다시 선택 바람!!");
            }

        }
    }
    public static void options(){
        System.out.println("==============================");
        System.out.println("1. 비지니스 연락처 추가");
        System.out.println("2. 개인 연락처 추가");
        System.out.println("3. 연락처 출력");
        System.out.println("4. 연락처 검색");
        System.out.println("5. 프로그램 종료");
        System.out.println("==============================");
        System.out.print("메뉴를 선택해주세요 >> ");
    }
    public  static void addBusinessCall(Scanner sc){
        System.out.print("이름을 입력하세요: ");
        String name = sc.next();
        System.out.print("전화번호를 입력하세요: ");
        String call = sc.next();
        System.out.print("회사명을 입력하세요: ");
        String company = sc.next();
        contacts.add(new BusinessCall(name, call, company));

        System.out.println("비지니스 연락처가 추가되었습니다.\n");
    }
    public static void addPersonalCall(Scanner sc) {
        System.out.print("이름을 입력하세요: ");
        String name = sc.next();
        System.out.print("전화번호를 입력하세요: ");
        String call = sc.next();
        System.out.print("관계를 입력하세요: ");
        String relationship = sc.next();

        PersonalCall personalCall = new PersonalCall(name, call, relationship);
        contacts.add(personalCall);

        System.out.println("개인 연락처가 추가되었습니다.\n");
    }
    public static void display() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.\n");
            return;
        }
        for (Contact contact : contacts) {
            contact.display();
        }
    }

    public static void searchCall(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contact.display();
                return;
            }
        }
        System.out.println("연락처를 찾을 수 없습니다.\n");
    }
}
