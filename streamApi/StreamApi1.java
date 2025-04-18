package streamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamApi1 {
    public static void main(String[] args) {
        // List<Employee> employees = new ArrayList<>();
        //
        // employees.add(new Employee(25, "ram", "CS"));
        // employees.add(new Employee(30, "shyam", "Mechanical"));
        // employees.add(new Employee(55, "ashish", "IT"));
        // employees.add(new Employee(46, "karan", "IT"));
        // employees.add(new Employee(48, "ankita", "IT"));

        // List<Employee> itEmployees = new ArrayList<>();
        // for(Employee employee: employees) {
        // if(employee.getDepartment().equals("IT")) {
        // itEmployees.add(employee);
        // }
        // }

        // Collections.sort(itEmployees, new java.util.Comparator<Employee>(){
        // public int compare(Employee e1, Employee e2) {
        // return e1.getName().compareTo(e2.getName());
        // }
        // });

        // itEmployees.sort(Comparator.comparing(Employee::getName));
        //
        //
        // for(Employee employee:itEmployees) {
        // System.out.println(employee.getName());
        // }

        // using stream API

        // List<Employee> itEmployees = employees.stream()
        // .filter(employee -> employee.getDepartment().equals("IT"))
        //// .sorted((e1,e2) -> e1.getName().compareTo(e2.getName()))
        //// .sorted(Comparator.comparing(Employee::getName))
        // .sorted()
        // .collect(Collectors.toList());
        //
        // itEmployees.stream().forEach(employee->
        // System.out.println(employee.getName()));

        // 1. Even Numbers
        // List<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        //
        // List<Integer> evenList = list.stream().filter(num -> num%2 ==
        // 0).collect(Collectors.toList());
        // evenList.stream().forEach(num -> System.out.println(num));

        // 2. startWith 1
        // List<Integer> list = Arrays.asList(11, 22, 14, 55, 198, 67);
        // for(Integer val : list) {
        // if(String.valueOf(val).startsWith("1")) {
        // System.out.println(val);
        // }
        // }

        // List<Integer> startwithA = list.stream().map(s -> String.valueOf(s)).filter(s
        // -> s.startsWith("1")).map(in->
        // Integer.parseInt(in)).collect(Collectors.toList());
        // startwithA.stream().forEach(s->System.out.println(s));

        // 3.find first element of list
        // List<Integer> list = Arrays.asList(11, 22, 14, 55, 198, 67);
        // list.stream().findAny().ifPresent(System.out::println);

        // 4. tottal number of elements
        // List<Integer> list = Arrays.asList(11, 22, 14, 55, 198, 67);
        // long num = list.stream().count();
        // System.out.println(num);

        //////////////////////////////////////////////////////////////// Important
        //////////////////////////////////////////////////////////////// questions

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(25, "ram", "CS", "Male", "Delhi", 20000));
        employees.add(new Employee(26, "arju", "CS", "Female", "Noida", 30000));
        employees.add(new Employee(27, "raju", "IT", "Male", "Delhi", 40000));
        employees.add(new Employee(28, "ankita", "IT", "Female", "Noida", 50000));
        employees.add(new Employee(31, "anchal", "IT", "Female", "Delhi", 60000));
        employees.add(new Employee(29, "shyam", "MA", "Male", "Noida", 80000));
        employees.add(new Employee(30, "sonam", "MA", "Female", "Delhi", 90000));

        // 1.Find list of employees whose name starts with alphabet A

        // List<Employee> empStartWithA = employees.stream().filter(emp ->
        // emp.getName().startsWith("a"))
        // .collect(Collectors.toList());
        // empStartWithA.forEach(emp -> System.out.println(emp.getName()));

        // 2.Group The employees By Department Names
        // Map<String, List<Employee>> empgroupByDepa = employees.stream()
        //// .collect(Collectors.groupingBy(emp -> emp.getDepartment()));
        // .collect(Collectors.groupingBy(Employee::getDepartment));
        //
        // for (Map.Entry<String, List<Employee>> empdepartment :
        // empgroupByDepa.entrySet()) {
        // for (Employee emp : empdepartment.getValue()) {
        // System.out.println(empdepartment.getKey() + " : " + emp.getName());
        // }
        // }

        // 3.Find the total count of employees using stream
        // Long employeecount = employees.stream().count();
        // System.out.println(employeecount);

        // 4.Find the max age of employees
        //// Optional<Employee> maxage =
        // employees.stream().max(Comparator.comparingInt(Employee::getAge));
        // Optional<Employee> maxage = employees.stream().max((e1,e2)->
        // Integer.compare(e1.getAge(), e2.getAge()));
        // maxage.ifPresent(employee-> System.out.println(employee.getAge()));

        // 5.Find all department names
        // List<String> departmentName = employees.stream().map(e->
        // e.getDepartment()).collect(Collectors.toList());
        // departmentName.stream().forEach(name-> System.out.println(name));

        // 6.Find the count of employee in each department
        // Map<String, Long> deptCountMap = employees.stream()
        // .collect(Collectors.groupingBy(Employee::getDepartment,
        // Collectors.counting()));
        //// .collect(Collectors.groupingBy(e-> e.getDepartment(),
        // Collectors.counting()));
        //
        // for (Map.Entry<String, Long> dept : deptCountMap.entrySet()) {
        // System.out.println(dept.getKey() + " : " + dept.getValue());
        // }

        // 7.Find the list of employees whose age is less than 30
        // List<Employee> lessthan30AgeEmp = employees.stream().filter(e->
        // e.getAge()<30).collect(Collectors.toList());
        // lessthan30AgeEmp.forEach(e-> System.out.println(e.getAge()));

        // 8.Find the list of employees whose age is in between 26 and 31
        // List<Employee> AgeEmp = employees.stream().filter(e -> e.getAge() > 26 &&
        // e.getAge() < 31).collect(Collectors.toList());
        // AgeEmp.forEach(e -> System.out.println(e.getAge()));

        // 9.Find the average age of male and female employee
        // Map<String, Double> averageAge=
        // employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
        // averageAge.forEach((k,v)-> System.out.println(k +" : "+ v));

        // 10.Find the department who is having maximum number of employee
        // Map<String, Long> countdept =
        // employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
        // Collectors.counting()));
        // Optional<Entry<String, Long>> maxdept =
        // countdept.entrySet().stream().max((e1,e2)-> Long.compare(e1.getValue(),
        // e2.getValue()));
        // maxdept.ifPresent(e-> System.out.println(e.getKey()+":"+e.getValue()));

        // 11.Find the Employee who stays in Delhi and sort them by their names
        //// List<Employee> fromDelhi = employees.stream().filter(e->
        // e.getCity().equals("Delhi")).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        // List<Employee> fromDelhi = employees.stream().filter(e->
        // e.getCity().equals("Delhi")).sorted((e1,e2)->
        // e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
        // fromDelhi.forEach(e-> System.out.println(e.getName() + " : " + e.getCity()));

        // 12. Find the average salary in all departments
        // Map<String, Double> empl =
        // employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
        // Collectors.averagingInt(Employee::getSalary)));
        // empl.forEach((k,v)-> System.out.println(k+":"+v));

        // 13. Find the highest salary in each department
        // Map<String, Optional<Employee>> highestSalForEachDedpt =
        // employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
        // Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
        // for(Map.Entry<String,Optional<Employee>> emp :
        // highestSalForEachDedpt.entrySet()) {
        // System.out.println(emp.getKey() + " : " + emp.getValue().get().getSalary());
        // }

        // 14.Find the list of employee and sort them by their salary
        // List<Employee> emp =
        // employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        // emp.forEach(e-> System.out.println(e.getSalary()));

        // 15.Find the employee who has second lowest salary
        // Employee emp =
        // employees.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst().get();
        // System.out.println(emp.getSalary());
    }
}
