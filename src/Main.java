public class Main {
    public static void main(String[] args) {
        var author1 = new Author("Оскар ", "Уальд ");
        var author2 = new Author("Даниэль ", "Дэфо");
        var book1 = new Book("Портрет Дориана Грея", author1, 1891);
        var book2 = new Book("Робинзон Крузо", author2, 1719);
        book1.setPublicationYear(1980);
        System.out.println(book1.getName()+" "+book1.getPublicationYear()+ " " +book1.getAuthor());
    }
}