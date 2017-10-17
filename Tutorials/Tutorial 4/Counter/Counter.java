public class Counter {
    private int tally = 0;

    public Counter(){
    }

    public void click(){
	//increase tally by 1
        tally += 1;
    }
    public int getValue(){
	// give local tally count
        return tally;
    }
    public static void main(String[] args){
        // create Counter object
        Counter tally = new Counter();
        // increase the tally count by 2
        tally.click();
        tally.click();
        // print the value of the tally
        System.out.println("Value of ticker: " + tally.getValue());
    }
}