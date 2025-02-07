package fintech.model;

/**
 * @author 12S23021- Eunike Purba 
 * @author 12S23041- Lisbet Panjaitan
 */
public class Account{

    private final String owner;
    private final String name;
    private double balance = 0.0;

    public Account(String _owner, String _name)
    {
      this.owner = _owner;
      this.name = _name;
    }


    public String getName()
    {
      return name;
    }

    public String getOwner()
    {
      return owner;
    }

    public double getBalance()
    {
      return balance;
    }

    @Override
    public String toString()
    {
      return this.owner + "|" + this.name + "|" + this.balance;
    }
  }