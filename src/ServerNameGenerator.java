public class ServerNameGenerator {

    String[] adjectives = {"Bitter", "Cold", "Delicious", "Happy", "Hungry", "Hot", "Sad", "Smooth", "Soft", "Solid"};

    String[] nouns = {"Animal", "Book", "Bottle", "Computer", "Cup", "Food", "House", "Human", "Phone", "Table", "Tool"};

     public static String speechArray (String[] arraySpeech) {
          int randomNumber =  (int) (Math.random() * arraySpeech.length);
         return (arraySpeech[randomNumber]);
     }

     public static void main(String [] args){
         ServerNameGenerator server = new ServerNameGenerator();
         System.out.println("This is what you need: A " + speechArray(server.adjectives) + "-" + speechArray(server.nouns));
     }
}