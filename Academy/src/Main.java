import departments.*;

public class Main {
    public static void main(String[] args) {
        //реализация расчёта зарплаты сотрудникам Вычислительного центра

        AcountingDepartment acountingDepartment = new AcountingDepartment();

        acountingDepartment.nameOfDepartment = "АТТ";//имя отдела
        acountingDepartment.amountOfWorkers =  26;//количество работников
        acountingDepartment.idEmployee = 3151;//идентификатор сотрудника
        acountingDepartment.nameOfEmployee = "Иван";//имя сотрудника
        acountingDepartment.surnameOfEmployee = "Дятлов";//фамилия сотрудника

        acountingDepartment.checkWorker();

        acountingDepartment.salary = 20000;//зарплата сотрудника
        acountingDepartment.coefficientOfEfficiency = 12000;//тариф сотрудника за коммунальные услуги

        System.out.println();

        System.out.println("Наименование отдела: " + acountingDepartment.nameOfDepartment + ".");
        System.out.println();
        System.out.println("Имя и фамилия сотрудника: " + acountingDepartment.surnameOfEmployee
                + " " + acountingDepartment.nameOfEmployee + ".");
        System.out.println("Заработная плата сотрудника: " + (int)acountingDepartment.salary + " Рублей.");

        acountingDepartment.countingTheSalary();

        System.out.println("Заработная плата, включая премии и вычеты: " +
                (int) acountingDepartment.salary + " Рублей.");
    }
}