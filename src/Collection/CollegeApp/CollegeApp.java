package Collection.CollegeApp;

import java.util.ArrayList;

public class CollegeApp {
    public static void main(String[] args) {
        String[] branches = {"CSE", "ME", "CE", "IT", "ETX"};
        ArrayList<Department> dept = new ArrayList<>();
        for (int i = 0; i < branches.length; i++) {

        Department department = new Department();
        department.setId(i+1);
        department.setName(branches[i]);

        dept.add(department);
        }

        College college1 = new College();
        college1.setId(1);
        college1.setDept(dept);

        System.out.println("College-ID: "+college1.getId());

        for (int i = 0; i < branches.length; i++) {
            System.out.println("  Department-ID: "+ college1.getDept().get(i).id
                +" Department-Name: "+ college1.getDept().get(i).name);
        }

    }
}
