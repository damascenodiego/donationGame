package id_54899ba8e5646e372a5203d15e56af0a;

import br.usp.icmc.ssc01032015.Competitor;

public class Strategy_4 extends Player{

	public Strategy_4(int name){
		this.totalCash = 0;
		this.name = name;
		this.strategy = 4;
	}
	
	public Strategy_4(){
		this.totalCash = 0;
		this.name = hashCode();
		this.strategy = 4;
	}

	public double declareDonationTo(Competitor c){
		return 3;
	}
}