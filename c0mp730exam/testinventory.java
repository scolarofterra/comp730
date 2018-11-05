package comp730;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class testinventory {
	private Inventory inven;
	
	@BeforeEach
	void setUp() throws Exception 
	{inven = new Inventory();}
	@Test
	void Mockitoinventest() 
	{
		InventoryItem i1 = Mockito.mock(InventoryItem.class);
		Inventory S1 = Mockito.spy(inven);
	}

}
