package Apr26;

import java.util.*;
import java.text.*;
public class CurrencyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Currency usd=Currency.getInstance("USD");
		NumberFormat frm=NumberFormat.getCurrencyInstance(Locale.US);
		String formattedval=frm.format(108.5);
		System.out.println(formattedval);
		
		NumberFormat frm1=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		String forval=frm1.format(106);
		System.out.println(forval);
		
		double price=200000.25;
		Locale local=new Locale("en","US");
		NumberFormat currencyFormatter=NumberFormat.getCurrencyInstance(local);
		String finalprice=currencyFormatter.format(price);
		System.out.println(finalprice);
		
		DecimalFormat decimalFormatter=new DecimalFormat("#,##,00.00");
		decimalFormatter.setPositivePrefix("$");
		String resval=decimalFormatter.format(price);
		System.out.println(resval);
		
		Currency cur=Currency.getInstance("USD");
		String symbol=cur.getSymbol();
		String code=cur.getCurrencyCode();
		
		System.out.println(symbol);
		System.out.println(code);
		
	}

}
