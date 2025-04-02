import java.util.*;
class Contact_Manager {
    Map<String,String> Contacts = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    public  void createContact(){
        String name;
        String Phno;
        System.out.println("Enter the name: ");
        name = sc.next();
        if(Contacts.containsKey(name)){
            System.out.println("A contact number already exists in the Contact Manager");
        }
        else{
            System.out.println("Enter the Phno:");
            Phno = sc.next();
            Contacts.put(name, Phno);
        }
    }
    public void updateContact(){

    }
    public void deleteContact(){

    }
    public void displayContacts(){
        for(Map.Entry<String,String> entry: Contacts.entrySet()){
            System.out.println();
            System.out.print("Name: "+entry.getKey());
            System.out.print("      Phone Number: "+entry.getValue());
            System.out.println();
        }
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Contact_Manager cm = new Contact_Manager();
        while(flag){
            System.out.println("Enter your choice");
            System.out.println("1. Create a new contact");
            System.out.println("2. Update an existing contact");
            System.out.println("3. Delete an existing contact");
            System.out.println("4. Display contacts");
            int entry = sc.nextInt();
            switch(entry){
                case 1:
                    cm.createContact();
                    break;
                case 2:
                    cm.updateContact();
                    break;
                case 3:
                    cm.deleteContact();
                    break;
                case 4:
                    cm.displayContacts();
                    break;
                default:
                    System.out.println("Invalid Entry");
                    break;
            }
            String cont;
            System.out.println("Do you want to continue [YES/NO] : ");
            cont = sc.next();
            if(!cont.equalsIgnoreCase("yes")){
                flag = false;
            }
        }
    }
}

