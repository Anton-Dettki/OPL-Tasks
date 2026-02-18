package seminar5.UML;

public class Student {
        private static int counter;
        private String id;
        private String name;
        private Address address;

        public Student(String name) {
            this.name = name;
        }

        public void setAddress(String city, String street, String zip, int no) {
            this.address = new Address(city,zip,street, no);
        }

}

//public class Student {
//
//    private static int counter;
//    private String id;
//    private String name;
//    private Address address;
//
//    public Student(String name) {
//        this.name = name;
//        this.id = "S" + (++counter);
//    }
//
//    public void setAddress(String city, String zip, String street, int no) {
//        this.address = new Address(city, zip, street, no);
//    }
//
//    private class Address {   // 🔒 completely hidden
//        private String city;
//        private String zip;
//        private String street;
//        private int no;
//
//        private Address(String city, String zip, String street, int no) {
//            this.city = city;
//            this.zip = zip;
//            this.street = street;
//            this.no = no;
//        }
//    }
//}

