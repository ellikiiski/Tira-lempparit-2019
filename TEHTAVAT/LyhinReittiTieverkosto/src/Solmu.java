
public class Solmu implements Comparable<Solmu> {
	private Long etaisyys;
	private int solmu;
    
	public Solmu(int solmu, long etaisyys) {
    	this.solmu = solmu;
	}

	public Long getEtaisyys() {
    	return this.etaisyys;
	}

	public void setEtaisyys(long etaisyys) {
    	this.etaisyys = etaisyys;
	}
    
        @Override
	public int compareTo(Solmu s) {
    	return (int) (this.etaisyys - s.getEtaisyys());
	}

	public int getSolmu() {
    	return this.solmu;
	}
 
	public void setSolmu(int solmu) {
    	this.solmu = solmu;
	}
}
