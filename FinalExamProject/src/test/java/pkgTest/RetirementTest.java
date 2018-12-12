package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

public class RetirementTest {

	@Test
	public void TestPV() {
		int iYearsRetired = 20;
		double dAnnualReturn = 0.02;
		double dExpectedPV = -1454485.55;
		double dSSI = 2642;
		double dRequiredIncome = 10000;
		
		
		Retirement rt = new Retirement();
		rt.setdAnnualReturnRetired(dAnnualReturn);
		rt.setdMonthlySSI(dSSI);
		rt.setdRequiredIncome(dRequiredIncome);
		rt.setiYearsRetired(iYearsRetired);
		
		assertEquals(dExpectedPV, rt.TotalAmountSaved(), 0.01);
	}
	
	@Test
	public void TestPMT() {
		int iYearsToWork = 40;
		double dAnnualReturnWorking = 0.07;
		int iYearsRetired = 20;
		double dAnnualReturnRetired = 0.02;
		double dSSI = 2642;
		double dRequiredIncome = 10000;
		double dExpectedPMT = 554.13;
		
		Retirement rt = new Retirement();
		rt.setdAnnualReturnRetired(dAnnualReturnRetired);
		rt.setdAnnualReturnWorking(dAnnualReturnWorking);
		rt.setiYearsRetired(iYearsRetired);
		rt.setiYearsToWork(iYearsToWork);
		rt.setdMonthlySSI(dSSI);
		rt.setdRequiredIncome(dRequiredIncome);
		
		assertEquals(dExpectedPMT, rt.AmountToSave(), 0.01);
		
	}

}
