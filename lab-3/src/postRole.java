class Post {
    int minimumRequired, courseWork, aptitude, techTest, interview;
}

class Programmer extends Post {
    int minimumRequired = 80;

    Programmer(int courseWork, int aptitude, int techTest, int interview) {
        this.courseWork = courseWork;
        this.aptitude = aptitude;
        this.techTest = techTest;
        this.interview = interview;
    }

    boolean pass(int courseWork, int aptitude, int techTest) {
        if (courseWork + aptitude + techTest >= this.minimumRequired) {
            return true;
        }
        return false;
    }

    boolean pass(int interview) {
        if (interview >= this.minimumRequired) {
            return true;
        }
        return false;
    }

    void isQualified() {
        if (pass(this.courseWork, this.aptitude, this.techTest) && pass(this.interview)) {
            System.out.println("Programmer is qualified");
        } else {
            System.out.println("Programmer is not qualified");
        }
    }
}

class TeamLead extends Post {
    int minimumRequired = 85;

    TeamLead(int techTest, int interview) {
        this.techTest = techTest;
        this.interview = interview;
    }

    void isQualified() {
        if (this.techTest >= this.minimumRequired && this.interview >= this.minimumRequired) {
            System.out.println("TeamLead is qualified");
        } else {
            System.out.println("TeamLead is not qualified");
        }
    }

}

class ProjectManager extends Post {
    int minimumRequired = 90;

    ProjectManager(int interview) {
        this.interview = interview;
    }

    void isQualified() {
        if (this.interview >= this.minimumRequired) {
            System.out.println("ProjectManager is qualified");
        } else {
            System.out.println("ProjectManager is not qualified");
        }
    }
}

public class postRole {
    public static void main(String[] args) {
        Programmer p = new Programmer(40, 30, 10, 60);
        p.isQualified();

        TeamLead tl = new TeamLead(90, 100);
        tl.isQualified();

        ProjectManager pm = new ProjectManager(100);
        pm.isQualified();
    }
}
