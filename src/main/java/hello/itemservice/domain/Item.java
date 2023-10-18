package hello.itemservice.domain;

import lombok.Data;

@Data
public class Item {

    private Long id;

    private String noticeId;
    private String companyId;


//    private Integer quantity;


    private String contry;

    private String area;
    private String itemName;
    private Integer price;
    private String notice;
    private String tech;

    public Item() {
    }

    public Item(String itemName, Integer price, String notice, String tech) {
        this.itemName = itemName;
        this.price = price;
//        this.quantity = quantity;
        this.notice = notice;
        this.tech = tech;
    }
}
