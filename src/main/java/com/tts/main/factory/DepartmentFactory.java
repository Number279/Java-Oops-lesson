package com.tts.main.factory;

import java.text.DecimalFormat;

public class DepartmentFactory {

    // this is a static method that we can directly call
    // and it accepts an enum of type department name
    public static Department createDepartment(DepartmentName name, String managerName){

        // we need to define and initialize a Department instance
        Department department = null;

        //utilize a switch statement takes care of our factory logic
        switch (name) {
            case SALES -> department = new Department("Sales",managerName);
            case FINANCE -> department = new Department("Finance","Jenny");
            case SERVICE -> department = new Department("Service","Tim");
            default -> System.out.println("invalid");
        }

        return department;
    }
}
