package com.driver;

public class CurrentAccount extends BankAccount{
    String tradeLicenseId; //consists of Uppercase English characters only

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        // minimum balance is 5000 by default. If balance is less than 5000, throw "Insufficient Balance" exception
       super(name,balance,5000);
       this.tradeLicenseId = tradeLicenseId;
    }

    public void validateLicenseId() throws Exception {
        checkValid();
        for(int i=1;i<tradeLicenseId.length();i++){
            char ch1 = tradeLicenseId.charAt(i-1);
            char ch2 = tradeLicenseId.charAt(i);
            if(ch1==ch2)
        }
        // A trade license Id is said to be valid if no two consecutive characters are same
        // If the license Id is valid, do nothing
        // If the characters of the license Id can be rearranged to create any valid license Id
        // If it is not possible, throw "Valid License can not be generated" Exception

    }
    public void checkValid(){
        int frqOfChar[] = new int[26];
        int n = (1+tradeLicenseId.length())/2;
        for(int i=0;i<tradeLicenseId.length();i++){
            char ch = tradeLicenseId.charAt(i);
            int a = frqOfChar[ch-'A']++;
            if(a>n){
                throw new RuntimeException("Valid License can not be generated");
            }
        }
    }

}
