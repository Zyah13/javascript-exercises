/*
 *Problem:  Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
  An Invoice should include four pieces of information as instance variables‐a part number(type String),a part description(type String),a quantity of the item being purchased (type int) 
  and a price per item (double). Your class should have a constructor that initializes the four instance variables. Provide a set and a get method for each instance variable.
  In addition, provide a method named getInvoice Amount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. 
  If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities.
 * Name :  Jieya O. Lingaolingao
 * Year&SEc.: BSIT 2-2
 *@InvoiceTest.java 
 *#FinalsActivity2
 */


 public class InvoiceTest {
      //Instance Variable
    private String partNumber, partDescription;
    private int quantityOfPurchased;
    private double pricePreItem;
   
    public static void main(String[] args) {
        InvoiceTest invoice1  = new InvoiceTest("XYZ123", "Electronics", 10, 19.95);
        System.out.println("Part number: " + invoice1.getPartNumber() + "; Part description: " + invoice1.getPartDescription() +
                "; Sold: " + invoice1.getQuantityOfPurchased() + "; Price: " + invoice1.getPricePreItem() + "; Invoice amount: " +
        
        invoice1.getInvoiceAmount());
        //Modifying values using setter method
        invoice1.setPartNumber("0x000");
        invoice1.setPartDescription("IBM");
        invoice1.setQuantityOfPurchased(1000);
        invoice1.setPricePreItem(1500.99);

        System.out.println("After changing:");
        System.out.println("Part number: " + invoice1.getPartNumber() + "; Part description: " + invoice1.getPartDescription() +
                "; Sold: " + invoice1.getQuantityOfPurchased() + "; Price: " + invoice1.getPricePreItem() + "; Invoice amount: " +
                invoice1.getInvoiceAmount());
    }
    public InvoiceTest(String partNumber, String partDescription, int quantityOfPurchased, double pricePreItem) {
        // Constructor to initialize instance variable
      this.partNumber = partNumber;
      this.partDescription = partDescription;
      this.quantityOfPurchased = quantityOfPurchased;
      this.pricePreItem = pricePreItem;
  }
//setters and getter for partNumber() Method
  public void setPartNumber(String partNumber) { // setter
      this.partNumber = partNumber;
  }
  public String getPartNumber() {  // getter
      return partNumber;
  }
//setters and getter for partDescription() Method
  public void setPartDescription(String partDescription) {  // setter
      this.partDescription = partDescription;
  }
  public String getPartDescription() {  // getter
      return partDescription;
  }
//setters and getter for QuantityOfPurchase() Method
  public void setQuantityOfPurchased(int quantityOfPurchased) { // setter
      if (quantityOfPurchased > 0) {
          this.quantityOfPurchased = quantityOfPurchased;
      } else {
          this.quantityOfPurchased = 0;
      }
  }
  public int getQuantityOfPurchased() {   // getter
      return quantityOfPurchased;
  }
//setters and getter for PricePreItem() Method    
  public void setPricePreItem(double pricePreItem) { // setter
      if (pricePreItem > 0) {
          this.pricePreItem = pricePreItem;
      } else {
          this.pricePreItem = 0;
      }
  }
  public double getPricePreItem() { // getter
      return pricePreItem;
  }
//Method to calculate and return value of invoiceAmount   
  public double getInvoiceAmount() {
      return pricePreItem * quantityOfPurchased;
  }
}

/*
 * Output:
 * Part number: XYZ123; Part description: Electronics; Sold: 10; Price: 19.95; Invoice amount: 199.5
 * After changing:
 * Part number: 0x000; Part description: IBM; Sold: 1000; Price: 1500.99; Invoice amount: 1500990.0
 * 
 */