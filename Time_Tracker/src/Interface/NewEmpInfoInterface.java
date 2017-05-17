package Interface;

import Domain.Idomain;

public interface NewEmpInfoInterface extends Idomain{
	public void StartInfo();
	public void ClockIn();
	public void ClockOut();
	public int randomCrewIDGenerator();
	
}
