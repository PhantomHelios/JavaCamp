package Day4.HW2.Concrete;

import Day4.HW2.Abstract.*;
import Day4.HW2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerCheckService{

    @Override
    public void save(Customer customer) throws Exception {
        if (checkIfRealPerson(customer))
            super.save(customer);
        else
            throw new Exception("Not a real person!");
    }

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
