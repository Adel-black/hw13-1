public class Repository {

    ProductService[] products = new ProductService[0];

    public void add(ProductService product) {
        ProductService[] tmp = new ProductService[products.length + 1];
        System.arraycopy(products, 0, tmp, 0, products.length);
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public ProductService[] findAll() {
        return products;
    }

    public void delete(int id) {
        ProductService[] tmp = new ProductService[products.length - 1];
        int indexTo = 0;
        for (ProductService product : products) {
            if (product.getId() != id) {
                tmp[indexTo] = product;
                indexTo++;
            }
        }
        products = tmp;
    }


}
