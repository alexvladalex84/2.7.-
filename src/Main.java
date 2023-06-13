import employee.service.EmployeeBookServiceImpl;

public class Main {
    public static void main(String[] args) {

        EmployeeBookServiceImpl employee = new EmployeeBookServiceImpl();
        employee.addWorkers("Алекс", "Александров", "Владимирович");
        employee.addWorkers("Алекров", "Александр", "Владимирович");
        employee.addWorkers("Алсандров", "Александр", "Владимирович");
        employee.addWorkers("Александрв", "Ор", "Владимировч");

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        employee.removeWorkers("Алекс", "Александров", "Владимирович");
        employee.removeWorkers("Александрв", "Ор", "Владимировч");


        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        employee.findWorkers("Алекс", "Александров", "Владимирович");
        employee.findWorkers("Алсандров", "Александр", "Владимирович");

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        employee.listAllWorkers();

    }
}