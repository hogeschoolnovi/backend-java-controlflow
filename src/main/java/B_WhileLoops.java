public class B_WhileLoops {

  public static void main(String[] args) {

    //
    // WhileLoops 1
    //

    int i = 0;
    // Voeg een while loop toe die van 1 tot en met 10 telt.
    System.out.println(i);


    //
    // WhileLoops 2
    //

    int x = 20;
    int y = 3;
    // Enveloppen.nl verkoopt alleen enveloppen met een verhouding 3x20 en een lengte (of breedte) in gehele cm, groter dan 0.
    // Kun je de while loop schrijven zodat het systeem alle envelop maten print als je de grootste beschikbare maat geeft?
    while(x == 0) {
      System.out.println("Size = " + x + " x " + y);
    }


    //
    // WhileLoops 3
    //

    int smallest = 0;
    int largest = 10;
    int numberOfLoops = 0;
    while(smallest < largest) {
      // pas de increment en decrement van smallest en largest aan zodat de loop 4x wordt uitgevoerd.
      smallest += 1;
      largest -= 0;
      numberOfLoops++;
    }
    System.out.println(numberOfLoops);
  }
}
