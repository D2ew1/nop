package cn.neusoft.retailer.web.pojo;

public class WishDetail {
    private Integer wishDetailId;

    private Integer wishListId;

    private Integer wishGoodsId;

    private Integer wishGoodsAmount;

    private Integer wishGoodsStatus;

    public Integer getWishDetailId() {
        return wishDetailId;
    }

    public void setWishDetailId(Integer wishDetailId) {
        this.wishDetailId = wishDetailId;
    }

    public Integer getWishListId() {
        return wishListId;
    }

    public void setWishListId(Integer wishListId) {
        this.wishListId = wishListId;
    }

    public Integer getWishGoodsId() {
        return wishGoodsId;
    }

    public void setWishGoodsId(Integer wishGoodsId) {
        this.wishGoodsId = wishGoodsId;
    }

    public Integer getWishGoodsAmount() {
        return wishGoodsAmount;
    }

    public void setWishGoodsAmount(Integer wishGoodsAmount) {
        this.wishGoodsAmount = wishGoodsAmount;
    }

    public Integer getWishGoodsStatus() {
        return wishGoodsStatus;
    }

    public void setWishGoodsStatus(Integer wishGoodsStatus) {
        this.wishGoodsStatus = wishGoodsStatus;
    }
}