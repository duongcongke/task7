public class testAuthor {
}
    public static void main(String[] args) {
        Author author=new Author("Duong Cong Ke","Daideptrai",'d');
        System.out.println("TestAuthor: "+author);
        author.setEmail("22.10.2003");
        System.out.println("New email: "+author.getEmail());
    }
}