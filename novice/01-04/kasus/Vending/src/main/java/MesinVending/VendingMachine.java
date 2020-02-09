package MesinVending;

import java.util.List;

/**
 * VendingMc
 */
public interface VendingMachine {

    public long selectItemAndGetPrice(Item item);

    public void insertCoin(Coin coin);

    public List<Coin> refund();

    public Bucket<Item, List<Coin>> collectItemAndChange();

    public void reset();

}