package org.example.google_location;

public class Dashboard
{
    private int purchaseAmount;
    private String website;
    public Dashboard(int purchaseAmount,String website){
        this.purchaseAmount = purchaseAmount;
        this.website = website;
    }
    public Dashboard(){
        this.purchaseAmount = purchaseAmount;
        this.website = website;
    }
    public int getPurchaseAmount(){
        return purchaseAmount;
    }
    public String getWebsite(){
        return website;
    }

    public int setPurchaseAmount(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
        return getPurchaseAmount();
    }

    public String setWebsite(String website) {
        this.website = website;
        return getWebsite();
    }
}
