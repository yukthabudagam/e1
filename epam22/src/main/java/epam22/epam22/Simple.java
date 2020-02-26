package epam22.epam22;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Simple {
	private static final Logger Logger=LogManager.getLogger(Simple.class);
	double interest(double principle,double rate,int time)
	{
		
		Logger.info("this is simple interest");
		double simpleinterest=((principle*rate*time)/100);
		Logger.debug("Simpleinterest:"+simpleinterest);
		return simpleinterest;
		
	}
	double compound(double pr,double rate,int time)
	{
		Logger.info("this is compound interest");
	  double  com=pr * Math.pow(1.0+rate/100.0,time) - pr;
	  Logger.debug("compound is:"+com);
	  return com;
	}

}