public class Cashier {
    public static final double FIVER_VALUE = 5.0;
    public static final double TOONIE_VALUE = 2.0;
    public static final double LOONIE_VALUE = 1.0;
    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;
    
    int fivers,loonies, toonies, quarters, dimes, nickels, pennies;
    double cashInside, cashLimit, purchase;
    
    public Cashier(double cashInside, double cashLimit){
        this.cashInside = cashInside;
        this.cashLimit = cashLimit;
        this.fivers = 5;
        this.loonies = 10;
        this.toonies = 10;
        this.quarters = 20;
        this.dimes = 20;
        this.nickels = 50;
        this.pennies = 50;

        cashInRegister();
    }
    public void cashInRegister(){
        System.out.printf("The cashier has: %d fivers, %d toonies, %d loonies, %d quarters, %d dimes, %d nickels, %d pennies.\n",
                this.fivers,
                this.toonies,
                this.loonies,
                this.quarters,
                this.dimes,
                this.nickels,
                this.pennies);
    }
    public void purchase(double itemPrice){
       
        this.purchase += itemPrice;
    }
    private double totalCash(int fivers, int toonies,int loonies,int quarters,int dimes,int nickels,int pennies){
       
        double cash = (fivers*FIVER_VALUE) + (toonies*TOONIE_VALUE) + (loonies*LOONIE_VALUE) + (quarters*QUARTER_VALUE) + (dimes*DIME_VALUE) + (nickels*NICKEL_VALUE) + (pennies*PENNY_VALUE);
        return cash;
    }
    public void checkout(int fivers, int toonies,int loonies,int quarters,int dimes,int nickels,int pennies){
        double cashGiven = totalCash(fivers,  toonies, loonies, quarters, dimes, nickels, pennies);
        double change = cashGiven - this.purchase;
        if(enoughMoney(this.purchase, cashGiven) && enoughInRegister(change)){
            System.out.println("Successfull purchase of items");
            	this.cashInside += purchase;
            if(cashGiven > this.purchase){
                System.out.println("Your change is: " + change);
                giveChange(change);
            }
            else{
                System.out.println("No change given.");
            }
            this.purchase = 0;
        }
        else if(!enoughInRegister(change)){
            System.out.println("Not enough money in register for items");
        }
        else if(!enoughMoney(this.purchase, cashGiven)){
            System.out.println("Not enough money from customer for items");
        }

    }
    private boolean enoughMoney(double totalPurchase, double cashGiven){
        // determine if the cash given is enough for the total purchase
        if (cashGiven >= totalPurchase){
        	return true;
        } else {
        	return false;
        }
    }
    private boolean enoughInRegister(double change){
        if(this.cashInside - this.cashLimit >= change){
            return true;
        }
        else{
            return false;
        }
    }
    private void giveChange(double change){
    	int fivers = (int)(change/FIVER_VALUE);
    	this.fivers = fivers;
    	change = change - (fivers*FIVER_VALUE);

    	int toonies = (int)(change/TOONIE_VALUE);
    	this.toonies = toonies;
    	change = change - (toonies*TOONIE_VALUE);

    	int loonies = (int)(change/LOONIE_VALUE);
    	this.loonies = loonies;
    	change = change - (loonies*LOONIE_VALUE);

    	int quarters = (int)(change/FIVER_VALUE);
    	this.quarters = quarters;
    	change = change - (quarters*FIVER_VALUE);

    	int dimes = (int)(change/DIME_VALUE);
    	this.dimes = dimes;
    	change = change - (dimes*DIME_VALUE);

    	int nickels = (int)(change/NICKEL_VALUE);
    	this.nickels = nickels;
    	change = change - (nickels*NICKEL_VALUE);

    	int pennies = (int)(change/PENNY_VALUE);
    	this.pennies = pennies;
    	change = change - (pennies*PENNY_VALUE);
        // find all possible toonies that can be found in the change, HINT: you may need to do some typecasting
        // update the internal register's count on toonies
        // use the remainder operation to update the change to the remainder after diving the total change value by the toonie value

        System.out.printf("Your exact change is: %d fivers, %d toonies, %d loonies, %d quarters, %d dimes, %d nickels, %d pennies", fivers, toonies, loonies, quarters, dimes, nickels, pennies);
    }

    public static void main(String[] arguments){
        Cashier cashier = new Cashier(49.37, 20);
        cashier.purchase(6.25);
        cashier.checkout(1, 2, 1, 0, 0, 0, 0);
        cashier.cashInRegister();
        
        cashier.purchase(6.25);
	    cashier.purchase(6.25);
        cashier.checkout(1, 2, 1, 0, 0, 0, 0);
        cashier.cashInRegister();
        
        cashier.purchase(25);
        cashier.purchase(25);
        cashier.checkout(60, 0, 0, 0, 0, 0, 0);
        cashier.cashInRegister();
    }
}
