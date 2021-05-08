package Day4.HW2.Concrete;

import Day4.HW2.Abstract.*;
import Day4.HW2.Entities.*;

public class CustomerCheckManager implements ICustomerCheckService {

    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
