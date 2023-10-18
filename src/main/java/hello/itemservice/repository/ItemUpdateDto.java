package hello.itemservice.repository;

import lombok.Data;

@Data
public class ItemUpdateDto {
    private String itemName;
    private Integer price;
    /*private Integer quantity;*/

    private String notice;

    private String tech;
    public ItemUpdateDto() {
    }

    public ItemUpdateDto(String itemName, Integer price, String notice, String tech) {
        this.itemName = itemName;
        this.price = price;
        this.notice = notice;
        this.tech = tech;
    }

}
