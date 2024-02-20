public class TypeConversion{
    public static void main(String[] args) {
        double var1=34.98;
        float var2=(float) var1;
        System.out.println("Double to float: " +var2);

        float var3=4.9f;
        int var4=(int) var3;
        System.out.println("float to int: " +var4);

        float var5=34.9f;
        long var6=(long)var5;
        System.out.println("float to long: " +var6);

        long var7=34988383299l;
        int var8=(int)var7;
        System.out.println("long to int: " +var8);

        int var9=78998;
        short var10=(short)var9;
        System.out.println("int to short: " +var10);


    }
}