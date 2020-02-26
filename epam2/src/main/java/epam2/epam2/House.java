package epam2.epam2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class House {
	private static final Logger Logger=LogManager.getLogger(House.class);
	public double FullyHomeCost(String MaterialStandard,double areaofhouseinFeets)
	{
		Logger.info("StandardMaterials costs");
		double cost=0;
		if(MaterialStandard.equals("StandardMaterials"))
		{
			cost=1200*(areaofhouseinFeets);
		}
		else if(MaterialStandard.equals("above StandardMaterials "))
			
		{
			cost=1500*(areaofhouseinFeets);
		}
		else if(MaterialStandard.equals("HighStandardMaterials"))
		{
			cost=1800*(areaofhouseinFeets);
		}
		else if(MaterialStandard.equals("HighStandardMaterialAndFullyAutomatedHome"))
		{
			cost=2500*(areaofhouseinFeets);
		}
		return cost;
	}


}