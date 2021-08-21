package products;

public class Product {
    int id;
    String title;
    int cost;

    public Product(int id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return id + "." + " " + title + " " + cost;
    }

//    public static void main(String[] args) {
//        String[] titles = {"one", "two", "tree"};
//        Random random = new Random();
//        int randid = random.nextInt(10);
//        int index = random.nextInt(titles.length);
//        int randcost = random.nextInt(1000000);
////        Product apple1 = new Product(randid,titles[index],randcost);
////        Product apple2 = new Product(randid,titles[index],randcost);
////        Product apple3 = new Product(randid,titles[index],randcost);
////        Product apple4 = new Product(randid,titles[index],randcost);
////        Product apple5 = new Product(randid,titles[index],randcost);
////        Product apple6 = new Product(randid,titles[index],randcost);
////        Product apple7 = new Product(randid,titles[index],randcost);
////        Product apple8 = new Product(randid,titles[index],randcost);
////        Product apple9 = new Product(randid,titles[index],randcost);
////        Product apple10 = new Product(randid,titles[index],randcost);
//
//        ArrayList<Product> products = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            products.add(new Product(randid,titles[index],randcost));
//        }
//        System.out.println(products);
//    }

}
