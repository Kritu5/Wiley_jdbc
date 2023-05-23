public interface EmployeeDao {
    //Create a method to add an employee
    public void createEmployee(Employee employee) throws Exception;
    //Show all employees
    public void showAllEmployees();
    //Show employee based on id
    public void getEmployeeById(int id);
    //Update employee based on id
    public void updateEmployeeById(int id, String name);
    // Delete employee based on id
    public void deleteEmployeeById(int id);
}
