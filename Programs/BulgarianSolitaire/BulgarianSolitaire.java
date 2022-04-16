import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 * This is the Bulgarian Solitaire Game. It continues to sort cards in
 * piles until there are 9 piles with the amount of cards in each pile in the
 * order 1,2,3,4,5,6,7,8,9
 *
 * Edgar Babajanyan
 * 3/3/2022 + EXTENSION
 */


public class BulgarianSolitaire {
    public static void main(String[] args) {
        
    ArrayList<Integer> cards = new ArrayList<Integer>();
    
    Random random = new Random();

    System.out.println("Bulgarian Solitaire Begin!");
    
    int totalCards = 45;
    
    int remainingCards = totalCards;
    
    int ultimateCount = 0;
    
    while (remainingCards > 0) {
        
        int nextCard = random.nextInt(remainingCards) + 1;
        
        cards.add(nextCard);
        
        remainingCards = remainingCards - nextCard;
        
        System.out.println(cards);
    }
    
    System.out.println("Starting cards " + cards);
    
    boolean finished = false;
    
    while (!finished) {
        ultimateCount++;
        
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        
        int counter = 0;
        
        for (int i = 0; i < cards.size(); counter++) {
            int w = cards.get(i) - 1;
        
        if (w != 0) {
            num2.add(w);
        }
        
        i++;
        }
        num2.add(counter);
        Collections.sort(num2);
        for (int check = 1; check < num2.size(); check++) {
            int first = num2.get(check - 1);
            int next = num2.get(check);
            if (first != (next - 1)) {
                break;
            }
            if (check == num2.size() - 1) {
                finished = true;
            }
        }   
        System.out.println("Configuration # " + ultimateCount);
        System.out.println(cards);
        cards = num2;
    }
        System.out.println("Cards are sorted and it took " + ultimateCount + " configurations!");
        System.out.println(cards);
    }
}