public class PostcardPrinter
{
   public static void main(String[] args)
   {
      String text = "I am having a great time on\nthe island of Java. Weather\nis great. Wish you were here!";
      Postcard postcard = new Postcard("Janice", text);
      postcard.setRecipient("Sue");
      postcard.print();
      postcard.setRecipient("Tim");
      postcard.print();
   } 
}