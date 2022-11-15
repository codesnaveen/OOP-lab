import java.io.*;
class garbagecollector{
public static void main(String a[]){
Runtime r=Runtime.getRuntime();
long mem1,mem2;
Integer someint[]=new Integer[1000];
System.out.println("total memory in"+r.totalMemory());
mem1 =r.freeMemory();
System.out.println("intial free memorey is"+mem1);
r.gc();
mem1=r.freeMemory();
System.out.println("the free memorey after gc collection is "+mem1);
for(int i=0;i<1000;i++){
someint[i]=i;}
mem2=r.freeMemory();
System.out.println("free memory after allocation"+mem2);
System.out.println("memory used by allocation"+(mem1-mem2));
for(int i=0;i<1000;i++){
someint[i]=null;
}
r.gc();
mem2 =r.freeMemory();
System.out.println("free memorey after allocationg discarded integers"+mem2);


}}
