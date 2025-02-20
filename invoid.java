public class invoid {

    public static void main(String[] args) {
        String chicken = "Chicken", tuna = "Tuna", beef = "Beef", time = "1:27PM,", day = "20th,", month = "Feb";
        int cprice = 5, tprice = 20, bprice = 10; // price for chicken, tuna and beef

        System.out.println("Onur Food");
        System.out.println("7 Onur Lane, Vermont");
        System.out.println("0451354439");
        System.out.println("TAX INVOICE");
        System.out.println(time + " " + day + " " + month);

        System.out.println("----------------------------------------");
        System.out.println("Item" + " " + chicken + " " + "$" + cprice);
        System.out.println("Item" + " " + tuna + " " + "$" + tprice);
        System.out.println("Item" + " " + beef + " " + "$" + bprice);
        System.out.println("----------------------------------------");
        
        int totalPrice = cprice + tprice + bprice;
        System.out.print("TOTAL: $");
        System.out.println(totalPrice);

        System.out.print("GST: $");
        System.out.println(gst);

        double gst = totalPrice * 0.10;
        System.out.print("GST: $");
        System.out.println(gst);

        double totalPriceWithGST = totalPrice + gst;
        System.out.print("Total (with GST): $");
        System.out.println(totalPriceWithGST);

        
    }
}



// int = numbers
// string = ""
// char = ""