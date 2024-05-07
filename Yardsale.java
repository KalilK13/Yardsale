package review;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Yardsale {

    public String nameOfProduct;
    public double priceWillingToPay;
    public int qty;
    public void yardSaleWholeSale(String nameOfProduct, double priceWillingToPay, int qty){
        this.nameOfProduct = nameOfProduct;
        this.priceWillingToPay = priceWillingToPay;
        this.qty = qty;
        double total = priceWillingToPay * qty;
        Date today = Calendar.getInstance().getTime();
        SimpleDateFormat format = new SimpleDateFormat("EEEE, MMMMM d, yyyy");
        String date = format.format(today);
        System.out.printf("Name\tQty\t\tPrice\tTotal\n" +
                "----\t---\t\t-----\t-------\n" +
                "%s\t%d\t\t%c%.1f\t%c%.2f\n\n" +
                "\tThank you. Come again!!!\n\n" +
                "Purchased on: " + date,nameOfProduct,qty,'$',priceWillingToPay,'$',total);
    }

}
