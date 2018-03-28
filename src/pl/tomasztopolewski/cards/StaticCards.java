package pl.tomasztopolewski.cards;

public interface StaticCards {
	/*** ZMIENNE
	 * String name;
	 * final int minumumLengthOfName;
	 * final int maximumLengthOfName;
	 *
	 * int purchase;
	 * int sale;
	 *
	 * int power;
	 * int minimumPower;
	 * int maxmimumPower;
	 *
	 * int speciality;
	 * int minimumSpeciality;
	 * int maxmimumSpeciality;
	 ***/

	public String getName();
	public void setName(String name);

	public int getMinumumLengthOfName();
	public int getMaximumLengthOfName();


	public int getPurchase();
	public void setPurchase(int purchase);

	public int getSale();
	public void setSale(int sale);


	public int getPower();
	public void setPower(int power);

	public int getMinimumPower();
	public void setMinimumPower(int minimumPower);
	public int getMaxmimumPower();
	public void setMaxmimumPower(int maxmimumPower);


	public int getSpeciality();
	public void setSpeciality(int speciality);

	public int getMinimumSpeciality();
	public void setMinimumSpeciality(int minimumSpeciality);
	public int getMaxmimumSpeciality();
	public void setMaxmimumSpeciality(int maxmimumSpeciality);

}
