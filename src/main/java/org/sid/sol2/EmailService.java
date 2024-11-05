package org.sid.sol2;

public class EmailService implements NotificationService{
    @Override
    public void notify(Employee employee) {
        System.out.println("Sending email to " + employee.getName() + " with status: " + employee.getStatus());
    }
}
