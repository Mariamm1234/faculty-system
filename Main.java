package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<student> sn = new ArrayList<>();

   public static void addStudent() {

        Scanner sc = new Scanner(System.in);
        String z;
        boolean h=true;
        do {
            try {
                for (int i = 0; i <= sn.size(); i++) {
                    student s = new student();
                    System.out.println("enter id");
                    s.setID(sc.nextInt());
                    sc.nextLine();
                    System.out.println("enter name");
                    s.setName(sc.nextLine());
                    System.out.println("enter age");
                    s.setAge(sc.nextInt());
                    System.out.println("enter gender");
                    s.setGender(sc.next());
                    System.out.println("enter address");
                    s.setAddress(sc.next());
                    System.out.println("college is "+s.getCollege());
                    System.out.println("enter GPA");
                    s.setGPA(sc.nextDouble());
                    System.out.println("enter level");
                    s.setLevel(sc.nextInt());
                    System.out.println("enter department");
                    s.department = sc.next();
                    sn.add(s);
                    System.out.print("Do you want to add new student ? (yes/no)");
                    z = sc.next();
                    z= z.toUpperCase();
                    if(z.equals("NO"))
                    {  h=false;
                        break;}
                }
            } catch (Exception e) {
                System.out.println("You entered  wrong data");
                break;
            }
        }
        while (h);
    }

    public static void showStudent() {
        for (int i = 0; i < sn.size(); i++) {

            student r = sn.get(i);
            r.toString();
        }
    }

    public static void editStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID please ");
        int id = sc.nextInt();
        try {
            for (int i = 0; i < sn.size(); i++) {
                student r = sn.get(i);
                if (r.getID() == id) {
                    sc.nextLine();
                    System.out.println("enter name");
                    r.setName(sc.nextLine());
                    System.out.println("enter age");
                    r.setAge(sc.nextInt());
                    System.out.println("enter gender");
                    r.setGender(sc.next());
                    System.out.println("enter address");
                    r.setAddress(sc.next());
                    System.out.println("college is "+r.getCollege());
                    System.out.println("enter GPA");
                    r.setGPA(sc.nextDouble());
                    System.out.println("enter level");
                    r.setLevel(sc.nextInt());
                    System.out.println("enter department");
                    r.department = sc.next();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("you entered wrong data ");
        }

    }

    public static void removeStudent() {
        Scanner sc = new Scanner(System.in);
        int x =sn.size();
        System.out.println("Enter the ID please ");
        int id = sc.nextInt();
        for (int i = 0; i < sn.size(); i++) {
            student r = sn.get(i);
            if (r.getID() == id) {
                sn.remove(r);
                x=x-1;
                break;
            }
        }
System.out.println("  Data is deleted....");
    }

    public static void searchStudent() {
        Scanner sc = new Scanner(System.in);
        int id_search;
        boolean flag = false;
        System.out.println("Enter the ID please ");
        id_search = sc.nextInt();
        for (int i = 0; i < sn.size(); i++) {
            student c = sn.get(i);
            if (c.getID() == id_search) {
                flag = true;
                c.toString();
                break;
            }
        }
        if (flag==false)
            System.out.println("Not found");
    }

    static ArrayList<worker> wn = new ArrayList<>();

    public static void addWorker() {
        Scanner sc = new Scanner(System.in);
        String z;
        boolean h=true;
        do {
            try {
                for (int i = 0; i <= wn.size(); i++) {
                    worker w = new worker();
                    System.out.println("enter id");
                    w.setID(sc.nextInt());
                    sc.nextLine();
                    System.out.println("enter name");
                    w.setName(sc.nextLine());
                    System.out.println("enter age");
                    w.setAge(sc.nextInt());
                    System.out.println("enter gender");
                    w.setGender(sc.next());
                    System.out.println("enter address");
                    w.setAddress(sc.next());
                    System.out.println("enter hire date");
                    w.HireDate=new Date();
                    System.out.println("enter day");
                    w.HireDate.setDay(sc.nextInt());
                    System.out.println("enter month");
                    w.HireDate.setMonth(sc.nextInt());
                    System.out.println("enter year");
                    w.HireDate.setYear(sc.nextInt());
                   System.out.println( "college is "+w.getCollege());
                    System.out.println("enter salary");
                    w.setSalary(sc.nextDouble());
                    System.out.println("enter bonus");
                    w.Bonus = sc.nextInt();
                    System.out.println("Total salary after bonus and const deduction = "+ w.totalSalary());
                    wn.add(w);
                    System.out.print("Do you want to add new worker ? (yes/no)");
                    z = sc.next();
                   z= z.toUpperCase();
                    if(z.equals("NO"))
                    {h=false;
                    break;}
                }
            } catch (Exception e) {
                System.out.println("You entered  wrong data");
                break;
            }


        }
        while (h);
    }

    public static void showWorker() {
        for (int i = 0; i < wn.size(); i++) {

            worker x = wn.get(i);
            x.toString();
        }
    }

    public static void editWorker() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID please ");
        int id = sc.nextInt();
        try {
            for (int i = 0; i < wn.size(); i++) {
                worker x = wn.get(i);
                if (x.getID() == id) {
                    sc.nextLine();
                    System.out.println("enter name");
                    x.setName(sc.nextLine());
                    System.out.println("enter age");
                    x.setAge(sc.nextInt());
                    System.out.println("enter gender");
                    x.setGender(sc.next());
                    System.out.println("enter address");
                    x.setAddress(sc.next());
                    System.out.println( "college is "+x.getCollege());
                    System.out.println("enter salary");
                    x.setSalary(sc.nextDouble());
                    System.out.println("enter bonus");
                    x.Bonus = sc.nextInt();
                    System.out.println("Total salary after bonus and const deduction = "+ x.totalSalary());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("you entered wrong data ");
        }
    }

    public static void removeWorker() {
        Scanner sc = new Scanner(System.in);
        int x =wn.size();
        System.out.println("Enter the ID please ");
        int id = sc.nextInt();
        for (int i = 0; i < wn.size(); i++) {
            worker w = wn.get(i);
            if (w.getID() == id) {
                wn.remove(w);
                x=x-1;
                break;
            }
        }
        System.out.println("  Data is deleted....");
    }

    public static void searchWorker() {
        Scanner sc = new Scanner(System.in);
        int id_search;
        boolean flag = true;
        System.out.println("Enter the ID please ");
        id_search = sc.nextInt();
        for (int i = 0; i < wn.size(); i++) {
            worker x = wn.get(i);
            if (x.getID() == id_search) {
                flag = true;
                x.toString();
                break;
            }

        }
        if (!flag)
            System.out.println("Not found");
    }

    static ArrayList<instructors> In = new ArrayList<>();

    public static void addInstructor() {
        Scanner sc = new Scanner(System.in);
        String z;
        boolean h=true;
        do {
            try {
                for (int i = 0; i <= In.size(); i++) {
                    instructors y = new instructors();
                    System.out.println("enter id");
                    y.setID(sc.nextInt());
                    sc.nextLine();
                    System.out.println("enter name");
                    y.setName(sc.nextLine());
                    System.out.println("enter age");
                    y.setAge(sc.nextInt());
                    System.out.println("enter gender");
                    y.setGender(sc.next());
                    System.out.println("enter address");
                    y.setAddress(sc.next());
                    System.out.println("enter hire date");
                   y.HireDate=new Date();
                    System.out.println("enter day");
                    y.HireDate.setDay(sc.nextInt());
                    System.out.println("enter month");
                    y.HireDate.setMonth(sc.nextInt());
                    System.out.println("enter year");
                    y.HireDate.setYear(sc.nextInt());
                   System.out.println("college is "+y.getCollege());
                    System.out.println("enter salary");
                    y.setSalary(sc.nextDouble());
                    System.out.println("enter bonus");
                    y.Bonus = sc.nextInt();
                    System.out.println("Total salary after bonus and deduction = "+y.totalSalary());
                    System.out.println("enter department");
                    y.setDepartment(sc.next());
                    System.out.println("enter material");
                    y.setMaterial(sc.next());
                    In.add(y);
                    System.out.print("Do you want to add new Instructor ? (yes/no)");
                    z = sc.next();
                   z= z.toUpperCase();
                   if(z.equals("NO"))
                   {h=false;
                       break;}
                }
            } catch (Exception e) {
                System.out.println("You entered  wrong data");
                break;
            }


        }
        while (h);
    }

    public static void showInstructor() {
        for (int i = 0; i < In.size(); i++) {

            instructors y = In.get(i);
            y.toString();
        }
    }

    public static void editInstructor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID please ");
        int id = sc.nextInt();
        try {
            for (int i = 0; i < In.size(); i++) {
                instructors y = In.get(i);
                if (y.getID() == id) {
                    sc.nextLine();
                    System.out.println("enter name");
                    y.setName(sc.nextLine());
                    System.out.println("enter age");
                    y.setAge(sc.nextInt());
                    System.out.println("enter gender");
                    y.setGender(sc.next());
                    System.out.println("enter address");
                    y.setAddress(sc.next());
                    System.out.println("college is "+y.getCollege());
                    System.out.println("enter salary");
                    y.setSalary(sc.nextDouble());
                    System.out.println("enter bonus");
                    y.Bonus = sc.nextInt();
                    System.out.println("Total salary after bonus and deduction = "+y.totalSalary());
                    System.out.println("enter department");
                    y.setDepartment(sc.next());
                    System.out.println("enter material");
                    y.setMaterial(sc.next());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("you entered wrong data ");
        }
    }

    public static void removeInstructor() {
        Scanner sc = new Scanner(System.in);
        int x = In.size();
        System.out.println("Enter the ID please ");
        int id = sc.nextInt();
        for (int i = 0; i < In.size(); i++) {
            instructors y = In.get(i);
            if (y.getID() == id) {
                In.remove(y);
                x=x-1;
                break;
            }
        }
        System.out.println("  Data is deleted....");
    }

    public static void searchInstructor() {
        Scanner sc = new Scanner(System.in);
        int id_search;
        boolean flag = true;
        System.out.println("Enter the ID please ");
        id_search = sc.nextInt();
        for (int i = 0; i < In.size(); i++) {
            instructors y = In.get(i);
            if (y.getID() == id_search) {
                flag = true;
                y.toString();
                break;
            }

        }
        if (!flag)
            System.out.println("Not found");
    }

    static ArrayList<Administrator> an = new ArrayList<>();

    public static void addAdministrator() {
        Scanner sc = new Scanner(System.in);
        String z;
        boolean h= true;
        do {
            try {
                for (int i = 0; i <= an.size(); i++) {
                    Administrator a = new Administrator();
                    System.out.println("enter id");
                    a.setID(sc.nextInt());
                    sc.nextLine();
                    System.out.println("enter name");
                    a.setName(sc.nextLine());
                    System.out.println("enter age");
                    a.setAge(sc.nextInt());
                    System.out.println("enter gender");
                    a.setGender(sc.next());
                    System.out.println("enter address");
                    a.setAddress(sc.next());
                    System.out.println("enter hire date");
                    a.HireDate=new Date();
                    System.out.println("enter day");
                    a.HireDate.setDay(sc.nextInt());
                    System.out.println("enter month");
                    a.HireDate.setMonth(sc.nextInt());
                    System.out.println("enter year");
                    a.HireDate.setYear(sc.nextInt());
                   System.out.println( "college is "+a.getCollege());
                    System.out.println("enter salary");
                    a.setSalary(sc.nextDouble());
                    System.out.println("enter bonus");
                    a.Bonus = sc.nextInt();
                    System.out.println("Total salary after bonus and deduction = "+ a.totalSalary());
                    System.out.println("enter department");
                    a.setDepart(sc.next());
                    an.add(a);
                    System.out.print("Do you want to add new Administrator ? (yes/no)");
                    z = sc.next();
                   z= z.toUpperCase();
                    if(z.equals("NO"))
                    {
                        h=false;
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("You entered  wrong data");
                break;
            }
        }
        while (h);
    }

    public static void showAdministrator() {
        for (int i = 0; i < an.size(); i++) {

            Administrator z = an.get(i);
            z.toString();
        }
    }

    public static void editAdministrator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID please ");
        int id = sc.nextInt();
        try {
            for (int i = 0; i < an.size(); i++) {
                Administrator z = an.get(i);
                if (z.getID() == id) {
                    sc.nextLine();
                    System.out.println("enter name");
                    z.setName(sc.nextLine());
                    System.out.println("enter age");
                    z.setAge(sc.nextInt());
                    System.out.println("enter gender");
                    z.setGender(sc.next());
                    System.out.println("enter address");
                    z.setAddress(sc.next());
                    System.out.println("college is "+z.getCollege());
                    System.out.println("enter salary");
                    z.setSalary(sc.nextDouble());
                    System.out.println("enter bonus");
                    z.Bonus = sc.nextInt();
                    System.out.println("Total salary after bonus and deduction = "+ z.totalSalary());
                    System.out.println("enter department");
                    z.setDepart(sc.next());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("you entered wrong data ");
        }
    }

    public static void removeAdministrator() {
        Scanner sc = new Scanner(System.in);
        int x=an.size();
        System.out.println("Enter the ID please ");
        int id = sc.nextInt();
        for (int i = 0; i < an.size(); i++) {
            Administrator z = an.get(i);
            if (z.getID() == id) {
                an.remove(z);
                x=x-1;
                break;
            }
        }
        System.out.println("  Data is deleted....");
    }

    public static void searchAdministrator() {
        Scanner sc = new Scanner(System.in);
        int id_search;
        boolean flag = true;
        System.out.println("Enter the ID please ");
        id_search = sc.nextInt();
        for (int i = 0; i < an.size(); i++) {
            Administrator z = an.get(i);
            if (z.getID() == id_search) {
                flag = true;
                z.toString();
                break;
            }

        }
        if (!flag)
            System.out.println("Not found");
    }

    static ArrayList<technicians> tn = new ArrayList<>();

    public static void addTechnicians() {
        Scanner sc = new Scanner(System.in);
        String z;
        boolean h=true;
        do {
            try {
                for (int i = 0; i <= tn.size(); i++) {
                    technicians t = new technicians();
                    System.out.println("enter id");
                    t.setID(sc.nextInt());
                    sc.nextLine();
                    System.out.println("enter name");
                    t.setName(sc.nextLine());
                    System.out.println("enter age");
                    t.setAge(sc.nextInt());
                    System.out.println("enter gender");
                    t.setGender(sc.next());
                    System.out.println("enter address");
                    t.setAddress(sc.next());
                    System.out.println("enter hire date");
                    t.HireDate=new Date();
                    System.out.println("enter day");
                    t.HireDate.setDay(sc.nextInt());
                    System.out.println("enter month");
                    t.HireDate.setMonth(sc.nextInt());
                    System.out.println("enter year");
                    t.HireDate.setYear(sc.nextInt());
                   System.out.println("college is "+t.getCollege());
                    System.out.println("enter salary");
                    t.setSalary(sc.nextDouble());
                    System.out.println("enter bonus");
                    t.Bonus = sc.nextInt();
                    System.out.println("Total salary after bonus and deduction = "+ t.totalSalary());
                    System.out.println("enter specialize");
                    t.setSpecial(sc.next());
                    tn.add(t);
                    System.out.print("Do you want to add new Technicians ? (yes/no)");
                    z = sc.next();
                   z= z.toUpperCase();
                   if(z.equals("NO"))
                   {
                       h=false;
                       break;
                   }
                }
            } catch (Exception e) {
                System.out.println("You entered  wrong data");
                break;
            }


        }
        while (h);
    }

    public static void showTechnicians() {
        for (int i = 0; i < tn.size(); i++) {

            technicians k = tn.get(i);
            k.toString();
        }
    }

    public static void editTechnicians() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID please ");
        int id = sc.nextInt();
        try {
            for (int i = 0; i < tn.size(); i++) {
                technicians k = tn.get(i);
                if (k.getID() == id) {
                    sc.nextLine();
                    System.out.println("enter name");
                    k.setName(sc.nextLine());
                    System.out.println("enter age");
                    k.setAge(sc.nextInt());
                    System.out.println("enter gender");
                    k.setGender(sc.next());
                    System.out.println("enter address");
                    k.setAddress(sc.next());
                    System.out.println("college is "+k.getCollege());
                    System.out.println("enter salary");
                    k.setSalary(sc.nextDouble());
                    System.out.println("enter bonus");
                    k.Bonus = sc.nextInt();
                    System.out.println("Total salary after bonus and deduction = "+ k.totalSalary());
                    System.out.println("enter specialize");
                    k.setSpecial(sc.next());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("you entered wrong data ");
        }
    }

    public static void removeTechnicians() {
        Scanner sc = new Scanner(System.in);
        int x=tn.size();
        System.out.println("Enter the ID please ");
        int id = sc.nextInt();
        for (int i = 0; i < tn.size(); i++) {
            technicians k = tn.get(i);
            if (k.getID() == id) {
                tn.remove(k);
                x=x-1;
                break;
            }
        }
        System.out.println("  Data is deleted....");
    }

    public static void searchTechnicians() {
        Scanner sc = new Scanner(System.in);
        int id_search;
        boolean flag = true;
        System.out.println("Enter the ID please ");
        id_search = sc.nextInt();
        for (int i = 0; i < tn.size(); i++) {
            technicians k = tn.get(i);
            if (k.getID() == id_search) {
                flag = true;
                k.toString();
                break;
            }

        }
        if (!flag)
            System.out.println("Not found");
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write your code here
        int x;
        do {
            System.err.println("Choose your service ");
            System.out.println("  1.Student services");
            System.out.println("  2.Worker services");
            System.out.println("  3.Instructor services");
            System.out.println("  4.Administrators services");
            System.out.println("  5.Technicians services");
            System.out.println("  6.Exit services");
            x = sc.nextInt();
            int y;
            switch (x) {
                case 1:

                    System.err.println("enter number of student services ");
                    System.out.println("  1.Add student");
                    System.out.println("  2.Show student");
                    System.out.println("  3.edit student");
                    System.out.println("  4.remove student");
                    System.out.println("  5.search student");
                    y = sc.nextInt();
                    switch (y) {
                        case 1:
                            addStudent();
                            break;
                        case 2:
                            showStudent();
                            break;
                        case 3:
                            editStudent();
                            break;
                        case 4:
                            removeStudent();
                            break;
                        case 5:
                            searchStudent();
                    }
                    break;
                case 2:
                    System.err.println("enter number of worker services ");
                    System.out.println("  1.Add worker");
                    System.out.println("  2.Show worker");
                    System.out.println("  3.edit worker");
                    System.out.println("  4.remove worker");
                    System.out.println("  5.search worker");
                    y = sc.nextInt();
                    switch (y) {
                        case 1:
                            addWorker();
                            break;
                        case 2:
                            showWorker();
                            break;
                        case 3:
                            editWorker();
                            break;
                        case 4:
                            removeWorker();
                            break;
                        case 5:
                            searchWorker();
                    }
                    break;
                case 3:
                    System.err.println("enter number of instructor services ");
                    System.out.println("  1.Add instructor");
                    System.out.println("  2.Show instructor");
                    System.out.println("  3.edit instructor");
                    System.out.println("  4.remove instructor");
                    System.out.println("  5.search instructor");
                    y = sc.nextInt();
                    switch (y) {
                        case 1:
                            addInstructor();
                            break;
                        case 2:
                            showInstructor();
                            break;
                        case 3:
                            editInstructor();
                            break;
                        case 4:
                            removeInstructor();
                            break;
                        case 5:
                            searchInstructor();
                    }
                    break;
                case 4:
                    System.err.println("enter number of administrator services ");
                    System.out.println("  1.Add administrator");
                    System.out.println("  2.Show administrator");
                    System.out.println("  3.edit administrator");
                    System.out.println("  4.remove administrator");
                    System.out.println("  5.search administrator");
                    y = sc.nextInt();
                    switch (y) {
                        case 1:
                            addAdministrator();
                            break;
                        case 2:
                            showAdministrator();
                            break;
                        case 3:
                            editAdministrator();
                            break;
                        case 4:
                            removeAdministrator();
                            break;
                        case 5:
                            searchAdministrator();
                    }
                    break;
                case 5:
                    System.err.println("enter number of technicians services ");
                    System.out.println("  1.Add technician");
                    System.out.println("  2.Show technician");
                    System.out.println("  3.edit technician");
                    System.out.println("  4.remove technician");
                    System.out.println("  5.search technician");
                    y = sc.nextInt();
                    switch (y) {
                        case 1:
                            addTechnicians();
                            break;
                        case 2:
                            showTechnicians();
                            break;
                        case 3:
                            editTechnicians();
                            break;
                        case 4:
                            removeTechnicians();
                            break;
                        case 5:
                            searchTechnicians();
                    }
                    break;
                case 6:
                    System.err.println("Thanks for using our system ....\n Have a nice day ....");
            }
        }

        while (x != 6);
    }
}
