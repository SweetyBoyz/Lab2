package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Object> lst_empl = new HashMap<>();
        HashMap<String, Object> lst_empl_birthday = new HashMap<>();
        HashMap<String, Object> lst_empl_name = new HashMap<>();
        List<String> list_of_id = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        System.out.print("Printing EmployeeDB data: ");
        Employee sasha = new Employee(1, "sasha", "kvp", "1888", "Piter", 2000, true);
        sasha.print();
        System.out.println("Id человека: " + Employee.getCounter());

        int choice = -1;
        while (choice != 4) {
            System.out.print(
                    """
                            ================Main Menu Example =============
 
                            1-Приветствие
                            2-Добавить новое
                            3-Вывод
                            4-Закрыть
                            """);
            choice = in.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print(
                            """
                                    Выьерите язык
                                    1- Русский
                                    2- Английский
                                    """);
                    int lang = in.nextInt();
                    if (lang == 1) {

                        System.out.println("Добро пожаловать!");
                    } else if (lang == 2) {
                        System.out.println("Welcome!");
                    } else {
                        System.out.println("invalid input!");
                    }
                    break;
                }
                case 2: {
                    System.out.print("Ввод id");
                    int id = in.nextInt();
                    for (String s : list_of_id) {
                        if (String.valueOf(id).equals(s)) {
                            System.out.println("Айди уже существует");
                            break;
                        }
                    }
                    list_of_id.add(String.valueOf(id));
                    System.out.print("Введите имя");
                    String name = in.next();
                    System.out.print("Введите фамилию");
                    String surname = in.next();
                    System.out.print("Введите год рождения");
                    String birthday = in.next();
                    System.out.print("Введите место рождения");
                    String place = in.next();
                    System.out.print("Введите зарплату");
                    int salary = in.nextInt();
                    System.out.print("Вы женаты/замужем? true - да, false - нет");
                    boolean status = in.nextBoolean();


                    lst_empl.put(String.valueOf(id), new Employee(id, name, surname, birthday, place, salary, status));
                    lst_empl_birthday.put(birthday, new Employee(id, name, surname, birthday, place, salary, status));
                    lst_empl_name.put(name, new Employee(id, name, surname, birthday, place, salary, status));
                    break;
                }
                case 3: {
                    System.out.println(lst_empl);
                    System.out.println(lst_empl_name);
                    System.out.println(lst_empl_birthday);
                    System.out.println(list_of_id);
                    System.out.print("\n");
                    break;
                }
                case 4: {
                    System.out.println("Выход");
                    break;
                }
                // СУММА ЗАРПЛАТ
                case 5: {
                    int summa = 0;
                    List<String> keys = new ArrayList<String>(lst_empl.keySet());
                    for (int i = 0; i < keys.size(); i++) {
                        String key = keys.get(i);
                        Employee value = (Employee) lst_empl.get(key);
                        summa = summa + value.getSalary();

                    }
                    System.out.println(summa);
                    break;
                }


                default: {
                    System.out.println("Ошибка");
                }
            }
        }
    }
}