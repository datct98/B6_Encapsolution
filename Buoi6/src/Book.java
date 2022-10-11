public class Book {
    private static int id=0;
    private String name;
    private String author;
    private int yearPublic;

    public Book() {
    }



    public Book(String name, String author, int yearPublic) {
        id++;
        this.name = name;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }

    enum Size{
        M(170), N(160);

        private int i;
        Size(int i) {
            this.i = i;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
}
