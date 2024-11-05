package org.sid.sol2;

public class EmployeeManager {
    private NotificationService notificationService;

    public EmployeeManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void changeEmployeeStatus(Employee employee, String newStatus) {
        employee.setStatus(newStatus);
        notificationService.notify(employee);
    }
}
