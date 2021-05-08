package Day4.HW2.Abstract;

import Day4.HW2.Entities.*;

public abstract class BaseCustomerManager implements ICostumerService{
    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Saved to db: " + customer.firstName);
    }
}
