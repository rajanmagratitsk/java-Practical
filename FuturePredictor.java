import java.util.*;

public class FuturePredictor {
    public static void main(String[] args) {
        String[] predictions = {
            "You will pass exam with good marks 😎",
            "You will learn something amazing today 🔥",
            "Be careful, a challenge is coming ⚠️",
            "Success is near 💯",
            "You will code something awesome 💻"
        };

        Random r = new Random();
        int index = r.nextInt(predictions.length);

        System.out.println("🔮 Your future:");
        System.out.println(predictions[index]);
    }
}