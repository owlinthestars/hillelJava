package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by OsadchiyO on 03.12.2015.
 */

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ivan", 4500));
        employeeList.add(new Manager("petro", 5500));

        print(employeeList);
        List<Manager>managerList = new ArrayList<>();
        managerList.add(new Manager("ivan", 4500));
        managerList.add(new Manager("petro", 5500));

        print(managerList);
        addEmployee(employeeList);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alex"));
        addEmployee(personList);

        List<Employee> copyEmployeeList = new ArrayList<>();
        copy(employeeList, copyEmployeeList);
        System.out.println(copyEmployeeList.size());

        //managerList = copy(employeeList, managerList);
        employeeList = copy(managerList,employeeList);
    }


    public static void overloadedMethod(List<Integer> integers){

    }

    public static <K, V> void copy(Pair<K, V> source,Pair<K, V> target){
        K key = source.key;
        V value = source.value;
        target.key = source.key;
        target.value = source.value;
    }

    public static <T > List<T> copy(List<? extends T > source, List<T> target){
         target.addAll(source);
         return target;
    }

    public static <T> List<T>  copyFunction(List<? extends T> source){
        List<T> target = new ArrayList<>();
         target.addAll(source);
        T element;
        return target;
    }

    public static void addEmployee(List<? super Employee > list){
        list.add(new Employee("Ivan", 500));

    }

    public static void print(List<? extends Employee> list){
        for(Employee e: list){
            System.out.println(e);
        }
    }

    private static void rawType() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ivan", 4500));
        employeeList.add(new Manager("petro", 5500));

        printEmployees(employeeList);

        List<Employee> personList = employeeList;

        printPersons(personList);

        //personList.add(new Person("Anatoliy"));

        printPersons(personList);

        printEmployees(employeeList);
    }

    private static void printEmployees(List<Employee> employeeList) {
        for(Employee e: employeeList){
            System.out.println(e);
        }
    }

    private static void printPersons(List personList) {
        for (Object o : personList){
            Person p = (Person) o;
            System.out.println(p);
        }
    }

    private static void simpleExample() {
        Employee e = new Employee("ivan", 500);
        ArrayList<Employee> arrayList = new ArrayList<>();
        List<Employee> employeeList = arrayList;
        Collection<Employee> collection = employeeList;

        employeeList.add(new Employee("ivan", 500));
        employeeList.add(new Employee("petro", 1000));

        Person p = new Employee("ivan", 500);
    }

    private static void pairExample() {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Vasya"));
        //list.add(new Object());

        Person vasya = list.get(0);
        Object o = list.get(1);

        list.add(new Employee("petr", 10));

        Pair<Employee, Manager> pair = new Pair<>();

        Employee e = pair.key;
        Manager m = pair.value;
    }
}
