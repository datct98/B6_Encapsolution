public abstract class Student {
    private String name;
    private String major;

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public abstract double getScore();

    public String getHocLuc(){
        if(getScore()>=8)
            return "Giỏi";
        else if(getScore()>=6.6 && getScore() <8)
            return "Khá";
       return "TB";
    }

    public void show(){
        System.out.println("Name: "+name+" - Major: "+major+" - Score: "+
                getScore()+" - Classify: "+getHocLuc());
    }
}
