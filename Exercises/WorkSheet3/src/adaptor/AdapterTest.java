package adaptor;

import adaptor.XpayToPayDAdapter;
import adaptor.XpayImpl;

/**
 * Created by philhannant on 23/01/2016.
 */
public class AdapterTest {

    public static void main(String[] args){
        Xpay xp = new XpayImpl();
        xp.setCustomerName("Mr Mister");
        xp.setCreditCardNo("35467289402");
        xp.setCardExpMonth("12");
        xp.setCardExpYear("2016");
        xp.setCardCVVNo((short) 345);
        xp.setAmount(1292.20);

        XpayToPayDAdapter xpa = new XpayToPayDAdapter(xp);
        System.out.println(xpa.getCardOwnerName());
        System.out.println(xpa.getCustCardNo();
        System.out.println(xpa.getCardExpMonthDate();
        System.out.println(xpa.getCVVNo();
        System.out.println(xpa.getTotalAmount();
    }

}
