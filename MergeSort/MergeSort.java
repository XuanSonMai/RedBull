package MergeSort;




public class MergeSort {
public static int[] merge(int a[], int L, int R)
{
    // dieu kien dung
    if(L==R)
    {
        int b[] = {a[R]};
        return b;
    }

    // chia ra 
    int mid = (L+R)/2;
    int c[] = merge(a, L, mid);
    int d[] = merge(a,mid+1, R);
    
    // tron vao
    int [] result = new int[c.length+a.length];
    int irel=0, iC=0,iD=0;
    while(irel < result.length )
    {
        // th1 : mang c va d con phan tu
        while(iC< c.length && iD < d.length)
        {
            if(a[iC] <= a[iD])
            {
                
                result[irel] = a[iC];
                irel++; iC++;
            }
            else 
            {
                  result [irel] = a[iD];
                  irel++;
                  iD++; 
            }
        }
        // 1 trong 2 mang trong
        if(iC<c.length)
        {
            result[irel] = a[iC];
            irel++; iC++;
        }
        else 
        { // neu c da do het thi chi co id chua do het thoi

            result[irel] = a[iD];
            irel++; iD++;
        }
    }
    return result;
}

public static void main(String[] args) {
    int a[] = {3,3,2,1};
    a=merge(a, 0, a.length-1);
    System.out.println("Sau khi sap xep");
    for (int i = 0; i < a.length; i++) {
        System.out.println("a["+i+"]=" +a[i]);
    }
}

    
}
