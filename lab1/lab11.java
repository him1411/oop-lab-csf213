class abcd
{
    int x;
    int y;
    private int z;
    static int s = 10;
}

class lab11
{
    public static void main(String argv[])
    {
        abcd var1 = new abcd();
        abcd var2 = new abcd();
        var1.s = 10;
        System.out.println(var1.s);
        System.out.println(var2.s);
}
}