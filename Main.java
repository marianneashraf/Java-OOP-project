package oop;
/*1. ماريان اشرف بشري
2. كلارا باسم فكري
3. ماري جرجس حنا
4. كيرلس جورج رفعت
5. ماريا ايمن ابراهيم
*/






import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Students> s = new ArrayList<>();
    static ArrayList<Workers> w = new ArrayList<>();
    static ArrayList<Technicians> tech = new ArrayList<>();
    static ArrayList<Adminstrators> ad = new ArrayList<>();
    static ArrayList<Instructors> ins = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("Press 1 for Students menu \nPress 2 for Workers menu \nPress 3 for Technicians menu \nPress 4 for Instructors menu \nPress 5 for Adminstrators menu  \nPress 6 to exit");

            int m = sc.nextInt();
            if (m <= 6) {
                if (m == 6) {
                    break;
                }

                if (m == 1) {
                    System.out.println("Press 1 to add a student");
                    System.out.println("Press 2 to edit a student");
                    System.out.println("Press 3 to remove a student");
                    System.out.println("Press 4 to show all students");
                    System.out.println("Press 5 to search for a specific student");
                    System.out.println("Press 6 to exit");
                    int x = sc.nextInt();
                    //add
                    if (x == 6) {
                        break;
                    }
                    if (x == 1) {
                        try {
                            Students n = new Students();
                            System.out.println("Please add your first name");
                            n.setNamef(sc.next());
                            System.out.println("Please add your last name");
                            n.setNamel(sc.next());
                            System.out.println("Please add age");
                            n.setAge(sc.nextInt());
                            while (n.getAge() > 30 || n.getAge() < 15) {
                                System.out.println("Please enter age from 15 to 30");
                                n.setAge(sc.nextInt());
                                if (n.getAge() >= 15 && n.getAge() <= 30) {
                                    break;
                                }
                            }
                            System.out.println("Please add phone number");
                            n.setPhonenum(sc.nextLong());
                            System.out.println("Please add City");
                            n.a.setCity(sc.next());
                            System.out.println("Please add Street Name");
                            n.a.setStreetName(sc.next());
                            System.out.println("Please add E-mail");
                            n.setEmail(sc.next());
                            System.out.println("Please add ID");
                            n.setId(sc.nextInt());
                            System.out.println("Please add gender");
                            n.setGender(sc.next());
                            System.out.println("Please add level");
                            n.setLevel(sc.nextInt());
                            System.out.println("Please add Gpa");
                            n.setGpa(sc.nextDouble());
                            System.out.println("Please add specialization");
                            n.setSpecialization(sc.next());

                            s.add(n);
                        } catch (Exception e) {
                            System.out.println("Wrong Data");
                            sc.next();
                        }
                    } //edit
                    else if (x == 2) {
                        System.out.println("Please enter student ID ");
                        int y = sc.nextInt();
                        try {
                            for (int i = 0; i < s.size(); i++) {
                                Students n = s.get(i);
                                if (n.getId() == y) {
                                    System.out.println("Please Edit your first name");
                                    n.setNamef(sc.next());
                                    System.out.println("Please Edit your last name");
                                    n.setNamel(sc.next());
                                    System.out.println("Please Edit age");
                                    n.setAge(sc.nextInt());
                                    System.out.println("Please Edit phone number");
                                    n.setPhonenum(sc.nextLong());
                                    System.out.println("Please Edit City");
                                    n.a.setCity(sc.next());
                                    System.out.println("Please Edit Street Name");
                                    n.a.setStreetName(sc.next());
                                    System.out.println("Please Edit E-mail");
                                    n.setEmail(sc.next());
                                    System.out.println("Please Edit ID");
                                    n.setId(sc.nextInt());
                                    System.out.println("Please Edit level");
                                    n.setLevel(sc.nextInt());
                                    System.out.println("Please Edit Gpa");
                                    n.setGpa(sc.nextDouble());
                                    System.out.println("Please Edit specialization");
                                    n.setSpecialization(sc.next());
                                    System.out.println("Please Edit gender");
                                    n.setGender(sc.next());
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Wrong Data");
                            sc.next();
                        }
                    } //remove
                    else if (x == 3) {
                        System.out.println("Please Enter ID: ");
                        int y = sc.nextInt();
                        try {
                            for (int i = 0; i < s.size(); i++) {
                                Students n = s.get(i);

                                if (n.getId() == y) {
                                    s.remove(n);

                                    break;
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Wrong Input");
                            sc.next();
                        }
                    } //show
                    else if (x == 4) {

                        for (int i = 0; i < s.size(); i++) {
                            Students n = s.get(i);
                            System.out.println(n.toString());
                        }
                    } else if (x == 5) {
                        // Search
                        System.out.println("Please Enter Student Id");
                        int id = sc.nextInt();
                        for (int i = 0; i < s.size(); i++) {
                            Students ss = s.get(i);
                            if (ss.getId() == id) {
                                System.out.println(ss.toString());
                            }
                        }
                    }
                } else if (m == 2) {
                    System.out.println("Press 1 to add worker");
                    System.out.println("Press 2 to edit worker");
                    System.out.println("Press 3 to remove worker");
                    System.out.println("Press 4 to show all workers");
                    System.out.println("Press 5 to search for a specific worker");
                    System.out.println("Press 6 to exit");
                    //add
                    int x = sc.nextInt();
                    if (x == 6) {
                        break;
                    }
                    if (x == 1) {
                        try {
                            Workers o = new Workers();
                            System.out.println("Please add your first name");
                            o.setNamef(sc.next());
                            System.out.println("Please add your last name");
                            o.setNamel(sc.next());
                            System.out.println("Please add age");
                            o.setAge(sc.nextInt());
                            while (o.getAge() > 65 || o.getAge() < 21) {
                                System.out.println("Please enter age from 21 to 65");
                                o.setAge(sc.nextInt());
                                if (o.getAge() >= 21 && o.getAge() <= 65) {
                                    break;
                                }
                            }
                            System.out.println("Please add phone number");
                            o.setPhonenum(sc.nextLong());
                            System.out.println("Please add City");
                            o.a.setCity(sc.next());
                            System.out.println("Please add Street Name");
                            o.a.setStreetName(sc.next());
                            System.out.println("Please add E-mail");
                            o.setEmail(sc.next());
                            System.out.println("Please add ID");
                            o.setId(sc.nextInt());
                            System.out.println("Please add gender");
                            o.setGender(sc.next());
                            System.out.println("Please add Salary");
                            o.setSalary(sc.nextInt());
                            System.out.println("Please add Department");
                            o.setDepartment(sc.next());
                            System.out.println("Please add Work Nature");
                            o.setWorkNature(sc.next());

                            w.add(o);
                        } catch (Exception e) {
                            System.out.println("Wrong Data");
                            sc.next();
                        }
                    } //edit
                    else if (x == 2) {
                        System.out.println("Please enter worker ID ");
                        int y = sc.nextInt();
                        try {
                            for (int i = 0; i < w.size(); i++) {
                                Workers o = w.get(i);
                                if (o.getId() == y) {
                                    System.out.println("Please Edit your first name");
                                    o.setNamef(sc.next());
                                    System.out.println("Please Edit your last name");
                                    o.setNamel(sc.next());
                                    System.out.println("Please Edit age");
                                    o.setAge(sc.nextInt());
                                    System.out.println("Please Edit phone number");
                                    o.setPhonenum(sc.nextLong());
                                    System.out.println("Please Edit City");
                                    o.a.setCity(sc.next());
                                    System.out.println("Please Edit Street Name");
                                    o.a.setStreetName(sc.next());
                                    System.out.println("Please Edit E-mail");
                                    o.setEmail(sc.next());
                                    System.out.println("Please Edit ID");
                                    o.setId(sc.nextInt());
                                    System.out.println("Please Edit Salary");
                                    o.setSalary(sc.nextDouble());
                                    System.out.println("Please Edit Department");
                                    o.setDepartment(sc.next());
                                    System.out.println("Please Edit Work Nature");
                                    o.setWorkNature(sc.next());
                                    System.out.println("Please Edit gender");
                                    o.setGender(sc.next());
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Wrong Data");
                            sc.next();
                        }
                    } //remove
                    else if (x == 3) {
                        System.out.println("Please Enter ID: ");
                        int y = sc.nextInt();
                        try {
                            for (int i = 0; i < w.size(); i++) {
                                Workers o = w.get(i);

                                if (o.getId() == y) {
                                    w.remove(o);
                                    break;
                                }

                            }
                        } catch (Exception e) {
                            System.out.println("Wrong Input");
                            sc.next();
                        }
                    } //show
                    else if (x == 4) {

                        for (int i = 0; i < w.size(); i++) {
                            Workers o = w.get(i);
                            System.out.println(o.toString());
                        }
                    } else if (x == 5) {
                        // Search
                        System.out.println("Please Enter worker Id");
                        int id = sc.nextInt();
                        for (int i = 0; i < w.size(); i++) {
                            Workers ww = w.get(i);
                            if (ww.getId() == id) {
                                System.out.println(ww.toString());
                            }
                        }
                    }
                } else if (m == 3) {
                    System.out.println("Press 1 to add technician");
                    System.out.println("Press 2 to edit technician");
                    System.out.println("Press 3 to remove technician");
                    System.out.println("Press 4 to show all technicians");
                    System.out.println("Press 5 to search for a specific technician");
                    System.out.println("Press 6 to exit");
                    //add
                    int x = sc.nextInt();
                    if (x == 6) {
                        break;
                    }
                    if (x == 1) {
                        try {
                            Technicians c = new Technicians();
                            System.out.println("Please add your first name");
                            c.setNamef(sc.next());
                            System.out.println("Please add your last name");
                            c.setNamel(sc.next());
                            System.out.println("Please add age");
                            c.setAge(sc.nextInt());
                            while (c.getAge() > 65 || c.getAge() < 21) {
                                System.out.println("Please enter age from 21 to 65");
                                c.setAge(sc.nextInt());
                                if (c.getAge() >= 21 && c.getAge() <= 65) {
                                    break;
                                }
                            }
                            System.out.println("Please add phone number");
                            c.setPhonenum(sc.nextLong());
                            System.out.println("Please add City");
                            c.a.setCity(sc.next());
                            System.out.println("Please add Street Name");
                            c.a.setStreetName(sc.next());
                            System.out.println("Please add E-mail");
                            c.setEmail(sc.next());
                            System.out.println("Please add ID");
                            c.setId(sc.nextInt());
                            System.out.println("Please add gender");
                            c.setGender(sc.next());
                            System.out.println("Please add Work Nature");
                            c.setWorkNature(sc.next());
                            System.out.println("Please add Specialization");
                            c.setTechnical_specialization(sc.next());
                            System.out.println("Please add Salary");
                            c.setSalary(sc.nextDouble());

                            tech.add(c);
                        } catch (Exception e) {
                            System.out.println("Wrong Data");
                            sc.next();
                        }
                    } //edit
                    else if (x == 2) {
                        System.out.println("Please enter Technician ID ");
                        int y = sc.nextInt();
                        try {
                            for (int i = 0; i < tech.size(); i++) {
                                Technicians c = tech.get(i);
                                if (c.getId() == y) {
                                    System.out.println("Please Edit your first name");
                                    c.setNamef(sc.next());
                                    System.out.println("Please Edit your last name");
                                    c.setNamel(sc.next());
                                    System.out.println("Please Edit age");
                                    c.setAge(sc.nextInt());
                                    System.out.println("Please Edit phone number");
                                    c.setPhonenum(sc.nextLong());
                                    System.out.println("Please Edit City");
                                    c.a.setCity(sc.next());
                                    System.out.println("Please Edit Street Name");
                                    c.a.setStreetName(sc.next());
                                    System.out.println("Please Edit E-mail");
                                    c.setEmail(sc.next());
                                    System.out.println("Please Edit ID");
                                    c.setId(sc.nextInt());
                                    System.out.println("Please Edit Salary");
                                    c.setSalary(sc.nextDouble());
                                    System.out.println("Please Edit Specialization");
                                    c.setTechnical_specialization(sc.next());
                                    System.out.println("Please Edit Work Nature");
                                    c.setWorkNature(sc.next());
                                    System.out.println("Please Edit gender");
                                    c.setGender(sc.next());
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Wrong Data");
                            sc.next();
                        }
                    } //remove
                    else if (x == 3) {
                        System.out.println("Please Enter ID: ");
                        int y = sc.nextInt();
                        try {
                            for (int i = 0; i < tech.size(); i++) {
                                Technicians c = tech.get(i);

                                if (c.getId() == y) {
                                    tech.remove(c);
                                    break;
                                }

                            }
                        } catch (Exception e) {
                            System.out.println("Wrong Input");
                            sc.next();
                        }
                    } //show
                    else if (x == 4) {

                        for (int i = 0; i < tech.size(); i++) {
                            Technicians c = tech.get(i);
                            c.PrintDetails();
                            // System.out.println(c.toString());
                        }
                    } else if (x == 5) {
                        // Search
                        System.out.println("Please Enter technician Id");
                        int id = sc.nextInt();
                        for (int i = 0; i < tech.size(); i++) {
                            Technicians tt = tech.get(i);
                            if (tt.getId() == id) {
                                tt.PrintDetails();
                            }
                        }
                    }
                } else if (m == 4) {
                    System.out.println("Press 1 to add instructor");
                    System.out.println("Press 2 to edit instructor");
                    System.out.println("Press 3 to remove instructor");
                    System.out.println("Press 4 to show all instructors");
                    System.out.println("Press 5 to search for a specific instructor");
                    System.out.println("Press 6 to exit");
                    //add
                    int x = sc.nextInt();
                    if (x == 6) {
                        break;
                    }
                    if (x == 1) {
                        try {
                            Instructors q = new Instructors();
                            System.out.println("Please add your first name");
                            q.setNamef(sc.next());
                            System.out.println("Please add your last name");
                            q.setNamel(sc.next());
                            System.out.println("Please add age");
                            q.setAge(sc.nextInt());
                            while (q.getAge() > 65 || q.getAge() < 25) {
                                System.out.println("Please enter age from 25 to 65");
                                q.setAge(sc.nextInt());
                                if (q.getAge() >= 25 && q.getAge() <= 65) {
                                    break;
                                }
                            }
                            System.out.println("Please add phone number");
                            q.setPhonenum(sc.nextLong());
                            System.out.println("Please add City");
                            q.a.setCity(sc.next());
                            System.out.println("Please add Street Name");
                            q.a.setStreetName(sc.next());
                            System.out.println("Please add E-mail");
                            q.setEmail(sc.next());
                            System.out.println("Please add ID");
                            q.setId(sc.nextInt());
                            System.out.println("Please add gender");
                            q.setGender(sc.next());
                            System.out.println("Please add Salary");
                            q.setSalary(sc.nextInt());
                            System.out.println("Please add Scientific Degree");
                            q.setScientific_degree(sc.next());
                            System.out.println("Please add Subject Name");
                            q.setSubject_name(sc.next());

                            ins.add(q);
                        } catch (Exception e) {
                            System.out.println("Wrong Data");
                            sc.next();
                        }
                    } //edit
                    else if (x == 2) {
                        System.out.println("Please enter Instructor ID ");
                        int y = sc.nextInt();
                        try {
                            for (int i = 0; i < ins.size(); i++) {
                                Instructors q = ins.get(i);
                                if (q.getId() == y) {
                                    System.out.println("Please Edit your first name");
                                    q.setNamef(sc.next());
                                    System.out.println("Please Edit your last name");
                                    q.setNamel(sc.next());
                                    System.out.println("Please Edit age");
                                    q.setAge(sc.nextInt());
                                    System.out.println("Please Edit phone number");
                                    q.setPhonenum(sc.nextLong());
                                    System.out.println("Please Edit City");
                                    q.a.setCity(sc.next());
                                    System.out.println("Please Edit Street Name");
                                    q.a.setStreetName(sc.next());
                                    System.out.println("Please Edit E-mail");
                                    q.setEmail(sc.next());
                                    System.out.println("Please Edit ID");
                                    q.setId(sc.nextInt());
                                    System.out.println("Please Edit Salary");
                                    q.setSalary(sc.nextDouble());
                                    System.out.println("Please Edit Scientific Degree");
                                    q.setScientific_degree(sc.next());
                                    System.out.println("Please Edit SubjectName");
                                    q.setSubject_name(sc.next());
                                    System.out.println("Please Edit gender");
                                    q.setGender(sc.next());
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Wrong Data");
                            sc.next();
                        }
                    } //remove
                    else if (x == 3) {
                        System.out.println("Please Enter ID: ");
                        int y = sc.nextInt();
                        try {
                            for (int i = 0; i < ins.size(); i++) {
                                Instructors q = ins.get(i);

                                if (q.getId() == y) {
                                    ins.remove(q);
                                    break;
                                }

                            }
                        } catch (Exception e) {
                            System.out.println("Wrong Input");
                            sc.next();
                        }
                    } //show
                    else if (x == 4) {

                        for (int i = 0; i < ins.size(); i++) {
                            Instructors q = ins.get(i);
                            q.PrintDetails();
                        }
                    } else if (x == 5) {
                        // Search
                        System.out.println("Please Enter instructor Id");
                        int id = sc.nextInt();
                        for (int i = 0; i < ins.size(); i++) {
                            Instructors ii = ins.get(i);
                            if (ii.getId() == id) {
                                ii.PrintDetails();
                            }
                        }
                    }
                } else if (m == 5) {
                    System.out.println("Press 1 to add adminstrator");
                    System.out.println("Press 2 to edit adminstrator");
                    System.out.println("Press 3 to remove adminstrator");
                    System.out.println("Press 4 to show all adminstrators");
                    System.out.println("Press 5 to search for a specific adminstrator");
                    System.out.println("Press 6 to exit");
                    //add
                    int x = sc.nextInt();
                    if (x == 6) {
                        break;
                    }
                    if (x == 1) {
                        try {
                            Adminstrators f = new Adminstrators();
                            System.out.println("Please add your first name");
                            f.setNamef(sc.next());
                            System.out.println("Please add your last name");
                            f.setNamel(sc.next());
                            System.out.println("Please add age");
                            f.setAge(sc.nextInt());
                            while (f.getAge() > 65 || f.getAge() < 25) {
                                System.out.println("Please enter age from 25 to 65");
                                f.setAge(sc.nextInt());
                                if (f.getAge() >= 25 && f.getAge() <= 65) {
                                    break;
                                }
                            }
                            System.out.println("Please add phone number");
                            f.setPhonenum(sc.nextLong());
                            System.out.println("Please add City");
                            f.a.setCity(sc.next());
                            System.out.println("Please add Street Name");
                            f.a.setStreetName(sc.next());
                            System.out.println("Please add E-mail");
                            f.setEmail(sc.next());
                            System.out.println("Please add ID");
                            f.setId(sc.nextInt());
                            System.out.println("Please add gender");
                            f.setGender(sc.next());
                            System.out.println("Please add Salary");
                            f.setSalary(sc.nextInt());
                            System.out.println("Please add Adminstrate Section");
                            f.setAdminstrate_section(sc.next());

                            ad.add(f);
                        } catch (Exception e) {
                            System.out.println("Wrong Data");
                            sc.next();
                        }
                    } //edit
                    else if (x == 2) {
                        System.out.println("Please enter Adminstrator ID ");
                        int y = sc.nextInt();
                        try {
                            for (int i = 0; i < ad.size(); i++) {
                                Adminstrators f = ad.get(i);
                                if (f.getId() == y) {
                                    System.out.println("Please Edit your first name");
                                    f.setNamef(sc.next());
                                    System.out.println("Please Edit your last name");
                                    f.setNamel(sc.next());
                                    System.out.println("Please Edit age");
                                    f.setAge(sc.nextInt());
                                    System.out.println("Please Edit phone number");
                                    f.setPhonenum(sc.nextLong());
                                    System.out.println("Please Edit City");
                                    f.a.setCity(sc.next());
                                    System.out.println("Please Edit Street Name");
                                    f.a.setStreetName(sc.next());
                                    System.out.println("Please Edit E-mail");
                                    f.setEmail(sc.next());
                                    System.out.println("Please Edit ID");
                                    f.setId(sc.nextInt());
                                    System.out.println("Please Edit Salary");
                                    f.setSalary(sc.nextDouble());
                                    System.out.println("Please Edit Adminstrate Section");
                                    f.setAdminstrate_section(sc.next());
                                    System.out.println("Please Edit gender");
                                    f.setGender(sc.next());
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Wrong Data");
                            sc.next();
                        }
                    } //remove
                    else if (x == 3) {
                        System.out.println("Please Enter ID: ");
                        int y = sc.nextInt();
                        try {
                            for (int i = 0; i < ad.size(); i++) {
                                Adminstrators q = ad.get(i);

                                if (q.getId() == y) {
                                    ad.remove(q);
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Wrong Input");
                            sc.next();
                        }
                    } //show
                    else if (x == 4) {
                        for (int i = 0; i < ad.size(); i++) {
                            Adminstrators f = ad.get(i);
                            System.out.println(f.toString());
                        }
                    } else if (x == 5) {
                        // Search
                        System.out.println("Please Enter adminstrator Id");
                        int id = sc.nextInt();
                        for (int i = 0; i < ad.size(); i++) {
                            Adminstrators aa = ad.get(i);
                            if (aa.getId() == id) {
                                System.out.println(aa.toString());
                            }
                        }
                    } else {
                        System.out.println("Please enter number between 1 and 6");
                    }
                }
            }
        }
    }
/*
1. ماريان اشرف بشري
2. كلارا باسم فكري
3. ماري جرجس حنا
4. كيرلس جورج رفعت
5. ماريا ايمن ابراهيم
*/
}
