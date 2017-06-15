package ExamenRRHH;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestRecursosHumanos {
	@Test
	  public void valido1()
	  {
	    Assert.assertEquals(300L, RecursosHumanos.Datos("100", "Diego Alvarez", "1", "SI"));
	  }
	  

	  @Test
	  public void valido2()
	  {
	  Assert.assertEquals(500L, RecursosHumanos.Datos("101", "Alba Gomez", "7", "NO"));
	  }
	  

	  @Test(expected=Exception.class)
	  public void CodigoCero()
	  {
		  RecursosHumanos.Datos("000", "Jesus Garcia", "10", "SI");
	  }
	  

	  @Test(expected=Exception.class)
	  public void CodigoMayor999()
	  {
		  RecursosHumanos.Datos("1001", "Carmen Ruiz", "09", "NO");
	  }
	  

	  @Test(expected=Exception.class)
	  public void CodigoCaracter()
	  {
		  RecursosHumanos.Datos("abc", "Sandra Lopez", "02", "SI");
	  }
	  

	  @Test(expected=Exception.class)
	  public void NombreLargo()
	  {
		  RecursosHumanos.Datos("123", "Juan Gonzalez Fernandez", "03", "SI");
	  }
	  

	  @Test(expected=Exception.class)
	  public void AntiguNegativa()
	  {
		  RecursosHumanos.Datos("123", "Carmen Ruiz", "-1", "SI");
	  }
	  

	  @Test(expected=Exception.class)
	  public void ExcedeAntigu()
	  {
		  RecursosHumanos.Datos("123", "Carmen Ruiz", "111", "NO");
	  }
	  

	  @Test(expected=Exception.class)
	  public void AntiguNoNum()
	  {
		  RecursosHumanos.Datos("123", "Carmen Ruiz", "ab", "NO");
	  }
	  

	  @Test(expected=Exception.class)
	  public void PlusNoValido()
	  {
		  RecursosHumanos.Datos("123", "Carmen Ruiz", "08", "*");
	  }


}
