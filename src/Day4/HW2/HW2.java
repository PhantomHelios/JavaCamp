package Day4.HW2;

import Day4.HW2.Abstract.BaseCustomerManager;
import Day4.HW2.Concrete.NeroCustomerManager;
import Day4.HW2.Entities.Customer;

import java.util.Date;

public class HW2 {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager=new NeroCustomerManager();
        customerManager.save(new Customer(1,"İsa","Karahan",new Date(2000,7,5),"1234123412"));
    }
}
