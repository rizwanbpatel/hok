package com.company.collection;

final class Headphone {

    private int id;
    private double price;
    private String brand;
    private String category;

    public Headphone(int id, double price, String brand, String category) {
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Headphone{" +
                "id=" + id +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Headphone)) return false;

        Headphone headphone = (Headphone) o;

        if (id != headphone.id) return false;
        if (Double.compare(headphone.price, price) != 0) return false;
        if (brand != null ? !brand.equals(headphone.brand) : headphone.brand != null) return false;
        return category != null ? category.equals(headphone.category) : headphone.category == null;
    }

    @Override
    public int hashCode() {
//        int result;
//        long temp;
//        result = id;
//        temp = Double.doubleToLongBits(price);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        result = 31 * result + (brand != null ? brand.hashCode() : 0);
//        result = 31 * result + (category != null ? category.hashCode() : 0);
//        return result;
        return 16;
    }
}
