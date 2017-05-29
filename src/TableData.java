import javax.swing.*;

public class TableData {
	private JScrollPane scrollpane;
	
	String header[] = {"음식명","수량"};
	String contents[][] = {
			{"삼겹살","11000"},
			{"대패삼겹살","3000"},
			{"소주","3500"}								
	};
	
//	public void makeTable(){
//	DefaultTableModel model = new DefaultTableModel(contents,header);
//	JTable mTable = new JTable(model);
//	scrollpane = new JScrollPane(mTable);
//	
//	}
}
