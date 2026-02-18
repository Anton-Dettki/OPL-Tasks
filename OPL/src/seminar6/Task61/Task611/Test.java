package seminar6.Task61.Task611;

public class Test {
    public static void main(String[] args) {
        Chair c = new Chair(true);
        Table t = new Table("Wood", 50, c);
        Table t2 = new Table("Wood", 50, c);

        System.out.println(c.getId());
        System.out.println(t.getId());
        System.out.println(t2.getId());

        MobilePhone m = new MobilePhone("Nokia", "1234");

        Article[] arr = {c,t,m};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name);
        }

    }
}
