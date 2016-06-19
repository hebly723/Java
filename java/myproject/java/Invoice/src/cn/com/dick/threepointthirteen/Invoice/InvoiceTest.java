package cn.com.dick.threepointthirteen.Invoice;
import javax.swing.JOptionPane;
/**
 * @author 张钊晋
 * 
 * 2016年1月24日下午5:21:25
 */
public class InvoiceTest {
//main method begins execution of Java application
	public static void main(String[] args) {
		
		String identifier;//product's identifier input by user
		int	number;//product's amounts input by user
		double	price;//product's price input by user
		String	introduction;//production's introduction input by user
		
		//prompt user to enter
		identifier = 
			JOptionPane.
			showInputDialog("输入产品的编号：");//prompt for identifier
		number =
			Integer.
			parseInt(JOptionPane.
					showInputDialog("输入产品数量："));//prompt for number
		price = 
			Double.
			parseDouble(JOptionPane.
					showInputDialog("输入产品价格："));//prompt for price
		introduction =
				JOptionPane.
				showInputDialog("输入产品说明：");//prompt for introduction
		
		//create an Invoice object
		Invoice myInvoice = new Invoice(identifier, introduction, number, price);
		
		//create message
		String message = String.
				format(
						"编号%s的商品(%s)发票总计数额为%.2f", 
						myInvoice.getIdentifier(), myInvoice.getIntroduction(),
						myInvoice.getInvoiceAmount());
		
		JOptionPane.showMessageDialog(null, message);

	}//end method main

}//end class InvoiceTest
