package Day4.HW2.Adapter;

import Day4.HW2.Abstract.ICustomerCheckService;
import Day4.HW2.Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }

}
