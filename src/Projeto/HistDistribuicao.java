package Projeto;


public class HistDistribuicao {

private long startTime;
private long offTime;
private double energiaGasta;

 public HistDistribuicao(long startTime,long offTime,double energiaGasta)
 {
     this.startTime=startTime;
     this.offTime=offTime;
     this.energiaGasta=energiaGasta;  
 
 }

    /**
     * @return the startTime
     */
    public long getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the offTime
     */
    public long getOffTime() {
        return offTime;
    }

    @Override
    public String toString() {
        return "HistDistribuicao{" + "startTime=" + startTime + ", offTime=" + offTime + ", energiaGasta=" + energiaGasta + '}';
    }

    /**
     * @param offTime the offTime to set
     */
    public void setOffTime(long offTime) {
        this.offTime = offTime;
    }

    /**
     * @return the energiaGasta
     */
    public double getEnergiaGasta() {
        return energiaGasta;
    }

    /**
     * @param energiaGasta the energiaGasta to set
     */
    public void setEnergiaGasta(double energiaGasta) {
        this.energiaGasta = energiaGasta;
    }

}