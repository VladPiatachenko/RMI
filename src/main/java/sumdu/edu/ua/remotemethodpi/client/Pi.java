package sumdu.edu.ua.remotemethodpi.client;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 *
 * @author Erlkonig
 */
public class Pi implements Task<BigDecimal>, Serializable{

    @Override
    public BigDecimal execute() {
        String s="3.141592653589793"+"2384626433832795028"+"841971693993751058209"
                +"74944592307816406286"+"208998628034825342117067982"+"14808651328230664709384460955058"
                +"223172535940812848111745"+"028410270193852110555"+"96446229489549303819644288"+"1097566593344612847564823";
       return new BigDecimal(s);
    }
    
}
