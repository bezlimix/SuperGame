package SuperGameOnline;

class Stuff {
    private String name;
    private int weight;

    public Stuff(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String toString(){
        return "name: " + this.name + " " + " weight: " + this.weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
