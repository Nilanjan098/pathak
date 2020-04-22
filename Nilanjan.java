import java.util.*;

class account
{
	int accno;
	int age;
	int balance;
	int password;

	Scanner input=new Scanner(System.in);

	account(int i,int j,int k,int l)
	{
		accno=i;
		age=j;
		balance=k;
		password=l;	
	

	}

	void withdraw_balance()
	{
	int p,money;
	System.out.println("Please enter your passsword");
	p=input.nextInt();
	
	if(p==password)
	{
		
		System.out.println("Please enter money you want to withdraw");
		money=input.nextInt();
		balance=balance-money;
		System.out.println("your current balance"+balance);
		
	}
	else
	{
		System.out.println("wrong password");
	}
	}
}












class nilanjan
{
	public static void main(String args[])
	{
			

		int flag,choice;
		flag=1;
		int a,b,c,d;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your personal details");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		d=input.nextInt();

	
		account  obj1=new account(a,b,c,d);


		while(flag!=2)
		{
		System.out.println("press 1 for check balance");
		System.out.println("press 2 for withdraw_balance");
		System.out.println("press 3 for deposit_balance");
		System.out.println("press 4 for exit");
		
		
		choice=input.nextInt();

		switch(choice)
		{
			case 1:System.out.println("your balance is ="+obj1.balance);
				break;


			
			case 2:obj1.withdraw_balance();
				break;



			case 3:
			
			case 4:flag=2;
				break;


		}
		}


	}
}
