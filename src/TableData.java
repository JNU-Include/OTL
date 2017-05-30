import javax.swing.*;
import java.util.ArrayList;

public class TableData {

	private JScrollPane scrollpane;
	String[][] orderlist;
	String header[] = {"음식명","가격"};
	String contents[][] = {
			{"삼겹살","11000"},
			{"대패삼겹살","3000"},
			{"소주","3500"}
	};
	String order_header[] = {"음식명", "수량", "가격"};

	TableData(){
		orderlist = new String[0][0];
	}

	ArrayList<String[]> ordered_contents = new ArrayList();
	String[] order = new String[3];  //음식명 수량 가격

	public void list_init() {
		orderlist = new String[ordered_contents.size()][3];
		for (int i = 0 ; i < orderlist.length ; i++){
			orderlist[i] = ordered_contents.get(i);
		}
	}
//	public void makeTable(){
//	DefaultTableModel model = new DefaultTableModel(contents,header);
//	JTable mTable = new JTable(model);
//	scrollpane = new JScrollPane(mTable);
//	
//	}
}
