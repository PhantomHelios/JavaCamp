package Day3;

public class UserManager {
    public void add(User user) {
        System.out.printf("User added: %s %s\n",user.getFirstName(), user.getLastName());
    }

    public void add(User[] users) {
        for (User user : users) {
            add(user);
        }
        System.out.println("Users added.");
    }

    public void update(User user) {
        System.out.printf("User updated: %s %s\n",user.getFirstName(), user.getLastName());
    }

    public void delete(User user) {
        System.out.printf("User deleted: %s %s\n",user.getFirstName(), user.getLastName());
    }
}
