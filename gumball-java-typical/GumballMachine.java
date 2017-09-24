
public class GumballMachine
{

    private int num_gumballs;
    private int price_per_gumball;
    private boolean accept_all;
    private int total_inserted;

    public GumballMachine(int size, int price, boolean accept_all)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.accept_all = accept_all;
        this.price_per_gumball = price;
        this.total_inserted = 0;
    }

    public void insertCoin(int coin)
    {
    		if(coin != 25 && !this.accept_all)
    		{
    			System.out.println("Sorry! Only quarters are accepted.");
    			return;
    		}
    		this.total_inserted += coin;
    }
    
    public void turnCrank()
    {
	    	if (this.total_inserted >= this.price_per_gumball)
	    	{
	    		if ( this.num_gumballs > 0 )
	    		{
	    			this.num_gumballs-- ;
	    			this.total_inserted = 0 ;
	    			System.out.println("Thanks for the payment. Gumball ejected!") ;
	    		}
	    		else
	    		{
	    			System.out.println("No more Gumballs! Sorry, can't return your payment.") ;
	    		}
	    	}
	    	else 
	    	{
	    		System.out.println("Please insert the full payment for gumball.") ;
	    	}        
    }
}
