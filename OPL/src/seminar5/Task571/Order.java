package seminar5.Task571;

public class Order {
    private static int counter;
    private String id;
    private Customer customer;
    private Article[] article;

    public Order(Customer customer, Article[] article) {
        this.customer = customer;
        this.article = article;
    }

    public void print() {
    }

    public void addArticle(Article article) {
    }

    public void removeArticle(Article article){}

}
