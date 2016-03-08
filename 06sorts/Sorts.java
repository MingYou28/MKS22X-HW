/*public class Sorts {
    public static int[] merge(int[]aryA, int[]aryB){
	int[] ans = new int[aryA.length + aryB.length];
	int i, j, k;
	i = j = k = 0;
	while (i < aryA.length && j < aryB.length){
	    if (aryA[i] <= aryB[j]){
		ans[k] = aryA[i];
		i++;
	    } else {
		ans[k] = aryB[j];
		j++;
	    }
	    k++;
	}
	if (i == aryA.length){
	    while (j < aryB.length){
		ans[k] = aryB[j];
		j++;
		k++;
	    } 
	} else {
	    while (i < aryA.length){
		ans[k] = aryA[i];
		i++;
		k++;
	    }
	}
	return ans;
    }
}

*/

public class Sorts{
    public static int[] merge(int[]aryA, int[]aryB){
	int[] ans = new int[aryA.length + aryB.length];
	int full = aryA.length + aryB.length;
	int _A = 0;
	int _B = 0;
	for(int i = 0;i < full;i ++){
	    if (_A == aryA.length){
		if (_B < aryB.length){
		    ans[i] = aryB[_B];
		    _B +=1;
		  }}
	    else if (_B == aryB.length){
	       if (_A < aryA.length){
		    ans[i] = aryA[_A];
		    _A += 1;}}
	    else if (aryA[_A] < aryB[_B]){
		ans[i] = aryA[_A];
		_A +=1;
	    }else{
		ans[i] = aryB[_B];
		_B += 1;
	    }
	}
	return ans;
    }
}

