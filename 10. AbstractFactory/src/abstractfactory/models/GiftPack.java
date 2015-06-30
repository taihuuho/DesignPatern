/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.models;

import java.util.List;

/**
 *
 * @author 984571
 */
public class GiftPack {

    private List<GiftItem> giftItems;
    private Address shippingAddress;
    private String packType; //"Business", "Adults", or "Kids"

    public List<GiftItem> getGiftItems() {
        return giftItems;
    }

    public void setGiftItems(List<GiftItem> giftItems) {
        this.giftItems = giftItems;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getPackType() {
        return packType;
    }

    public void setPackType(String packType) {
        this.packType = packType;
    }
}
