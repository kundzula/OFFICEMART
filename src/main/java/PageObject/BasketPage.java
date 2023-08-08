package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
   public SelenideElement
            searchButton=$(byClassName("fas"),1),
     inputField=$(byClassName("form_group")).$(byName("search")),
     chooseProduct=$(byClassName("show_icon")),
    addBasket=$(byText("პროდუქტი წარმატებით დაემატა კალათაში")),
    goToBasket=$(byClassName("cart_info")),
     correctproduct=$(byText("კალამი ბურთულიანი \"შნაიდერი / Schneider\" TOPS ლურჯი")),
    color=$(withText("ლურჯი")),
    code=$(byClassName("item_id")),
    quantity=$(byClassName("inputvalue")),
     price=$(byClassName("prod_price"),0),
     bowl=$(byClassName("fullPriceFor")),
    increasenumber=$(byClassName("fa-plus")),
    decreasenumber=$(byClassName( "fa-minus")),
    raodenoba=$(byValue("1")),
    x=$(byClassName("fa-times")),
    empty=$(byClassName("emptyCart")),
    prodact1=$(byClassName("add_cart"),0),
    prodact2=$(byClassName("add_cart"),1),
    prodact3=$(byClassName("add_cart"),2),
    clearbasket=$(byClassName("clear_btn"),1),
    dasaxeleba=$(byClassName("item_head"),0),
    gagrdzeleba=$(byClassName("continue"));












}
