public class Coffee {

    int money;
    int water;
    int milk;
    int beans;
    int cup;

    public Coffee(int money, int water, int milk, int beans, int cup) {
        this.money = money;
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cup = cup;

    }

    public String toString() {
        return "커피머신의 현재상태입니다 /n [" +
                "돈 = "+money + '|' +
                "물 = "+water + '|' +
                "우유 = "+milk + '|' +
                "원두 = "+beans + '|' +
                "일회용컵 = "+cup + ']';

    }

    public int getMoney() {
        return money;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public int getCup() {
        return cup;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    public void setCup(int cup) {
        this.cup = cup;
    }
}
