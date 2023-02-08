// Create Node data which has "Car_Node" data type
public class Car_Node {
    String registration;
    String owner_Name;
    String contact_Number;
    String problem_Description;
    int cost_Of_Fixing_The_Problem;
    String car_Status;

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getOwner_Name() {
        return owner_Name;
    }

    public void setOwner_Name(String owner_Name) {
        this.owner_Name = owner_Name;
    }

    public String getContact_Number() {
        return contact_Number;
    }

    public void setContact_Number(String contact_Number) {
        this.contact_Number = contact_Number;
    }

    public String getProblem_Description() {
        return problem_Description;
    }

    public void setProblem_Description(String problem_Description) {
        this.problem_Description = problem_Description;
    }

    public int getCost_Of_Fixing_The_Problem() {
        return cost_Of_Fixing_The_Problem;
    }

    public void setCost_Of_Fixing_The_Problem(int cost_Of_Fixing_The_Problem) {
        this.cost_Of_Fixing_The_Problem = cost_Of_Fixing_The_Problem;
    }

    public String getCar_Status() {
        return car_Status;
    }

    public void setCar_Status(String car_Status) {
        this.car_Status = car_Status;
    }

    public Car_Node(String registration, String owner_Name, String contact_Number, String problem_Description, int cost_Of_Fixing_The_Problem, String car_Status) {
        this.registration = registration;
        this.owner_Name = owner_Name;
        this.contact_Number = contact_Number;
        this.problem_Description = problem_Description;
        this.cost_Of_Fixing_The_Problem = cost_Of_Fixing_The_Problem;
        this.car_Status = car_Status;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n"+"(");
        sb.append(registration + ", ");
        sb.append(owner_Name + ", ");
        sb.append(contact_Number + ", ");
        sb.append(problem_Description + ", ");
        sb.append(cost_Of_Fixing_The_Problem + ", ");
        sb.append(car_Status + ")");
        return sb.toString();
    }
}
