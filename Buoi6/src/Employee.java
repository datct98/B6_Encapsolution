public class Employee extends Person{
    private double experience;
    private String workPlace;


    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID= "+super.getId()+" "+
                "Name="+ super.getName()+" "+
                "address="+ super.getAddress()+" "+
                "experience=" + experience +
                ", workPlace='" + workPlace + '\'' +
                '}';
    }
}
