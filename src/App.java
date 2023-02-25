public class App {
    public static void main(String[] args) throws Exception {
        Cachorro rex = new Cachorro("Rex", "Pastor Alemão", "Preto", 65f, 2010);
        Cachorro lassie = new Cachorro("Lassie");
        Cachorro lion = new Cachorro("Lion");
        Cachorro frederico = new Cachorro("Frederico", "Poodle", "branco", 24f, 2006);
        rex.description();
        lassie.description();
        lion.description();
        frederico.description();
        System.out.println("Execução Terminada");
    }
}

class Cachorro {
    
    private String race;
    private float size;
    private String color;
    private int age;
    private String name;
    //private char sex;
    //private float weight;
    //private float thirstMeter;
    //private boolean hasVacine;

    public Cachorro(String name){
        this.name = name;
        this.race = "Vira-lata";
        this.color = "Caramelo";
        this.size = 40f;
        this.age = 2;

    }

    public Cachorro(String name, String race, String color, float size, int birth){
        this.name = name;
        this.race = race;
        this.color = color;
        this.size = size;
        this.age = 2023 - birth;
    }

    public void description(){
        System.out.println("Esse é " + this.name + 
        ", ele é um cachorro da raça " + this.race + 
        " da cor " + this.color + 
        " de porte: " + this.size + 
        " e ele tem " + this.age + " anos.");
    }

}

class Glass{
    private float volume;
    private float liquidVolume;

    public Glass(float volume){
        this.volume = volume;
        this.liquidVolume = 0f;
    }

    public float getLiquidVolume(){
        return liquidVolume;
    }

    public void setLiquidVolume(float liquidVolume){
        if(liquidVolume < 0){
            return;
        }
        if(liquidVolume > this.volume){
            this.liquidVolume = this.volume;
            return;
        }
        this.liquidVolume = liquidVolume;
    }

    public float getVolume(){
        return volume;
    }

    public String description(){
        return ("Volume do copo: " + this.volume + " Volume do liquido: " + this.liquidVolume);
    }
}