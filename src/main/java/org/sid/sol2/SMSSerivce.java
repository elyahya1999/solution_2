package org.sid.sol2;

public class SMSSerivce implements NotificationService{
    @Override
    public void notify(Employee employee) {
        System.out.println("Sending SMS to " + employee.getName() + " with status: " + employee.getStatus());
    }
}
