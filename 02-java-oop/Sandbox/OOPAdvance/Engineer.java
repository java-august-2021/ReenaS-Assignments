// sub class
import java.util.ArrayList;
public class Engineer extends Employee {

    public String project;
    public ArrayList<String> skills=new ArrayList<String>();

    public Engineer(String email, double pay,String project) {
        super(email, pay);
        this.project=project;
    }
    public String getProject() {
        return project;
    }
    public void setProject(String project) {
        this.project = project;
    }
    public void addSkill(String skill) {
        this.skills.add(skill);
    }
    public void enggDetails() {
       this.empDetails();
       System.out.printf(" Project : %s Skills %s" ,this.project , this.skills);
    }
    
}
