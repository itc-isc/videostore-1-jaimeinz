package wsVideoStore;


public abstract class Movie
{
    static final int NEW_RELEASE  = 1;
    static final int REGULAR  = 2;
    static final int CHILDRENS  = 3;

	private String title;
    private int priceCode;

	public Movie(String title, int priceCode) {
		this.title 		= title;
        this.priceCode = priceCode;
	}
		
	public String getTitle () {
		return title;
	}

    public int getPriceCode() {
		return priceCode;
	}

  public abstract double determineAmount(int daysRented);

  public abstract int determineFrequentRenterPoints(int daysRented);
}