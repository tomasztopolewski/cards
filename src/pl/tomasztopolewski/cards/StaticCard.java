package pl.tomasztopolewski.cards;

public abstract class StaticCard {
	// Nazwa karty
	String name;
	final int minumumLengthOfName = 4;
	final int maximumLengthOfName = 64;

	//Cena karty: kupna i sprzedaży
	int purchase;
	int sale;

	// Siła karty: bezpośrednio wpływa na moc karty
	int power;
	int minimumPower;
	int maxmimumPower;

	/*
	 * Enum specialities = {SPECIALITY_ONE, SPECIALITY_TWO, SPECIALITY_THREE, SPECIALITY_FOUR}
	 */
	// Specjalność: rozszerza siłę o dodatkowy efekt i większa siłę
	int speciality;
	int minimumSpeciality;
	int maxmimumSpeciality;


	public StaticCard(String name,
					  int purchase, int sale,
					  int power, int minimumPower, int maxmimumPower,
                      int speciality, int minimumSpeciality, int maxmimumSpeciality) {
		setName(name);

		setPurchase(purchase);
		setSale(sale);

		setMinimumPower(minimumPower);
		setMaxmimumPower(maxmimumPower);
        setPower(power);

        setMinimumSpeciality(minimumSpeciality);
        setMaxmimumSpeciality(maxmimumSpeciality);
        setSpeciality(speciality);

		System.out.println("SYSTEM-INFO: Utworzono kartę '" + name + "'.");
	}

	public StaticCard() {
		setMinimumPower(0);
		setMaxmimumPower(0);
		setPower(0);

		setMinimumSpeciality(0);
		setMaxmimumSpeciality(0);
		setSpeciality(0);

		setName("card-of-empty");

		System.out.println("SYSTEM-INFO: Utworzono pustą kartę.");
		System.out.println("SYSTEM-ERROR(#card-of-empty): Zozstała utworzona nieokreślona karta.");
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.length() >= minumumLengthOfName && name.length() <= maximumLengthOfName ? name : null;
	}

	public int getMinumumLengthOfName() {
		return minumumLengthOfName;
	}

	public int getMaximumLengthOfName() {
		return maximumLengthOfName;
	}


	public int getPurchase() {
		return purchase;
	}
	public void setPurchase(int purchase) {
		this.purchase = purchase > 0 ? purchase : 0;
	}

	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale > 0 ? sale : 0;
	}


	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power >= minimumPower && power <= maxmimumPower ? power : 0;
	}

	public int getMinimumPower() {
		return minimumPower;
	}
	public void setMinimumPower(int minimumPower) {
		this.minimumPower = minimumPower;
	}

	public int getMaxmimumPower() {
		return maxmimumPower;
	}
	public void setMaxmimumPower(int maxmimumPower) {
		this.maxmimumPower = maxmimumPower;
	}


	public int getSpeciality() {
		return speciality;
	}
	public void setSpeciality(int speciality) {
		this.speciality = speciality >= minimumSpeciality && speciality <= maxmimumSpeciality ? speciality : 0;
	}

	public int getMinimumSpeciality() {
		return minimumSpeciality;
	}
	public void setMinimumSpeciality(int minimumSpeciality) {
		this.minimumSpeciality = minimumSpeciality;
	}

	public int getMaxmimumSpeciality() {
		return maxmimumSpeciality;
	}
	public void setMaxmimumSpeciality(int maxmimumSpeciality) {
		this.maxmimumSpeciality = maxmimumSpeciality;
	}

}
