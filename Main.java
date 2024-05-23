// Product 클래스 작성란
abstract class Product {
    String ProName;
    int ProPrice;

    public Product(String ProName, int ProPrice) {
        this.ProName = ProName;
        this.ProPrice = ProPrice;
    }

       public abstract String toString();
    } // 추상 메소드

    public class Electronics extends Product {
        private int ProNum;

        public Electronics(String ProName, int ProPrice, int ProNum) {
            super(ProName, ProPrice);
            this.ProNum = ProNum;
        }

        @Override
        public String toString() {
            return 
        }
    }
    public class Main {
        public static void main(String[] args) {
            Product pro = new Product("Mac", 1000);
            System.out.println(pro);
        }
    }

// Electronics 클래스 작성란


// Foods 클래스 작성란


//Search 클래스 작성란

