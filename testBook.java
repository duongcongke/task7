public class testBook +public class TestBook {
    public static void main(String[] args) {
        Author author=new Author("Ke","Ke",'D');
        System.out.println(author);
        Book book=new Book("Ke", author, 9.99,15);
        System.out.println(book);
        book.setPrice(999.999);
        book.setQty(12);
        System.out.println("New Price: "+book.getPrice());
        System.out.println("New QTY: "+book.getQty());
    }
}{
}
