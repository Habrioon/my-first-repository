public class Main {
   public static void main(String[] args) {
   
      Movie movie1 = new Movie();
      movie1.title = "Spider-Man";
      movie1.genre = "Action";
      movie1.duration = 121;
      movie1.displayInfo();
      
      Movie movie2 = new Movie();
      movie2.title = "Insterstellar";
      movie2.genre = "Sci-Fi";
      movie2.duration = 169;
      movie2.displayInfo();
      
      Movie movie3 = new Movie();
      movie3.title = "Toy Story";
      movie3.genre = "Animation";
      movie3.duration = 81;
      movie3.displayInfo();
  
   }
}