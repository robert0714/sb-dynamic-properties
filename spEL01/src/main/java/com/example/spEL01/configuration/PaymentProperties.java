package com.example.spEL01.configuration;
 
import org.springframework.boot.context.properties.ConfigurationProperties; 
 
@ConfigurationProperties(prefix = "service.payment.spgateway")
public class PaymentProperties {
	
	private String partnerID; 
	
	private boolean isProduction;

	public String getPartnerID() {
		return partnerID;
	}

	public void setPartnerID(String partnerID) {
		this.partnerID = partnerID;
	}

	public boolean getIsProduction() {
		return isProduction;
	}

	public void setIsProduction(boolean isProduction) {
		this.isProduction = isProduction;
	}

}
