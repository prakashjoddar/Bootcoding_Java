package Collection.CollegeApp;

import java.util.ArrayList;

public class College {
    int id;
    ArrayList<Department> dept;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Department> getDept() {
        return dept;
    }

    public void setDept(ArrayList<Department> dept) {
        this.dept = dept;
    }
}
