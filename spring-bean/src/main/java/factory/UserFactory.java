package factory;

import bean.User;

public interface UserFactory {

    default User createUser(){
        return User.createUser();
    }
}
