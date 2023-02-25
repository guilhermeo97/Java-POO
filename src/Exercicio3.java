public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Cachorro3 lion = new Cachorro3(40f, 2014, "Lion", "Macho", 20f);
        Cachorro3 dalila = new Cachorro3("Vira-lata", 120.0f, 2020, "Dalila", "Fêmea", 20.0f, true);
        dalila.descricaoDoCachorro();
        lion.descricaoDoCachorro();
        
        dalila.calculaIMCC();
        dalila.setName("Marley");
        System.out.println(dalila.getName());
        dalila.sethasVacine(false);
        System.out.println(dalila.gethasVacine());
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

    public void descricaoDoCachorro() {
        System.out.println(
            "Este é um Cachorro(a) da raça " + this.race + ", " + "ele/ela se chama " + this.name + ", e é:" +
            this.sex + ", e tem " + this.age + " anos. " + "Ele/ela pesa: " + this.weight +
             ", altura de:" + this.size + " Vacinação = " + this.hasVacine
        );
    }

    public void calculaIMCC() {
        float IMCC = this.weight / (this.size * this.size);

        if(IMCC <= 18.5) {
            System.out.println("IMCC é igual a " + IMCC + " por isso está abaixo do peso.");
        } else {
            if(IMCC > 18.5 && IMCC <= 25) {
                System.out.println("IMCC é igual a " + IMCC + "  por isso está normal."); 
            } else {
                if(IMCC > 25 && IMCC <= 30){
                    System.out.println("IMCC é igual a " + IMCC + "  por isso está acima do peso");
                } else {
                    if (IMCC > 30) {
                        System.out.println("IMCC é igual a " + IMCC + "  por isso está Obeso.");
                    }
                }
            }
        }
    }


    public void setName(String name) {
        this.name = name; 
    }
    public String getName(){
        return this.name;
    }

    public void sethasVacine(boolean hasVacine) {
        this.hasVacine = hasVacine;
    }
    public boolean gethasVacine(){
        return this.hasVacine;
    }
}

    
