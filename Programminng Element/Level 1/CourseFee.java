public class CourseFee {
    public static void main(String[] args) {
        int fee = 125000;              // Original fee
        int discountPercent = 10;      // Discount percentage

        int discount = (fee * discountPercent) / 100; // Calculate discount
        int finalFee = fee - discount;                // Calculate final fee

        System.out.println("The discount amount is INR " + discount +  " and final discounted fee is INR " + finalFee);
    }
}
