public class CombineArrays {
// displays the array
public static void display( int[] a)
{
	for(int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
// returns a new array where b is appended to the end of a
public static int[] append (int[] a , int[] b)
{
int[] newA = new int[a.length+b.length];
for(int i = 0; i < a.length; i++ ) {
	newA[i] = a[i];
}
for(int i = 0; i < b.length; i++) {
	newA[i+(a.length)] = b[i];
}

a = newA;
return a;
}
// returns a new array with alternating values from a and b
public static int[] alternate( int[]a, int[] b)
{
int[] newA = new int[a.length+b.length];
int aIndex = 0;
int bIndex = 0;
int newIndex = 0;
while(aIndex < a.length && bIndex < b.length) {
	newA[newIndex++] = a[aIndex++];
	newA[newIndex++] = b[bIndex++];
}
while(aIndex < a.length) {
	newA[newIndex++] = a[aIndex++];
	}
while( bIndex < b.length) {
	newA[newIndex++] = b[bIndex++];
}
	
a = newA;
return a;
}
//returns an array in reverse order
public static int[] reverse( int[]a)
{
return a;
}
//returns a new ordered array
// prerequisite a and b must be ordered
//do not sort
public static int[] merge( int[]a, int[] b)
{
	int c[] = new int[a.length+b.length];
	int cIndex = 0;
	int aIndex = 0;
	int bIndex = 0;
	while(aIndex < a.length || bIndex < b.length) {
		if(aIndex >= a.length) {
		c[cIndex++] = b[bIndex++];
		} else if( bIndex >= b.length) {
			c[cIndex++] = a[aIndex++];
		} else if(a[aIndex] <= b[bIndex]) {
			c[cIndex] = a[aIndex];
		}
	}
return a;
}
public static void main(String[] args) {
int[] a = new int[]{1,7,13,24,25};
int[] b = new int[] {3,10,21,26};
System.out.println("APPEND");
display(append(a,b));
System.out.println() ;
System.out.println("ALTERNATE");
display(alternate(b,a));
System.out.println() ;
System.out.println("MERGE");
display(merge(b,a));
System.out.println("REVERSE");

}
}
