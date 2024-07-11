import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        
        
        Scanner sc = new Scanner(System.in);
        String prodNm = sc.next();
        int prodNo = sc.nextInt();

        ProductInfo productInfo1 = new ProductInfo();
        ProductInfo productInfo2 = new ProductInfo(prodNm, prodNo);

        System.out.println("product " + productInfo1.prodNo + " is " + productInfo1.prodNm);
        System.out.println("product " + productInfo2.prodNo + " is " + productInfo2.prodNm);
    }
}



class ProductInfo{
    String prodNm = "codetree";
    int prodNo = 50;

    public ProductInfo(){
        this.prodNm = prodNm;
        this.prodNo = prodNo;
    }

    public ProductInfo(String prodNm, int prodNo){
        this.prodNm = prodNm;
        this.prodNo = prodNo;
    }
}