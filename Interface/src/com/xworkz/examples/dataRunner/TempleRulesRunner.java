package com.xworkz.examples.dataRunner;

import com.xworkz.examples.data.IsckonTemple;
import com.xworkz.examples.data.TempleRules;

public class TempleRulesRunner {
	public static void main(String[] args) {

		TempleRules templeRule = new IsckonTemple();
		templeRule.removeFootwear();
		templeRule.maintainSilence();
		templeRule.dressModestly();
		templeRule.respectTempleTimings();
		templeRule.noPhotography();
		templeRule.noOutsideFood();
		templeRule.noTouchingIdols();
		templeRule.followQueue();
		templeRule.donateRespectfully();
		templeRule.avoidLittering();
	}
}
