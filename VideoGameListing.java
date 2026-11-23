public class VideoGameListing {

   private String name;
   private String genre;
   private double cost;
   private boolean multiplayer;
   private boolean online;
   private String developer;
   private String publisher;
   private double averagePlayerCount;
   private double rating;
   private int downloads;
   
   public VideoGameListing() {
      name = "not set";
      genre = "none";
      cost = 10;
      multiplayer = false;
      online = false;
      developer = "none";
      publisher = "none";
      averagePlayerCount = 1;
      rating = 0.0;
      downloads = 0;
   }
   
   
   public VideoGameListing(String name,String developer,String publisher) {
      this.name = name;
      genre = "none";
      cost = 0;
      multiplayer = false;
      online = false;
      this.developer = developer;
      this.publisher = publisher;
      averagePlayerCount = 0;
      rating = 0;
      downloads = 0;
   }
   
   public void rename(String name) {
      this.name = name;
   }
   
   public void download() {
      downloads++;
   }
   
   public void refreshAveragePlayerCount() {
   //gets all player count data over the last month and averages it out and sets averagePlayerCount to this value
   }
   
   public void refreshRating() {
   //gets all rating data over the last month and averages it out and sets rating to this value

   }
   
   public void sale(double salePercent) {
   //decrease cost by a amount
   }
   
   public double getRating() {
   //returns the ratings
   return rating;
   }
   
   public double getAveragePlayerCount() {
   //returns the average player count
   return averagePlayerCount;
   }
}