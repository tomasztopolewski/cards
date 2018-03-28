package pl.tomasztopolewski.cards;

public class AttackStaticCard extends StaticCard {
	public AttackStaticCard(String name, int purchase, int sale, int power, int minimumPower, int maxmimumPower, int speciality, int minimumSpeciality, int maxmimumSpeciality) {
		super(name, purchase, sale, power, minimumPower, maxmimumPower, speciality, minimumSpeciality, maxmimumSpeciality);
	}
	public AttackStaticCard() {
		super();
	}


	@Override
	public String getName() {
		return super.getName();
	}
	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public int getMinumumLengthOfName() {
		return super.getMinumumLengthOfName();
	}
	@Override
	public int getMaximumLengthOfName() {
		return super.getMaximumLengthOfName();
	}

	@Override
	public int getPurchase() {
		return super.getPurchase();
	}
	@Override
	public void setPurchase(int purchase) {
		super.setPurchase(purchase);
	}

	@Override
	public int getSale() {
		return super.getSale();
	}
	@Override
	public void setSale(int sale) {
		super.setSale(sale);
	}

	@Override
	public int getPower() {
		return super.getPower();
	}
	@Override
	public void setPower(int power) {
		super.setPower(power);
	}

	@Override
	public int getMinimumPower() {
		return super.getMinimumPower();
	}
	@Override
	public void setMinimumPower(int minimumPower) {
		super.setMinimumPower(minimumPower);
	}
	@Override
	public int getMaxmimumPower() {
		return super.getMaxmimumPower();
	}
	@Override
	public void setMaxmimumPower(int maxmimumPower) {
		super.setMaxmimumPower(maxmimumPower);
	}

	@Override
	public int getSpeciality() {
		return super.getSpeciality();
	}

	@Override
	public void setSpeciality(int speciality) {
		super.setSpeciality(speciality);
	}
	@Override
	public int getMinimumSpeciality() {
		return super.getMinimumSpeciality();
	}

	@Override
	public void setMinimumSpeciality(int minimumSpeciality) {
		super.setMinimumSpeciality(minimumSpeciality);
	}
	@Override
	public int getMaxmimumSpeciality() {
		return super.getMaxmimumSpeciality();
	}
	@Override
	public void setMaxmimumSpeciality(int maxmimumSpeciality) {
		super.setMaxmimumSpeciality(maxmimumSpeciality);
	}

}
