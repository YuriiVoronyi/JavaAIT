package homework_44;

public class Auto implements Comparable<Auto>{
    private String companyMan;
    private String model;
    private Integer price;

    public Auto(String companyMan, String model, Integer price) {
        this.companyMan = companyMan;
        this.model = model;
        this.price = price;
    }

    public String getCompanyMan() {
        return companyMan;
    }

    public String getModel() {
        return model;
    }

    @Override
    public int compareTo(Auto other) {
        // Сначала сравниваем модели
        int modelComparison = this.model.compareTo(other.model);
        // Если модели различаются, возвращаем результат сравнения моделей
        if (modelComparison != 0) {
            return modelComparison;
        }
        // Если модели одинаковы, сравниваем цены
        return Integer.compare(this.price, other.price);
    }
    @Override
    public String toString() {
        return "{make = " + companyMan + ", model = " + model + ", price " + price + "}";
    }

}
