public class Postcard
{
   //we are using Strings to implement functionality.
   private String message;
   private String sender;
   private String recipient;
   public Postcard(String aSender, String aMessage)
   {
      message = aMessage;
      sender = aSender;
      recipient = "whom it may concern";
   }
   public void setRecipient(String r){
      recipient = r;
   }
   public void print(){
      System.out.println("To " + recipient + ", \n" + message + "\nFrom, " + sender);
   }

}