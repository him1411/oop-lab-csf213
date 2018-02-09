class mystack
{
	int arr[];
	char arr2[];
	int len,top,size;
	mystack(int n)
	{
		size  = n;
		arr = new int[size];
		top = -1;
	}
	void push(int i)
	{

        if(top + 1 < size )
        {
        	top++;
			arr[top] = i;
		}
		else
			System.out.print("Overflow");

        len++ ;
	}
    int pop()
    {
        len-- ;
        top--;
		return arr[top]; 
	}
	void display()
	{

        System.out.println("Stack = ");
		if (len == 0)
		{
			System.out.print("Empty");
			return ;
		}
		for (int i = top; i >= 0; i--)
        {
            System.out.print(arr[i]+" ");
        }
		System.out.println();
	}    
	int compare(mystack s2)
	{
		if (len != s2.len) 
		{
			return -1;	
		}
		else
		{
			int flag = 1;
			for (int i = 0;i<len ;i++ ) 
			{
				if (arr[i] != s2.arr[i]) 
				{
					flag = -1;
					break;
				}	
			}
			if (flag == -1)
				return -1;
			else
				return 1;
		}
	}    
};
class oops42
{
	public static void main(String[] args) 
	{
		mystack st = new mystack(100);
		st.push(1);
		st.push(3);
		st.push(5);
		//st.display();

		mystack st2=  new mystack(10);
		st2.push(1);
		st2.push(3);
		st2.push(5);
		st2.push(6);
		int x= st2.compare(st);
		System.out.println(x);
	}
}