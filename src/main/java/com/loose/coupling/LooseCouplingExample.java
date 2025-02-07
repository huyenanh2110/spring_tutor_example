package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDatabaseProvider dataProvider = new UserDatabaseProvider();
        UserManager userManager = new UserManager(dataProvider);
        System.out.println(userManager.getUserInfor());

        UserDataProvider userDataProvider = new WebServiceDataProvider();
        UserManager webServiceUserManager = new UserManager(userDataProvider);
        System.out.println(webServiceUserManager.getUserInfor());
    }
}
