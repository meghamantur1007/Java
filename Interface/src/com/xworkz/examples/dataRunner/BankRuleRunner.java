package com.xworkz.examples.dataRunner;

import com.xworkz.examples.data.BankRule;
import com.xworkz.examples.data.SBI;

public class BankRuleRunner {

	public static void main(String[] args) {
		BankRule bankRule = new SBI();
		
		bankRule.maintainMinimumBalance();
		bankRule.submitKYC();
		bankRule.followWithdrawalLimits();
		bankRule.respectBankTimings();
		bankRule.noSmoking();
		bankRule.maintainQueue();
		bankRule.avoidMobileUsage();
		bankRule.keepDocumentsReady();
		bankRule.followTransactionLimits();
		bankRule.secureConfidentialInformation();
		bankRule.reportLostCard();
		bankRule.updateContactInformation();
		bankRule.avoidUnnecessaryBankVisits();
		bankRule.useATMResponsibly();
		bankRule.followDigitalSecurityProtocols();
	}

}
