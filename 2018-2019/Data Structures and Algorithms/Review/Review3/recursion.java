public int A(int n)
{
	if (n==0)
		return 0;
	if (n==1)
		return 1;
	if (n>1)
		return A(n-1)-A(n-2)-1;
}

public double A(int n)
{
	if (n==1)
		return 1;
	if (n==2)
		return 3;
	if (n>2)
		return (A(n-1)+A(n-2))/2;
}

public int A(int n, int k)
{
	if (k>n)
		return 0;
	else if ((k==n)|| (k==n))
		return 1;
	else
		return A(n-1,k)+A(n-1,k-1);
}