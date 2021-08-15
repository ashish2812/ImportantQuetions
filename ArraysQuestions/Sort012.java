package ArraysQuestions;

public class Sort012 {
    public static void main(String[] args) {

        int a[]={1,2,0,2,1,0,0,2,1};
        sort012(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
    static int [] sort012(int a[]){
        int n=a.length;
        int count0=0,count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)
                count0++;
            else if(a[i]==1)
                count1++;
            else if(a[i]==2)
                count2++;
        }
        int k=0;

        for(int i=0;i<count0;i++) a[k++]=0;
        for(int i=0;i<count1;i++) a[k++]=1;
        for(int i=0;i<count2;i++) a[k++]=2;

        return a;

    }

}
