public class Desiciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento=1999;
        boolean incluidoEnElPlan= false;
        double notaDeLaPelicula=8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento>=2022){
            System.out.println("Peliculas más populares");
        }else{
            System.out.println("Peliculas retro que aún vale la pena ver");
        }
        
        if (incluidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfruta de la película");
        }else{
            System.out.println("Por favor, contrata el plan para disfrutar de la película");
        }
    }
}