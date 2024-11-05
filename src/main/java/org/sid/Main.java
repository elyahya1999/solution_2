package org.sid;

import org.sid.sol2.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IoCContainer container = new IoCContainer();
        container.registerService(NotificationService.class, new EmailService());

        Employee employee = new Employee("said sylvie", "Active");
        EmployeeManager manager = new EmployeeManager(container.getService(NotificationService.class));
        manager.changeEmployeeStatus(employee, "no active");

        IoCContainer containerS = new IoCContainer();
        containerS.registerService(NotificationService.class, new SMSSerivce());

        Employee employe = new Employee("said ", "Active");
        EmployeeManager managers = new EmployeeManager(container.getService(NotificationService.class));
        manager.changeEmployeeStatus(employe, "night shift");
    }
}