package lab2;
class Author {
    private String name;
    private String email;
    public void setEmail(String email) {
        this.email = email;
    }
    private char gender;
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return "Имя = " + name + ", Мейл = " + email + ", Пол = " + gender;
    }
    }
class TestAuthor {
    private Author author;
    public class Tester {
        public static void main(String[] args) {
            Author author1 = new Author("Pavel", "cerpb@mail.ru", 'M');
            String author1name= author1.getName();
            System.out.println(author1name);
            System.out.println(author1);
            author1.setEmail("cerpstudy@mail.ru");
            String author1Email= author1.getEmail();
            System.out.println(author1Email);
        }}}
