public enum Rate {
    TEN(0.10),
    FIFTEEN(0.15),
    TWENTYFIVE(0.25),
    TWENTYEIGHT(0.28),
    THIRTYTHREE(0.30),
    THIRTYFIVE(0.35);

    private final double VALUE;
    
    //Constructor
    Rate(double value)
    {
        this.VALUE = value;
    }

    //getter method
    public double getValue()
    {
        return VALUE;
    }
}


