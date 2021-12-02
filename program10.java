class amity//example of constructor inhertance;

{
	amity()
	{
		System.out.println("amity...non para ...base");
	}
    void func()
    {
        System.out.println("Hello Priyanshu Awasthi ");
    }
    
}
class GLA3 extends amity
{
	GLA3()
	{
		System.out.println("GLA3.. non para cons derived..");
	}
	public static void main(String args[])
	{
		GLA3 obj =new GLA3();
        obj.func();
	}
}