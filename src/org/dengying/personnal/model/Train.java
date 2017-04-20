package org.dengying.personnal.model;

public class Train {
	private int traino;
	private String trainame;
	private String traincontain;
	private String trainobj;
	private String traindatefrom;
	private String traindateto;
	private String trainer;
	private String trainplace;
	private double trainfee;
	public int getTraino() {
		return traino;
	}
	public void setTraino(int traino) {
		this.traino = traino;
	}
	public String getTrainame() {
		return trainame;
	}
	public void setTrainame(String trainame) {
		this.trainame = trainame;
	}
	public String getTraincontain() {
		return traincontain;
	}
	public void setTraincontain(String traincontain) {
		this.traincontain = traincontain;
	}
	public String getTrainobj() {
		return trainobj;
	}
	public void setTrainobj(String trainobj) {
		this.trainobj = trainobj;
	}
	public String getTraindatefrom() {
		return traindatefrom;
	}
	public void setTraindatefrom(String traindatefrom) {
		this.traindatefrom = traindatefrom;
	}
	public String getTraindateto() {
		return traindateto;
	}
	public void setTraindateto(String traindateto) {
		this.traindateto = traindateto;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public String getTrainplace() {
		return trainplace;
	}
	public void setTrainplace(String trainplace) {
		this.trainplace = trainplace;
	}
	
	public double getTrainfee() {
		return trainfee;
	}
	public void setTrainfee(double trainfee) {
		this.trainfee = trainfee;
	}
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Train(int traino, String trainame, String traincontain,
			String trainobj, String traindatefrom, String traindateto,
			String trainer, String trainplace, double trainfee) {
		super();
		this.traino = traino;
		this.trainame = trainame;
		this.traincontain = traincontain;
		this.trainobj = trainobj;
		this.traindatefrom = traindatefrom;
		this.traindateto = traindateto;
		this.trainer = trainer;
		this.trainplace = trainplace;
		this.trainfee = trainfee;
	}
	@Override
	public String toString() {
		return "Train [traino=" + traino + ", trainame=" + trainame
				+ ", traincontain=" + traincontain + ", trainobj=" + trainobj
				+ ", traindatefrom=" + traindatefrom + ", traindateto="
				+ traindateto + ", trainer=" + trainer + ", trainplace="
				+ trainplace + ", trainfee=" + trainfee + "]";
	}
}
