public class App {
    public static void main(String[] args) throws Exception {

      BookManagementSystem bms = new BookManagementSystem();
      Admin swarali = bms.createAdmin("Swarali", "swaralipaygude@gmail.com");
      Normie sarang = bms.createNormie("Sarang", "sarang1699@gmail.com");
      Normie puneeet = bms.createNormie("Puneet", "puneeetnagar@gmail.com");

      bms.addBooksToInventory(new Book().addName("ABC").addAuthor("Bleh").addPrice(50).addStock(10));
      bms.addBooksToInventory(new Book().addName("XYZ").addAuthor("Kru").addPrice(20).addStock(20));

      bms.search(new SearchParam().addAuthor("Kru").addMinPrice(30), new OrSpecification( new AuthorSpecification(), new MinPriceSpecification()));

      

    }
}
