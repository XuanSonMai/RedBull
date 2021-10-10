

public class MybinarySearch {


    static int binary(int a[], int key)
    {
        int iLeft = 0;
        int iRight = a.length-1;
        int iMid= (iLeft+iRight)/2;

        while(iLeft<=iRight) // khi L+R thi mid se la vi tri cua L va R va xest mid
        {
           System.out.println("Xet mid o vi tri  "+iMid);
            if(a[iMid]== key)
        {
            return iMid;
        }
          if(key<a[iMid])
          {iRight=iMid-1;}  
          else
          {
              iLeft=iMid+1;
          }
          iMid=(iLeft+iRight)/2;
          
        
        }
        return -1;
        
    }
    static int deQuy( int a[], int key , int L,int R)
    {
        if(L>R)
        {
            return -1;
        }
        int mid = (L+R)/2;
        System.out.println("Mid:  " + mid + "a["+mid+"] la" + a[mid]);
        if(a[mid]== key){
           System.out.println("Mid = key");
           return mid;
        }
        else if(key < a[mid])
        {
            return deQuy(a, key, L, mid-1);
        }
        else
        {
            return deQuy(a, key, mid+1, R);
        }
        
        
    }
    static int deQuy(int a[], int key)
    {
       return deQuy(a,key,0,a.length-1);
    }
    public static void main(String[] args) {
        int a[] = {2,3,4,5};
        System.out.println("Vi tri " + deQuy(a, 5));
        
    }
    
}
