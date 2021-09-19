public class Salesman extends Person {
    public Salesman(int detailnumber, String partdescription, String numberofpurchaseditems, String priceperitem)
    {
        super(detailnumber, partdescription, numberofpurchaseditems, priceperitem);
    }
    void say() {
        System.out.println(super.detailnumber);
        System.out.println(super.partdescription);
        System.out.println(super.numberofpurchaseditems);
        System.out.println(super.priceperitem);
    }
}
