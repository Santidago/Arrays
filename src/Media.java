public class Media {
    public static void main(String[] args) {
        float total=0;
        float [] media = {5,4,6,6,4,6,5,5,4,6};
        for (int i=0;i<10;i++)
        {
            total= total+media[i];
        }
        total=total/10;
        System.out.println("La media es:"+total);
        System.out.println(media[1]);
    }
}
