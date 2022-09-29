public class ProductManager {

    private final Repository repo;

    public ProductManager(Repository repo) {
        this.repo = repo;
    }

    public void add(ProductService product) {
        repo.add(product);
    }

    public ProductService[] searchBy(String text) {
        ProductService[] result = new ProductService[0];
        for (ProductService product : repo.findAll()) {
            if (matches(product, text)) {
                ProductService[] tmp = new ProductService[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(ProductService product, String search) {
        return product.getName().contains(search);
    }
}
