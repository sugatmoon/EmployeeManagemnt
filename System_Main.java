
public class System_Main {
    public static void main(String[] args) {

        
        boolean flag = true;
        
        System.out.println("***Employee Mangement System***");

        EmployeeData eData  = new EmployeeData();
        
        do{

            System.out.printf(" 1) VIEW\n 2) ADD\n 3) UPDATE\n 4) DELETE\n 5) EXIT\n\n->");
            int option = Integer.parseInt(IO.readln());

            switch (option) {
                case 1:
                    eData.viewAll();
                    // VIEW();
                    break;
                case 2:
                    // ADD();
                    break;
                case 3:
                    // UPDATE();
                    break;
                case 4:
                    // DELETE();
                    break;
                case 5:
                    // EXIT();
                    flag = false;
                    System.out.println("EXIT Sucessfully !!!!!!!!");
                    break;
            
                default:
                    System.out.println("Please Inter Valid Input !!");
            }
        
        }while(flag);

    }
}
