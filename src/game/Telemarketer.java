package game;

public class Telemarketer extends Person {
    private void call(String callTime) { }
    private void introduceProduct() { }
    private void sayGoodbye() { }
    private void continueTalkingWithoutListening() { }
    private void sell(boolean customerSaysYes, boolean aggressive) {
        if(aggressive) {
            continueTalkingWithoutListening();
        } else {
            if (customerSaysYes) {
                introduceProduct();
            } else {
                sayGoodbye();
            }
        }
    }

}
