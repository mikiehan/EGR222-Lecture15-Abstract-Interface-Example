package student;

public class Student {
    protected String login, department, name;

    public Student(String name) {
        this.name = name;
    }

    public Student(String login, String department, String name) {
        this.login = login;
        this.department = department;
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
}
