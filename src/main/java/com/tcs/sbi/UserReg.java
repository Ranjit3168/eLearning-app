package com.tcs.sbi;

import com.bpl.security.PwdSecurityService;

public class UserReg {
          public static void main(String[] args) {
	           PwdSecurityService pss=new PwdSecurityService();
	              String encode= pss.encode("Ranjit");
	              System.out.println(encode);
          }
}
