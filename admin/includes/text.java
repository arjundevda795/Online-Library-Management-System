class text
{

public  static void main(string[],int args)
{
	text p=new text();
	p.start(); 
}
void start()
{
	long [] a1={3,4,5};
	long [] a2=fix(a1);
	system.out.print(a1[0]+a1[1]+a1[2]+" ");
	system.out.print(a2[0]+a2[1]+a2[2]);
}
long [] fix(long [] a3)
{
	a3[1]=7;
	return a3;
}
}