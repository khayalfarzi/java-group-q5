package az.iktlab.lessons.lesson16;

public abstract class Human {

    private String eye;
    private String leg;
    private String arm;

    public abstract void write();

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public String getLeg() {
        return leg;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }

    public String getArm() {
        return arm;
    }

    public void setArm(String arm) {
        this.arm = arm;
    }
}
