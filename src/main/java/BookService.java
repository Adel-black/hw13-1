public class BookService extends ProductService {
    private String author;
    private String name;

    public BookService(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
