public class Main {


    private static int i;

    public static void main(String[] args) {


        Employee employee = new Employee();
        employee.FullName = "Otto fon Bismark";
        employee.email = "Otto_Mark@mail.ru";
        employee.cellPhone = "8-928-84-120";
        employee.Salary = "7.000 USD";
        employee.age = "43";


        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Sergey", "Serg@mail.ru", "8-333-834-3", "2500 USD", "34");
        employees[1] = new Employee("Ivan", "Vanya@inbox.ru", "8-892-34-11", "1500 USD", "43");
        employees[2] = new Employee("Evgeniy", "Zhe@mail.ru", "3-943-23-13", "1250 USD", "31");
        employees[3] = new Employee("Zakhar", "Zaha@yandex.ru", "4-4434-22-1", "1800 USD", "44");

        //for(Employee employee1: employees);

        /*for(int i = 0; i < employees.length; i++);            //ТУт не совсем разобрался как правильно. Пятое задание вызвать с помощью цикла инфу о сорокалетних
        if(employees[i].age > 40)
            employees[i].print();*/


        System.out.println(" сотрудник: " + employee.FullName + "." + " email: " + employee.email + "." + " телефон: " + employee.cellPhone + "." + " зарплата: " + employee.Salary + "." + " возраст: " + employee.age + ".");

}
}
