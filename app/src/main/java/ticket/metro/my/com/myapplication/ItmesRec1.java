package ticket.metro.my.com.myapplication;

public class ItmesRec1 {
    String category;
    AdapterRec2 adapterRec2 ;

    public ItmesRec1(String category, AdapterRec2 adapterRec2) {
        this.category = category;
        this.adapterRec2 = adapterRec2;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public AdapterRec2 getAdapterRec2() {
        return adapterRec2;
    }

    public void setAdapterRec2(AdapterRec2 adapterRec2) {
        this.adapterRec2 = adapterRec2;
    }
}
