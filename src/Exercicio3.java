public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Cachorro3 lion = new Cachorro3(40f, 2014, "Lion", "Macho", 20f);
        Cachorro3 dalila = new Cachorro3("Vira-lata", 60f, 2020, "Dalila", "Fêmea", 20f, true);
        Cachorro3 bob = new Cachorro3("Vira-lata", 60f, 2020, "Fêmea", 20f, true);
        dalila.descricaoDoCachorro();
        lion.descricaoDoCachorro();
        System.out.println(dalila.getIMCC());
        dalila.calculaIMCC();
        System.out.println(dalila.getName());

    }
}

class Cachorro3 {
    private String race;
    private float size;
    private int age;
    private String name;
    private String sex;
    private float weight;
    private boolean hasVacine;
    private float IMCC = weight / (size * size);
    
    public Cachorro3(float size,int age, String name, String sex, float weight) {
        this.name = name;
        this.race = "Vira-lata";;
        this.size = size;
        this.age = 2023 - age;
        this.sex = sex;
        this.weight = weight;
    }

    public Cachorro3(String race, float size, int age, String name, String sex, float weight, boolean hasVacine){
        this.name = name;
        this.race = race;
        this.sex = sex;
        this.weight = weight;
        this.hasVacine = hasVacine;
        this.size = size;
        this.age = 2023 - age;
    }

    public Cachorro3(String race, float size, int age, String sex, float weight, boolean hasVacine){
        this.race = race;
        this.sex = sex;
        this.weight = weight;
        this.hasVacine = hasVacine;
        this.size = size;
        this.age = 2023 - age;
    }

    public void descricaoDoCachorro() {
        System.out.println(
            "Este é um Cachorro(a) da raça " + this.race + ", " + "ele/ela se chama " + this.name + ", e é:" +
            this.sex + ", e tem " + this.age + " anos. " + "Ele/ela pesa: " + this.weight +
             ", altura de:" + this.size + " Vacinação = " + this.hasVacine
        );
    }

    public void setIMCC(){
        this.IMCC = weight / (size * size);
    }
    public float getIMCC() {
        return IMCC;
    }

    public void calculaIMCC() {
        if(IMCC <= 18.5) {
            System.out.println("Abaixo do peso.");
        } else {
            System.out.println("Acima do peso.");
        }
    }

    public void setName() {
        name = "Marley"; 
    }
    public String getName(){
        return this.name;
    }

}

    
