package com.loose.coupling;

public class UserManager {
    private UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfor() {

        return userDataProvider.getUserDetails();
    }

}
